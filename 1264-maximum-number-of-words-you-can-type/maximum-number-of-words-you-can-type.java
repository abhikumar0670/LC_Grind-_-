class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> broken=new HashSet<>();
        for(char ch:brokenLetters.toCharArray()) broken.add(ch);
        String[] words=text.split(" ");
        int cnt=0;
        outer: for(String word:words){
           for(char ch:word.toCharArray()){
                if(broken.contains(ch)) continue outer;
            }
            cnt++;
        }
        return cnt;
    }
}