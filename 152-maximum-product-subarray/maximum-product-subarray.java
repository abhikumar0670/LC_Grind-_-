class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int maxProduct=nums[0] , minProduct=nums[0] ,res=nums[0];

        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }
            maxProduct=Math.max(nums[i],nums[i]*maxProduct);
            minProduct=Math.min(nums[i],nums[i]*minProduct);
            res=Math.max(res,maxProduct);
        }
        return res;
    }
}