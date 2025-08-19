class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res=0;
        long cnt=0;
        for(int i:nums){
            if(i==0){
                cnt++;
                res+=cnt;
            }else{
                cnt=0;
            }
        }
        return res;
    }
}