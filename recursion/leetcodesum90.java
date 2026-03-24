 class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        check(list,new ArrayList<>(),0,nums);
        return list;
    }
    public static void check(List<List<Integer>>list,List<Integer>temp,int start ,int [] nums){
            list.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1])continue;
             temp.add(nums[i]);
             check(list,temp,i+1,nums);
             temp.remove(temp.size()-1);
        }
    }
}
