public class SorterAdapter implements Sorter {
    public LegacySorter legacySorter;

    public SorterAdapter(LegacySorter legacySorter) {
        this.legacySorter = legacySorter;
    }

    @Override
    public int[] sort(int[] arr) {
        return legacySorter.quickSort(arr);
    }
}
