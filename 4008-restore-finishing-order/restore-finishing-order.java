class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friendSet=new HashSet<>();
        for(int f:friends){
            friendSet.add(f);
        }
        List<Integer> res=new ArrayList<>();
        for(int id:order){
            if(friendSet.contains(id)){
                res.add(id);
            }
        }
        int[] ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}