class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int i:nums) total+=i;
        if(total%2!=0) return false;
        int tar=total/2;
        boolean[] dp=new boolean[tar+1];
        dp[0]=true;
        for(int i:nums){
            for(int j=tar;j>=i;j--){
                dp[j]=dp[j] || dp[j-i];
            }
        }
        return dp[tar];
    }
}