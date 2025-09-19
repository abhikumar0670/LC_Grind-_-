class Spreadsheet {
    private final int rows;
    private final Map<String,Integer> data;

    public Spreadsheet(int rows) {
        this.rows=rows;
        this.data=new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
        data.put(cell,value);
    }
    
    public void resetCell(String cell) {
        data.put(cell,0);
    }
    
    public int getValue(String formula) {
        if(!formula.startsWith("=")){
            return Integer.parseInt(formula);
        }
        String[] parts=formula.substring(1).split("\\+");
        int sum=0;
        
        for(String part:parts){
            sum+=isValidCell(part)?data.getOrDefault(part,0):Integer.parseInt(part);
        }
        return sum;
    }
    
    private boolean isValidCell(String str){
        return str.length()>1 && Character.isLetter(str.charAt(0)) && Character.isDigit(str.charAt(1));
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */