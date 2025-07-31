class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trScore=new int[n+1];
        for(int[] t:trust){
        trScore[t[0]]--;
        trScore[t[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(trScore[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}