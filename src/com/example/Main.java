package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqueChar(s));
    }

    public static int firstUniqueChar(String s) {
        for(int i = 0; i < s.length(); ++i){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
        
//        List<String> solution = new ArrayList<>();
//        for(int i = 0; i < s.length(); ++i){
//            solution.add(String.valueOf(s.charAt(i)));
//        }
//        for(int i = 0; i < s.length(); ++i){
//            if(solution.indexOf(String.valueOf(s.charAt(i)))==solution.lastIndexOf(String.valueOf(s.charAt(i)))){
//                return i;
//            }
//        }
//        return -1;
    }
}
