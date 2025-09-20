class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            char[] c=words[i].toCharArray();
            int l=0,r=c.length-1;
            while(l<r){
                char temp=c[l];
                c[l]=c[r];
                c[r]=temp;
                l++;
                r--;
            }
            words[i]=new String(c);
        }
        return String.join(" ",words);
    }
}