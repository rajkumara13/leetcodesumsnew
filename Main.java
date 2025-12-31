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
}
    class Main{
    public static void main(String[] args) {
        Leetcodesums2 b1=new Leetcodesums2();
        System.out.println(b1.countsetbit(8));
    }
}