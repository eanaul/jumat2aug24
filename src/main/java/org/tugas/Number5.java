package org.tugas;

public class Number5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++)
        {
            if(i % 2 == 0){
                System.out.println(i + " adalah bilangan genap");
            }else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }
    }
}
