class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        // for(int i=0;i<=m;i++) dp[0][i]=0;
        // for(int i=0;i<=n;i++) dp[i][0]=0;
        dp[1][1]=1;
        
        //filling
        for(int row=1;row<=m;row++){
            for(int col=1;col<=n;col++){
                if(row==1 && col==1) continue;
                dp[row][col]=dp[row][col-1]+dp[row-1][col];
            }
        }
        return dp[m][n];
    }
}