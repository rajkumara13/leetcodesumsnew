package org.example;
import java.util.*;
class Leetcodesums2{
    public int excelsheetnumfind(String s){  // leetcodesum-number(171)
         int value=0;
         for(int i=0;i<s.length();i++){
             value=value*26+(s.charAt(i)-64);
         }
         return value;
    }
    public int integerbreak(int n){  //sum-number(343)
        if(n==2){
            return 1;
        }
        if(n==3){
            return 4;
        }
        int a=1;
        while(n>4){
            a=a*3;
            n=n-3;
        }
        a=a*n;
        return a;
    }
    public int dividetwointeger(int dividend,int divisor){  // leetcodesum(29)
        if(dividend==Integer.MAX_VALUE && divisor==-1){
            return Integer.MIN_VALUE;
        }
        int c=1;
        if(dividend<0 && divisor>0 || dividend>0 && divisor<0){
            c=-1;
        }
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        int count=0;
        while(a>=b){
            long temp=b;
            long count1=1;
            while(a>=temp+temp){
                temp+=temp;
                count1+=count1;
            }
            a-=temp;
            count+=count1;
        }
        return count*c;
    }
    public int countsetbit(int n) {     // countsetbits sum not leetcode
        if (n == 0) return 0;
        int x = poweroftwo(n);
        int bitstillspower=x*(1<<(x-1));
        int msbcount=n-(1<<x)+1;
        int remainnigcount=n-(1<<x);
        return bitstillspower+msbcount+countsetbit(remainnigcount);
    }
    private int poweroftwo(int n){
        int x=0;
        while(1<<(x+1)<=n){
            x++;
        }
        return x;
    }
    public int reversebinary(int n){
        int value=0;
        for(int i=0;i<32;i++){
            value=value<<1;
            value=value | (n&1);
            n=n>>1;
        }
        return value;
    }
    public int SquaresofSortedArray(int[] nums){ //leetcodesum 977
       for(int i=0;i<nums.length;i++){
           nums[i]=(Math.abs(nums[i]*nums[i]));
       }
       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]>nums[j]){
                   int temp=nums[i];
                   nums[i]=nums[j];
                   nums[j]=temp;
               }
           }
       }
       for(int a:nums){
          System.out.print(a+",");
       }
       return 0;
    }
    public int heightchecker(int [] heights){
        int len=heights.length;
        int [] sort=new int[len];
        int count=0;
        for(int i=0;i<len;i++){
            sort[i]=heights[i];
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(sort[i]>sort[j]){
                    int temp =sort[i];
                    sort[i]=sort[j];
                    sort[j]=temp;
                }
            }
        }
        for(int i=0;i<len;i++){
            if(sort[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
    public int[] twoSum(int[] nums, int target) {    //leetcodesum1
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(map.containsKey(a)){
                return new int[]{map.get(a),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[] {-1,-2};
    }
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }
    public int fib(int n) {
            if(n==0){
                return 0;
            }
            if(n==1)return 1;
            return fib(n-1)+fib(n-2);
        }
    }
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>arr=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            arr.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if(j==0){
                    arr.get(i).add(1);
                }if(j!=0 && j<i && i!=0){
                    arr.get(i).add((arr.get(i-1).get(j))+(arr.get(i-1).get(j+1)));
                }
                if(j!=0){
                    if(j<=i){
                        arr.get(i).add(1);
                    }
                }
            }
        }
        return arr;
    }
}
class Run implements Runnable{
    public void run(){
        System.out.println("RUN"+Thread.currentThread().getName());
    }
}
    class Main{
    public static void main(String[] args) {
      Leetcodesums2 s=new Leetcodesums2();
       System.out.println(s.fib(7));
    }
}