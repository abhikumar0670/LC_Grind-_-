class Solution {
    public long flowerGame(int n, int m) {
        long oddX=((long)n+1)/2;
        long evenX=(long)n/2;
        long oddY=((long)m+1)/2;
        long evenY=(long)m/2;
        return oddX*evenY+evenX*oddY;
    }
}