class Solution {
    public int possibleStringCount(String word) {
        List<Integer> groups=new ArrayList<>();
        int n=word.length();
        int i=0;
        while(i<n){
            int j=i;
            while(j<n && word.charAt(j)==word.charAt(i)) j++;
                groups.add(j-i);
                i=j;
            }
            int ans=0;
            for(int g=0;g<groups.size();g++){
                int cnt=1;
                for(int h=0;h<groups.size();h++){
                    if(g==h) cnt*=groups.get(h);
                    else cnt*=1;
                }
                ans+=cnt;
            }
            ans-=(groups.size()-1);
        return ans;
    }
}