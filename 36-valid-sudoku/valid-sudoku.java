class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> s=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c=board[i][j];
                if(c!='.'){
                    String row=c+" in row "+i;
                    String col=c+" in col "+j;
                    String box=c+" in box "+(i/3)+"-"+(j/3);
                    if(!s.add(row)||!s.add(col)||!s.add(box)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}