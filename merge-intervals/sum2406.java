class Solution {
    public int minGroups(int[][] intervals) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        pq.add(intervals[0][1]);
        for(int i=1;i<intervals.length;i++){
            int [] curr=intervals[i];
            if(pq.peek()<curr[0]){
                pq.poll();
                pq.add(curr[1]);
            }
            else{
                pq.add(curr[1]);
            }

        }
        return pq.size();
    }
}
