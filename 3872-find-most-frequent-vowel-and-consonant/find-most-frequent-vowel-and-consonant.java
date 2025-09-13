class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int maxVowel=0;
        for(char ch:new char[]{'a','e','i','o','u'}){
            maxVowel=Math.max(maxVowel,freq[ch-'a']);
        }
        int maxCons=0;
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            if(ch!='a'&& ch!='e'&& ch!='i' && ch!='o' &&ch!='u'){
                maxCons=Math.max(maxCons,freq[i]);
            }
        }
        return maxVowel+maxCons;
    }
}