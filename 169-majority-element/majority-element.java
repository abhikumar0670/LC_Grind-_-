class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int cand=0;
        for(int i:nums){
            if(cnt==0){
                cand=i;
            }
            cnt+=(i==cand)?1:-1;
        }
        return cand;
    }
}