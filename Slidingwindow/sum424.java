class Solution {
    public int characterReplacement(String s, int k) {
       int left=0;
       int [] arr=new int[26];
       int max=0;
       int ans=0;
       for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'A']++;
        max=Math.max(max,arr[s.charAt(i)-'A']);
        while(((i-left+1)-max)>k){
            arr[s.charAt(left)-'A']--;
            left++;
        }
        ans=Math.max(ans,i-left+1);
        }
        return ans;
       } 
    }