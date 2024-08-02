package org.tugas;

public class Number4 {
    public static void main(String[] args) {
        int totalDetik = 5440;

        int jam = totalDetik / 3600;
        int sisaDetik = totalDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;

        System.out.println("Jam: " + jam + ", Menit: " + menit + ", Detik: " + detik);
    }
}
