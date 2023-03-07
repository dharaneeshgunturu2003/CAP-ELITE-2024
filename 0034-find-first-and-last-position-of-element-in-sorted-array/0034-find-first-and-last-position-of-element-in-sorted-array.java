class Solution {
    public static int find(int lo,int hi,int[] nums,int target,boolean bias){
            int ind = -1;
            while(lo <= hi){
                int mid = lo + (hi - lo)/2;
                if(nums[mid] > target){
                    hi = mid - 1;
                }
                else if (nums[mid] < target){
                    lo = mid + 1;
                }
                else{
                    ind = mid;
                    if( bias){
                        hi = mid - 1;
                    }
                    else{
                        lo = mid + 1;
                    }
                }
            }
            return ind;
        }
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
		res[0] = find(0,nums.length-1,nums,target,true);
        res[1] = find(0,nums.length-1,nums,target,false);
        
		return res;
        
}
}

