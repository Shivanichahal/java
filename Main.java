package com.company;

public class Main {

    public static void main(String[] args) {
        Float a=Float.parseFloat(args[0]);
        Float b=Float.parseFloat(args[1]);
        Float c=Float.parseFloat(args[2]);
        Float max;
        max=(a>b)?c:b;
        max=(c>max)?c:max;
        System.out.println("the largest number is "+max) ;

    }
}
