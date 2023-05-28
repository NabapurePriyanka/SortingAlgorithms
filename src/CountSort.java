import java.util.HashMap;

public class CountSort {
    public void CountSort(int[] A){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<A.length; i++){
            if(A[i] > max){
                max = A[i];
            }
            if(A[i] < min){
                min = A[i];
            }
            if(hm.containsKey(A[i])){
                hm.put(A[i], hm.get(A[i])+1);
            } else{
                hm.put(A[i], 1);
            }
        }
        int k = 0;
        for(int i=0;i<=max;i++){

            if(hm.containsKey(i)){
                int freq = hm.get(i);

                for(int j=0; j<freq; j++){
                    A[k] = i;
                    k++;
                }

            }
        }
        printArray(A);
    }
    public void printArray(int[] A){
        int l = A.length;
        for(int i=0; i<l; i++){
            System.out.print(A[i]+"     ");
        }
    }
}
