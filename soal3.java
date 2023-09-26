package Praktikum3;

import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int barang, cashback, tambahanBarang, jumlah;

        System.out.println("===== Selamat Datang di Toko Charlie===== ");
        System.out.print("Banyak pembelian barang : ");
        barang = input.nextInt();
        System.out.println("=========================================");

        if (barang % 7 == 0) {
            cashback = (barang / 7) * 5500;
            System.out.println("Cashback : Rp." + cashback);
        } else if (barang > 0) {
            System.out.println("Cashback : - ");
        }
        if (barang > 0) {
            if (barang % 3 == 0 || barang >= 3);
            tambahanBarang = barang / 3;
            jumlah = barang + tambahanBarang;
            System.out.println("Tambahan barang : " + tambahanBarang);
            System.out.println("Jumlah barang : " + jumlah);
        } else if (barang > 0) {
            System.out.println("Tambahan barang : - ");
        } else {
            System.out.println("ERROR - Inputan harus lebih dari 0");
        }
    }
}
