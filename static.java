package com.company;
     class Main {
          static int a = 3;
          static int b;

          static void method(int p) {
               System.out.println("p=" + p);
               System.out.println("a=" + a);
               System.out.println("b=" + b);
          }

          static {
               System.out.println("Static block initialized...");
               b = a * 5;
          }

          public static void main(String args[]) {
               method(10);
          }

     }

