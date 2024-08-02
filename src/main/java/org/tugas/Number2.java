package org.tugas;

public class Number2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 4;

        if(a > b && a < c) {
            System.out.println("a bilangan terbesar");
        }else if(b > a && b < c) {
            System.out.println("b bilangan terbesar");
        }else if(c > a && b < c) {
            System.out.println("c bilangan terbesar");
        }
    }
}