
package Praktikum3;

import java.util.Scanner;


public class soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hasil, beli, stok, menit, diskon;
        int potongan = (100000 * 5 / 100);
        int semangka = 150;
        int harga = 100000;

        System.out.println("----- Toko Buah A -----");

        System.out.print("Enter jumlah pembelian : ");
        beli = input.nextInt();
        System.out.print("Enter menit : ");
        menit = input.nextInt();

        System.out.println("=========================");
        stok = semangka - beli;

        if (beli < 0 || menit < 0) {
            System.out.println("ERROR - Inputan invalid");
        }
        if (beli > 150) {
            System.out.println("Stok tidak mencukupi");
        } else if (beli > 0 && menit > 0 && menit <= 420) {
            System.out.println("Jumlah pembelian : " + beli);
            System.out.println("Strok tersisa : " + stok);
        }
        if (menit >= 40 && beli > 0 && menit > 0 && menit <= 420) {
            diskon = (menit / 40) * potongan;
            System.out.println("Hasil pembelian : " + (beli * harga - diskon));
        } else if (menit < 40 && menit > 0 && beli > 0 && beli <= 150) {
            System.out.println("Hasil pembelian : " + harga);
        } else if (menit < 420) {
            System.out.println("Toko telah tutup");
        }
    }
}
