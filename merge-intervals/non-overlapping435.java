class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[1]-b[1]));
        int count=0;
        int prev=Integer.MIN_VALUE;
        for(int [] arr:intervals){
            if(arr[0]>=prev){
                prev=arr[1];
            }
            else{
                count++;
            }
        }
        return count;
    }
}
