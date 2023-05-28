public class MergeSort {
    public void MergeSort(int[] A){
        mergeSortRecursion(A, 0, A.length-1);
        printArray(A);
    }
    public void mergeSortRecursion(int[] A, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start+end) / 2;
        mergeSortRecursion(A, start, mid);
        mergeSortRecursion(A, mid+1, end);
        merge(A, start, mid, end);
    }
    public void merge(int[] A, int start, int mid, int end){
        int sub1len = mid-start+1;
        int sub2len = end-mid;
        int[] subArray1 = new int[sub1len];
        int[] subArray2 = new int[sub2len];
        // Construct Sub-Array-1
        int index = start;
        for(int i=0; i<sub1len; i++){
            subArray1[i] = A[index++];
        }
        // Construct Sub-Array-2
        index = mid+1;
        for(int i=0; i<sub2len; i++){
            subArray2[i] = A[index++];
        }

        index = start;
        int i=0;
        int j=0;
        while(i<sub1len && j<sub2len){
            if(subArray1[i] > subArray2[j]){
                A[index++] = subArray2[j++];
            } else{
                A[index++] = subArray1[i++];
            }
        }
        while(i<sub1len){
            A[index++] = subArray1[i++];
        }
        while(j<sub2len){
            A[index++] = subArray2[j++];
        }
    }
    public void printArray(int[] A){
        int l = A.length;
        for(int i=0; i<l; i++){
            System.out.print(A[i]+"     ");
        }
    }
}

