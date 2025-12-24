package Rekursif;

import java.util.Scanner;

public class TotalNilai4 {
    // Fungsi Rekursif
    static int totalRekursif(Scanner sc, int n) {
        if (n == 0) {
            return 0; // base case
        } else {
            System.out.print("Masukkan angka ke-" + n + ": ");
            int angka = sc.nextInt();
            return angka + totalRekursif(sc, n - 1);
        }
    }

    // Fungsi Iteratif 
    static int totalIteratif(Scanner sc, int n){
        int total = 0;
        for (int i = n; i >= 1 ; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            total += sc.nextInt();
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        N = sc.nextInt();

        int total = totalIteratif(sc, N);

        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + total);
    }
}
