class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int i:nums){
            int digits=(int) Math.log10(i)+1;
            if(digits%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}