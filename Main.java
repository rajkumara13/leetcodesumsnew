package org.example;
import java.util.*;
class Leetcodesums2{
    public int excelsheetnumfind(String s){
         int value=0;
         for(int i=0;i<s.length();i++){
             value=value*26+(s.charAt(i)-64);
         }
         return value;
    }
}
    class Main{
    public static void main(String[] args) {
        Leetcodesums2 b1=new Leetcodesums2();
        System.out.println(b1.excelsheetnumfind("ABC"));
    }
}