package org.tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        int max = 0;
        int jumlahMax = 0;

        ArrayList<Integer> nilaiSiswa = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        for(int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Siswa ke " + i + ": ");
            int nilai = input.nextInt();
            nilaiSiswa.add(nilai);

            if(nilai > max) {
                max = nilai;
                jumlahMax = 1;
            }else if(nilai == max) {
                jumlahMax++;
            }
        }

        System.out.println( "ada " + jumlahMax + " orang yang memiliki nilai tertinggi yaitu " + max);
    }
}
