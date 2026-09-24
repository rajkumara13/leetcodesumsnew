class Solution {
    public int missingNumber(int[] nums) {
      int i=0;
      while(i<nums.length){
        if(nums[i]<nums.length && nums[i]!=nums[nums[i]]){
            int temp=nums[i];
            nums[i]=nums[temp];
            nums[temp]=temp;
        }
        else{
            i++;
        }
      } 
      for(int j=0;j<nums.length;j++){
        if(nums[j]!=j){
            return j;
        }
      }
      return nums.length;   
    }
}
