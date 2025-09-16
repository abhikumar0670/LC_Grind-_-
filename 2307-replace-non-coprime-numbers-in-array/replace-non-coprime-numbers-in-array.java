class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        LinkedList<Integer> st=new LinkedList<>();
        for(int i:nums){
            st.addLast(i);
            while(st.size()>=2){
                int a=st.removeLast();
                int b=st.removeLast();
                int g=gcd(a,b);
                if(g>1){
                    st.addLast(lcm(a,b));
                }else{
                    st.addLast(b);
                    st.addLast(a);
                    break;
                }
            }
        }
        return st;
    }
    private int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    private int lcm(int a,int b){
        return a/gcd(a,b)*b;
    }
}