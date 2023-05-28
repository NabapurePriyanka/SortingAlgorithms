public class InsertionSort {
    public void InsertionSort(int[] A){
        int l = A.length;
        for(int i=1; i<l; i++){
            insertInSortedArray(A, i);
        }
        printArray(A);
    }
    public void insertInSortedArray(int[] A, int toInsertIndex){
        for(int i=toInsertIndex-1; i>=0; i--){
            if(A[i] > A[i+1]){
                int temp = A[i];
                A[i] = A[i+1];
                A[i+1] = temp;
            } else{
                break;
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
