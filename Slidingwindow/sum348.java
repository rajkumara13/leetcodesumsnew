class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length())return new ArrayList<>();
        int [] arr1=new int[26];
        int [] arr2=new int[26];
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<p.length();i++){
            arr1[p.charAt(i)-'a']++;
            arr2[s.charAt(i)-'a']++;
        }
        if(check(arr1,arr2)){
          //  System.out.println("hi");
            res.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            arr2[s.charAt(i-p.length())-'a']--;
            arr2[s.charAt(i)-'a']++;
            if(check(arr1,arr2)){
                res.add(i-p.length()+1);
            }
        }
        return res;
        
        
    }
    public boolean check(int [] arr1,int [] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i])return false;
            
        }
        return true;
    }
}
