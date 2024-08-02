package org.tugas;

public class Number3 {
    public static void main(String[] args) {
        int jam = 0;
        int menit = 30;
        int detik = 40;

        if(jam != 0){
            int result = jam * 3600 + menit * 60 + detik;
            System.out.println(result + " adalah total detiknya");
        }else if(jam == 0){
            int result = menit * 60 + detik;
            System.out.println(result + " adalah total detiknya");
        }
    }
}
