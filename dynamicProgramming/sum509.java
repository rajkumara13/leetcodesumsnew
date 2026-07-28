class Solution {
    public int fib(int n) {
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return check(dp,n);
    }
    public int check(int [] dp,int n){
        if(n<=1) return dp[n]=n;
        if(dp[n]!=-1)return dp[n];
        dp[n]=check(dp,n-1)+check(dp,n-2);
        return dp[n];
    }
}