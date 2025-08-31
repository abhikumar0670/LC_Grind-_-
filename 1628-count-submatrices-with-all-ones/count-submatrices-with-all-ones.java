class Solution {
    public int numSubmat(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int[][] heights=new int[n][m];
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(mat[i][j]==0) heights[i][j]=0;
                else heights[i][j]=(i==0?1:heights[i-1][j]+1);
            }
        }
        int total=0;
        for(int i=0;i<n;i++){
            total+=countRectangles(heights[i]);
        }
        return total;
    }
    private int countRectangles(int[] heights){
        int m=heights.length;
        int total=0;
        int[] sum=new int[m];
        java.util.Stack<Integer> st=new java.util.Stack<>();
        for(int j=0;j<m;j++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[j]){
                st.pop();
            }
            if(!st.isEmpty()){
                int prev=st.peek();
                sum[j]=sum[prev]+heights[j]*(j-prev);
            }else{
                sum[j]=heights[j]*(j+1);
            }
            st.push(j);
            total+=sum[j];
        } 
        return total;
    }
}