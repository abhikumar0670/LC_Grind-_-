class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder res=new StringBuilder();
        if((numerator<0)^(denominator<0) && numerator!=0) res.append("-");
        long num=Math.abs((long)numerator);
        long den=Math.abs((long)denominator);
        res.append(num/den);
        long rem=num%den;
        if(rem==0) return res.toString();
        res.append(".");
        Map<Long,Integer> map=new HashMap<>();
        while(rem!=0){
            if(map.containsKey(rem)){
                res.insert(map.get(rem),"(");
                res.append(")");
                break;
            }
            map.put(rem,res.length());
            rem*=10;
            res.append(rem/den);
            rem%=den;
        }
        return res.toString();
    }
}