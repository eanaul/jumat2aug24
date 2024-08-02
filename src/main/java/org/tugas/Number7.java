package org.tugas;

import java.util.HashMap;
import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        String[] key = {"MTK", "INDO", "ENG", "DPK", "PABP", "KEHADIRAN"};
        Scanner input = new Scanner(System.in);

        HashMap<String, Integer> siswa1 = new HashMap<>();
        for (int i = 0; i < key.length; i++) {
            System.out.print("Masukan nilai " + key[i] + " siswa ke 1 : ");
            int nilai = input.nextInt();
            siswa1.put(key[i], nilai);
        }

        HashMap<String, Integer> siswa2 = new HashMap<>();
        for (int i = 0; i < key.length; i++) {
            System.out.print("Masukan nilai " + key[i] + " siswa ke 2 : ");
            int nilai = input.nextInt();
            siswa2.put(key[i], nilai);
        }

        HashMap<String, Integer> siswa3 = new HashMap<>();
        for (int i = 0; i < key.length; i++) {
            System.out.print("Masukan nilai " + key[i] + " siswa ke 3 : ");
            int nilai = input.nextInt();
            siswa3.put(key[i], nilai);
        }

        
    }
}
