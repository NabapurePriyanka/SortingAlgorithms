import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {
    public void QuickSort(int[] A){
        quickSortRecursion(A, 0, A.length-1);
        printArray(A);
    }
    public void quickSortRecursion(int[] A, int start, int end){
        if(start >= end){
            return;
        }
        int index = rearrange(A, start, end);
        quickSortRecursion(A, start, index-1);
        quickSortRecursion(A, index+1, end);

    }
    public int rearrange(int[] A, int start, int end){
        int random = getRandomValue(start, end);
        int tempVal = A[random];
        A[random] = A[start];
        A[start] = tempVal;
        int index = -1;
        int p1 = start+1;
        int p2 = end;
        while(p1<=p2){
            if(A[p1] <= A[start]){
                p1++;
            } else if(A[p2] > A[start]){
                p2--;
            } else{
                int temp = A[p1];
                A[p1] = A[p2];
                A[p2] = temp;
            }
        }
        int temp = A[start];
        A[start] = A[p1-1];
        A[p1-1] = temp;
        return p1-1;
    }
    public void printArray(int[] A){
        int l = A.length;
        for(int i=0; i<l; i++){
            System.out.print(A[i]+"     ");
        }
    }
    public static int getRandomValue(int Min, int Max)
    {

        // Get and return the random integer
        // within Min and Max
        return ThreadLocalRandom
                .current()
                .nextInt(Min, Max + 1);
    }
}
