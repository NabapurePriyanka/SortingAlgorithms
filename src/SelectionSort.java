public class SelectionSort {
    public void SelectionSort(int[] A){
        int l = A.length;
        for(int i=0; i<l; i++){
            // Find the min ele from i to l
            int minIndex = indexOfMin(A, i);
            int temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;
        }

        printArray(A);
    }

    public int indexOfMin(int[] A, int start){
        int index = -1;
        int min = Integer.MAX_VALUE;
        for(int i=start; i<A.length; i++){
            if(A[i] < min){
                min = A[i];
                index = i;
            }
        }
        return index;
    }

    public void printArray(int[] A){
        int l = A.length;
        for(int i=0; i<l; i++){
            System.out.print(A[i]+"     ");
        }
    }
}
