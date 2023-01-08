public class Main {
    public static void main(String[] args) {
        int[] inp = new int[]{1, 100, 10, 99, 3, 0, 10, 1, 2, 5, 4, 3, 2, 1, 0};
        BubbleSort bubbleSortObj = new BubbleSort();
        SelectionSort selectionSortObj = new SelectionSort();
        MergeSort mergeSortObj = new MergeSort();
        InsertionSort insertionSortObj = new InsertionSort();
        QuickSort quickSortObj = new QuickSort();
        CountSort countSortObj = new CountSort();
        countSortObj.CountSort(inp);
//        quickSortObj.QuickSort(inp);
//        insertionSortObj.InsertionSort(inp);
//        mergeSortObj.MergeSort(inp);
    }
}