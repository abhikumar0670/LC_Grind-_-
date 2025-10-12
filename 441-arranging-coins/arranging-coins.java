class Solution {
    public int arrangeCoins(int n) {
        int row=0;
        int i=1;
        while(n>=i){
            n-=i;
            row++;
            i++;
        }
        return row;
    }
}