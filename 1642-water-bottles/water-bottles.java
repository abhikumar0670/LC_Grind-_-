class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        int empties=numBottles;
        while(empties>=numExchange){
            int exchanges=empties/numExchange;
            total+=exchanges;
            empties=(empties%numExchange)+exchanges;
        }
        return total;
    }
}