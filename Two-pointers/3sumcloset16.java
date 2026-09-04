class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
               int sum=nums[i]+nums[low]+nums[high];
               //System.out.println(Math.abs(sum-target)+","+Math.abs(res-target));
               if(Math.abs(sum-target)<Math.abs(res-target)){
                 res=sum;
               }
               else if(sum<target){
                low++;
               }
               else if(sum>target){
                high--;
               }
               else{
                return sum;
               }
                }
        }
        return res;   
    }
}
