import java.util.List;
import java.util.concurrent.Callable;

public class SumTask implements Callable<Integer> {
    private int start, end;
    private List<Integer> list;

    public SumTask(List<Integer> list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += list.get(i);
        }

        return sum;
    }
    
}
