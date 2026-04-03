import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ADAPTER
        System.out.println("a. Adapter");
        int[] nums = { 1, 4, 2, 9, 5, 8, 6 };

        LegacySorter legacySorter = new LegacySorter();
        SorterAdapter sorterAdapter = new SorterAdapter(legacySorter);

        int[] result = sorterAdapter.sort(nums);
        System.out.print("Sorted array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();

        // PROTOTYPE
        System.out.println("b. Prototype");
        List<String> sectors = new ArrayList<>(Arrays.asList("Problem 1", "Problem 2"));
        ReportTemplate originalReport = new ReportTemplate("First report", "Footer 1", sectors);
        ReportTemplate secondReport = originalReport.clone();
        secondReport.setTitle("Second report");

        ReportTemplate thirdReport = originalReport.clone();
        thirdReport.setTitle("Third report");

        System.out.println(originalReport);
        System.out.println(secondReport);
        System.out.println(thirdReport);
    }

}
