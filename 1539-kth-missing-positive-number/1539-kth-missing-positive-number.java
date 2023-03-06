class Solution {
    public static int binarysearch(int low,int high,int k,int[] arr){
        while(low <= high){
            int mid = high + (low - high)/2;
            if(arr[mid]-(mid+1) >= k){
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return low+k;
    }
    public int findKthPositive(int[] arr, int k) {
        int low = 0,high = arr.length-1;
        return binarysearch(low,high,k,arr);
    }
}