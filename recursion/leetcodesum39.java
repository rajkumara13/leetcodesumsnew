class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>list=new ArrayList<>();
        check(list,candidates,new ArrayList<>(),target,0);
        return list;
    }
    public static void check(List<List<Integer>>list,int []nums,List<Integer>temp,int target,int st){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(target<0)return;
        for(int i=st;i<nums.length;i++){
            temp.add(nums[i]);
            check(list,nums,temp,target-nums[i],i);
            temp.remove(temp.size()-1);
        }
    }
}
