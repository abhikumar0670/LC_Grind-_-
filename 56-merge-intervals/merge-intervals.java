class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        if(n<=1) return intervals;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merge=new ArrayList<>();
        int[] curr=intervals[0];
        for(int i=0;i<n;i++){
            int[] next=intervals[i];
            if(curr[1]>=next[0]){
                curr[1]=Math.max(curr[1],next[1]);
            }else{
                merge.add(curr);
                curr=next;
            }
        }
        merge.add(curr);
        return merge.toArray(new int[merge.size()][]);
    }
}