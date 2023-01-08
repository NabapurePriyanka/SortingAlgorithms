public class BubbleSort {
    public void BubbleSort(int[] A){
        int l = A.length;
        for(int i=0; i<l;i++){
            for(int j=0; j<l-i-1; j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        for(int i=0; i<l; i++){
            System.out.print(A[i]+"     ");
        }
    }
}
