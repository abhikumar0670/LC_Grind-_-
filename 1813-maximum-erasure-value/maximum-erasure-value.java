class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        int left=0,right=0,sum=0,maxSum=0;
        while(right<n){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            set.add(nums[right]);
            sum+=nums[right];
            maxSum=Math.max(maxSum,sum);
            right++;
        }
        return maxSum;
    }
}