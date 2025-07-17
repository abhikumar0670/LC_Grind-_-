class Solution {
    public int maximumLength(int[] nums, int k) {
        int n=nums.length;
        int[][] dp=new int[n][k];
        int max=1;
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],1);
            for(int j=0;j<i;j++){
                int mod=(nums[j]+nums[i])%k;
                dp[i][mod] = Math.max(dp[i][mod], dp[j][mod] + 1);
                max=Math.max(max,dp[i][mod]);
            }
        }
        return max;
    }
}