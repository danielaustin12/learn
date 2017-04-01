package pemlanNew;

import static pemlanNew.Database.*;
import java.util.Scanner;

public class mainDatabase {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String a[][] = {{"Pegawai 1", "Paijo"},
        {"Pegawai 2", "Lala"},
        {"Pegawai 3", "Lulu"},
        {"Pegawai 4", "Sabar"},
        {"Pegawai 5", "Sule"}};
        int b[][] = {{101, 2000, 1000, 500, 200},
        {102, 1750, 900, 500, 200},
        {103, 2150, 1000, 300, 375},
        {104, 1500, 750, 600, 200},
        {105, 2500, 850, 500, 300}};
        Database d1 = new Database(a[0][0], b[0][0], a[0][1], b[0][1], b[0][2], b[0][3], b[0][4]);
        Database d2 = new Database(a[1][0], b[1][0], a[1][1], b[1][1], b[1][2], b[1][3], b[1][4]);
        Database d3 = new Database(a[2][0], b[2][0], a[2][1], b[2][1], b[2][2], b[2][3], b[2][4]);
        Database d4 = new Database(a[3][0], b[3][0], a[3][1], b[3][1], b[3][2], b[3][3], b[3][4]);
        Database d5 = new Database(a[4][0], b[4][0], a[4][1], b[4][1], b[4][2], b[4][3], b[4][4]);
        System.out.print("Program Data Pegawai\nMenu: \n1. Tampilkan Seluruh Data\n2. Cari Pegawai dengan ID\n3. Cari Pegawai berdasarkan Kategori\n4. Cari Pegawai berdasarkan Kategori dengan Kondisi\n");
        int pilih = 0;
        do {
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = masuk.nextInt();
            switch (pilih) {
                case 1:
                    get();
                    break;
                case 2:
                    System.out.print("Masukkan ID Pegawai : ");
                    int id = masuk.nextInt();
                    get(id);
                    break;
                case 3:
                    System.out.print("Masukkan nama Kolom ( gajiPokok / tunjangan / bonus / denda )\t: ");
                    String kolom = masuk.next();
                    System.out.print("Masukkan Nilai yang ingin dicari\t\t\t\t: ");
                    int nilai = masuk.nextInt();
                    get(kolom, nilai);
                    break;
                case 4:
                    System.out.print("Masukkan nama Kolom ( gajiPokok / tunjangan / bonus / denda )\t: ");
                    kolom = masuk.next();
                    System.out.print("Masukkan Kondisi / Operator ( >/</>=/<= )\t\t\t: ");
                    String op = masuk.next();
                    System.out.print("Masukkan Nilai yang ingin dicari\t\t\t\t: ");
                    nilai = masuk.nextInt();
                    get(kolom, op, nilai);
                    break;
            }
        } while (pilih != 0);
    }
}
