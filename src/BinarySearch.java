public class BinarySearch {
    public int BinarySearch(int[] A, int num){
        int low = 0;
        int high = A.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(A[mid] == num){
                return mid;
            } else if(A[mid] < num){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return -1;
    }
}
