class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target=countDigits(n);
        for(int i=1;i<1_000_000_000;i<<=1){
            if(target.equals(countDigits(i))){
                return true;
            }
        }
        return false;
    }
    private String countDigits(int num){
        char[] arr=String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}