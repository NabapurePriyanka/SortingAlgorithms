public class InsertionSort {
    public void InsertionSort(int[] A){
        int l = A.length;
        for(int i=1; i<l; i++){
            insertInSortedArray(A, i);
        }
        printArray(A);
    }
    public void insertInSortedArray(int[] A, int toInsertIndex){
        int ele = toInsertIndex;
        for(int i=toInsertIndex-1; i>=0; i--){
            if(A[ele] < A[i]){
                int temp = A[i];
                A[i] = A[ele];
                A[ele] = temp;
                ele--;
            }
        }
    }
    public void printArray(int[] A){
        int l = A.length;
        for(int i=0; i<l; i++){
            System.out.print(A[i]+"     ");
        }
    }
}
