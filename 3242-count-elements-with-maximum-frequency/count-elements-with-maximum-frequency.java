class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        int maxFreq=0;
        for(int val:freq.values()){
            if(val>maxFreq) maxFreq=val;
        }
        int cnt=0;
        for(int val:freq.values()){
            if(val==maxFreq) cnt+=maxFreq;
        }
        return cnt;
    }
}