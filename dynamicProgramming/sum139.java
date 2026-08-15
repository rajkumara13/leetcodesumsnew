class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
      //  HashSet<String>set=new HashSet<>();
        int max=0;
        for(String str:wordDict){
            //set.add(str);
            max=Math.max(max,str.length());
        }
        boolean [] dp=new boolean[s.length()+1];
        dp[0]=true;

        for(int i=0;i<=s.length();i++){
            for(int j=i-1;j>=Math.max(0,i-max);j--){
               // System.out.println(s.substring(j,i)+","+j+","+i);
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }
}
