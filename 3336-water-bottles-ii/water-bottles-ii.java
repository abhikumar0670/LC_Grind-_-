class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total=numBottles;
        int empties=numBottles;
        while(empties>=numExchange){
        //     int exchanges=empties/numExchange;
        //     total+=exchanges;
        //     empties=empties-exchanges*numExchange+exchanges;
        //     numExchange+=exchanges;
        // }
        // return total;
        empties-=numExchange;
        total+=1;
        empties+=1;
        numExchange+=1;
        }
        return total;
    }
}