package com.xjf.Zj3;

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int cnt = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        int l = 0;
        int r = -1;
        int numOfA = 0;
        int numOfB = 0;
        int max = 0;
        while(r<length){
            if(numOfA<=cnt||numOfB<=cnt){
                r++;
                if(r==length){
                    max = Math.max(max,r-l);
                    break;
                }
                if(str.charAt(r)=='a'){
                    numOfA++;
                }else{
                    numOfB++;
                }
                if(numOfA<=cnt||numOfB<=cnt){
                    max = Math.max(max,r-l+1);
                }
            }else{
                if(str.charAt(l)=='a'){
                    numOfA--;
                }else{
                    numOfB--;
                }
                l++;
            }
            
        }
        System.out.println(max);
    }
    
}