public class SelectionSort {
    public void SelectionSort(int[] A){
        int l = A.length;
        for(int i=0; i<l; i++){
            int indexMin = indexOfMin(A, i, l-1);
            int temp = A[i];
            A[i] = A[indexMin];
            A[indexMin] = temp;
        }
        printArray(A);
    }
    public int indexOfMin(int[] A, int start, int end){
        int min = Integer.MAX_VALUE;
        int indexMin = -1;
        for(int i=start; i<=end; i++){
            if(A[i] < min){
                min = A[i];
                indexMin = i;
            }
        }
        return indexMin;
    }
    public void printArray(int[] A){
        int l = A.length;
        for(int i=0; i<l; i++){
            System.out.print(A[i]+"     ");
        }
    }
}
