class Solution {
    public int smallestNumber(int n) {
        while(true){
            String binary=Integer.toBinaryString(n);
            if(binary.chars().allMatch(ch-> ch=='1')){
                return n;
            }
            n++;
        }
    }
}