class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        for(int i=0;i+2*k<=n;i++){
            if(isIncreasing(nums,i,i+k-1) && isIncreasing(nums,i+k,i+2*k-1)){
                return true;
            }
        }
        return false;
    }
    private boolean isIncreasing(List<Integer>nums,int l,int r){
        for(int j=l;j<r;j++){
            if(nums.get(j)>=nums.get(j+1)){
                return false;
            }
        }
        return true;
    }
}