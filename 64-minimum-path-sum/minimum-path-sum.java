class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m+1][n+1];
        
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        dp[1][1]=grid[0][0];
        for(int row=1;row<=m;row++){
            for(int col=1;col<=n;col++){
                if(row==1 && col==1) continue;
                dp[row][col]=Math.min(dp[row-1][col],dp[row][col-1])+grid[row-1][col-1];
            }
        }
        return dp[m][n];
    }
}