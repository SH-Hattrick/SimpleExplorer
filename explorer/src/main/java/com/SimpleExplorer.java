package com;

import java.util.ArrayList;
import java.util.List;

public class SimpleExplorer {
    public static int add(int a, int b){
        return a + b;
    }

    public static int minus(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        return a / b;
    }

    public static double power(double a, double b){
        return Math.pow(a, b);
    }

    public static int mod(int a, int b){
        return a % b;
    }

    public static double sqrt(double t){
        return Math.sqrt(t);
    }

    public static int fac(int t){
        int res = 1;
        for(int i=1;i<=t;++i){
            res *= i;
        }
        return res;
    }

    public static int prime(int a, int b){
        int count=0;
        for(int i=a;i<b;i+=2) {
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(i);j++) {
                if(i%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag==true) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }

    public static List<Integer> NumOfCharacters(String toString){
        int abccount=0;
        int spacecount=0;
        int numcount=0;
        int othercount=0;
        char [] ch=toString.toCharArray();

        for(int i=0;i<ch.length;i++) {
            if(Character.isLetter(ch[i])) {
                abccount++;
            }else if(Character.isDigit(ch[i])) {
                numcount++;
            }else if(Character.isSpaceChar(ch[i])){
                spacecount++;
            }else {
                othercount++;
            }
        }
        List<Integer> res = new ArrayList<>();
        res.add(abccount);
        res.add(spacecount);
        res.add(numcount);
        res.add(othercount);
        return res;
    }
}
