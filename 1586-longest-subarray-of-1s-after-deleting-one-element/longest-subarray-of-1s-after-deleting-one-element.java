class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,zeros=0,maxLen=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zeros++;
            }
            while(zeros>1){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            maxLen=Math.max(maxLen,r-left);
        }
        return maxLen;
    }
}