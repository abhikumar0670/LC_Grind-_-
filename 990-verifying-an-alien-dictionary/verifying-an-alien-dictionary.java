class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank=new int[26];
        for(int i=0;i<order.length();i++){
            rank[order.charAt(i)-'a']=i;
        }
        for(int i=0;i<words.length-1;i++){
            if(!inCorrectOrder(words[i],words[i+1],rank)){
                return false;
            }
        }
        return true;
    }
    private boolean inCorrectOrder(String word1,String word2,int[] rank){
        int n=Math.min(word1.length(),word2.length());
        for(int i=0;i<n;i++){
            char c1=word1.charAt(i),c2=word2.charAt(i);
            if(c1!=c2){
                return rank[c1-'a']<rank[c2-'a'];
            }
        }
        return word1.length()<=word2.length();
    }
}