class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int [] res=new int[n];
        for(int i=0;i<n;i++){
            long raw=(long)i+(long) nums[i];
            int nxtIdx=(int)((raw % n+n)%n);
            res[i]=nums[nxtIdx];
        }
        return res;
    }
}