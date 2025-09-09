class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD=1000000007;
        int[] dp=new int[n+1];
        dp[1]=1;
        int cnt=0;
        for(int i=2;i<=n;i++){
            int start=Math.max(i-forget+1,1);
            int end=i-delay;
            for(int j=start;j<=end;j++){
                dp[i]=(dp[i]+dp[j])%MOD;
            }
        }
        int ans=0;
        for(int i=n-forget+1;i<=n;i++){
            if(i>=1) ans=(ans+dp[i])%MOD;
        }
        return ans;
    }
}