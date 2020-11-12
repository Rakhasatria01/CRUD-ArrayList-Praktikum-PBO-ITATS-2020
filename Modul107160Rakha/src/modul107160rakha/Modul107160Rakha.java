package modul107160rakha;

import java.util.ArrayList;
import java.util.Scanner;

public class Modul107160Rakha {

    static ArrayList<bioskop> arrBios = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    bioskop bios;
    int menu;
    String film, fnama, lnama, Tanggal, notelp, filmnew;

    public Modul107160Rakha() {

        do {
            System.out.println("Welcome To RPL XXI !!!");
            System.out.println("1. Pembelian ");
            System.out.println("2. List Pembeli ");
            System.out.println("3. Remove List Pembeli ");
            System.out.println("4. Update Data Pembeli ");
            System.out.println("5. EXIT ");
            System.out.print("Pilih Menu ==> ");
            menu = scan.nextInt();
            scan.nextLine();
            if (menu == 1) {
                do {
                    System.out.print("Masukkan Film yang Ingin DiTonton = ");
                    film = scan.nextLine();
                } while (film.length() < 2 || film.length() > 10);
                System.out.print("Masukkan Nama Depan = ");
                fnama = scan.nextLine();
                System.out.print("Masukkan Nama Belakang = ");
                lnama = scan.nextLine();
                System.out.print("Masukkan No Telpon = ");
                notelp = scan.nextLine();
                System.out.print("Masukkan Tanggal = ");
                Tanggal = scan.nextLine();

                bios = new bioskop(film, fnama, lnama, notelp, Tanggal, filmnew);
                arrBios.add(bios);

            } else if (menu == 2) {
                if (arrBios.size() == 0) {
                    System.out.println("Tidak Ada Data!");
                    scan.nextLine();
                } else {
                    viewBios();
                    scan.nextLine();
                }
            } else if (menu == 3) {
                if (arrBios.size() == 0) {
                    System.out.println("Tidak Ada Data!");
                    scan.nextLine();
                } else {
                    viewBios();
                    System.out.print("Insert Nama Depan = ");
                    fnama = scan.nextLine();
                    int index = 0, flag = 0;
                    for (bioskop Bios : arrBios) {
                        if (Bios.getFnama().equals(fnama)) {
                            flag = 1;
                            arrBios.remove(index);
                            break;
                        }
                        index++;
                    }
                    if (flag == 0) {
                        System.out.println("Data Tidak Ditemukan");
                        scan.nextLine();
                    }
                }
            } else if (menu == 4) {
                System.out.print("Masukkan Nama Depan = ");
                fnama = scan.nextLine();
                System.out.print("Masukkan Data Film yang Dirubah = ");
                filmnew = scan.nextLine();
                update(fnama, filmnew);
            }
        } while (menu != 5);

    }

    private int cari(String fnama) {
        int index = -1;
        for (int i = 0; i < arrBios.size(); i++) {
            if (fnama.equals(arrBios.get(i).fnama)) {
                index = i;
            }
        }
        return index;
    }

    public void update(String fnama, String filmnew) {
        if (cari(fnama) != -1) {
            arrBios.get(cari(fnama)).film = filmnew;
        }
    }

    private void viewBios() {
        System.out.println("==>Data Pembeli<==");
        System.out.println("=============");
        for (bioskop Bios : arrBios) {
            System.out.println("Nama    = " + Bios.getFnama() + " " + Bios.getLnama());
            System.out.println("Film    = " + Bios.getFilm());
            System.out.println("No Telp = " + Bios.getNotelp());
            System.out.println("Tanggal = " + Bios.getTanggal());
        }
        System.out.println("=============");
    }

    public static void main(String[] args) {
        new Modul107160Rakha();
    }

}
