/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author kidst
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import model.Tim;
import model.Pertandingan;
import model.HasilPertandingan;
import model.Klasemen;
import model.PertandinganFinal;
import model.PertandinganLiga;

public class Main {
    
    public static int inputInt(Scanner input) {
    while (true) {
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka!");
            input.nextLine();
            System.out.print("Masukkan lagi : ");
        }
    }
}

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Tim> listBasket = new ArrayList<>();
        ArrayList<Pertandingan> listMatch = new ArrayList<>();
        ArrayList<HasilPertandingan> listHasil = new ArrayList<>();
        ArrayList<Klasemen> listKlasemen = new ArrayList<>();
        
        Tim tim1 = new Tim(1, "Boston Celtics", "Boston", "Joe Mazzulla");

        Tim tim2 = new Tim(2, "Los Angeles Lakers", "Los Angeles", "JJ Redick");

        listBasket.add(tim1);
        listBasket.add(tim2);
        
        Pertandingan pertandingan1 = new PertandinganLiga(1, "23 Januari 2025", "Crypto.com Arena", "Boston Celtics", "Los Angeles Lakers", "Selesai", 14);

        listMatch.add(pertandingan1);
        
        HasilPertandingan hasil1 = new HasilPertandingan(1, 1, 96, 117, "Los Angeles Lakers");

        listHasil.add(hasil1);
        
        Klasemen klasemen1 = new Klasemen("Boston Celtics", 1, 0, 1, 1);

        Klasemen klasemen2 = new Klasemen("Los Angeles Lakers", 1, 1, 0, 2);

        listKlasemen.add(klasemen1);
        listKlasemen.add(klasemen2);

        int pilihan;

        do {
            System.out.println("\n==== BASKETBALL LEAGUE ====");
            System.out.println("1. Manajemen Data Tim");
            System.out.println("2. Manajemen Pertandingan");
            System.out.println("3. Manajemen Hasil Pertandingan");
            System.out.println("4. Manajemen Klasemen");
            System.out.println("5. Keluar");

            System.out.print("\nPilih salah satu : ");
            pilihan = inputInt(input);
            input.nextLine();

            switch (pilihan) {
                case 1:

                    int pilihanTim;

                    do {
                        System.out.println("\n==== MANAJEMEN DATA TIM ====");
                        System.out.println("1. Tambah Tim");
                        System.out.println("2. Tampilkan Tim");
                        System.out.println("3. Ubah Tim");
                        System.out.println("4. Hapus Tim");
                        System.out.println("5. Kembali");

                        System.out.print("\nPilih : ");
                        pilihanTim = inputInt(input);
                        input.nextLine();

                        switch (pilihanTim) {

                            case 1:
                                System.out.println("\n==== TAMBAH TIM ====");

                                System.out.print("ID Tim   : ");
                                int idTim = inputInt(input);
                                input.nextLine();

                                System.out.print("Nama Tim : ");
                                String namaTim = input.nextLine();

                                System.out.print("Kota     : ");
                                String kota = input.nextLine();

                                System.out.print("Pelatih  : ");
                                String pelatih = input.nextLine();

                                Tim timBaru = new Tim(
                                        idTim,
                                        namaTim,
                                        kota,
                                        pelatih
                                );

                                listBasket.add(timBaru);

                                System.out.println("Tim berhasil ditambahkan.");
                                break;

                            case 2:
                                System.out.println("\n==== LIST TIM ====");

                                if (listBasket.isEmpty()) {
                                    System.out.println("Belum ada tim.");
                                } else {

                                    for (int i = 0; i < listBasket.size(); i++) {

                                        Tim tim = listBasket.get(i);

                                        System.out.println("\nTim ke-" + (i + 1));
                                        System.out.println("ID Tim   : " + tim.getIdTim());
                                        System.out.println("Nama Tim : " + tim.getNamaTim());
                                        System.out.println("Kota     : " + tim.getKota());
                                        System.out.println("Pelatih  : " + tim.getPelatih());
                                    }
                                }
                                break;

                            case 3:
                                if (listBasket.isEmpty()) {

                                    System.out.println("Belum ada tim.");

                                } else {

                                    System.out.println("\n==== LIST TIM ====");

                                    for (int i = 0; i < listBasket.size(); i++) {

                                        Tim tim = listBasket.get(i);

                                        System.out.println(
                                                (i + 1) + ". "
                                                + tim.getNamaTim()
                                        );
                                    }

                                    System.out.print(
                                            "Pilih nomor tim yang mau diubah : "
                                    );

                                    int noTim = inputInt(input);
                                    input.nextLine();

                                    if (noTim >= 1 &&
                                        noTim <= listBasket.size()) {

                                        Tim tim = listBasket.get(noTim - 1);

                                        System.out.print(
                                                "Nama Tim baru : "
                                        );
                                        String namaBaru = input.nextLine();

                                        System.out.print(
                                                "Kota baru : "
                                        );
                                        String kotaBaru = input.nextLine();

                                        System.out.print(
                                                "Pelatih baru : "
                                        );
                                        String pelatihBaru = input.nextLine();

                                        tim.setNamaTim(namaBaru);
                                        tim.setKota(kotaBaru);
                                        tim.setPelatih(pelatihBaru);

                                        System.out.println(
                                                "Data tim berhasil diubah."
                                        );

                                    } else {
                                        System.out.println(
                                                "Nomor tim tidak tersedia."
                                        );
                                    }
                                }
                                break;

                            case 4:
                                if (listBasket.isEmpty()) {

                                    System.out.println("Belum ada tim.");

                                } else {

                                    System.out.println("\n==== LIST TIM ====");

                                    for (int i = 0; i < listBasket.size(); i++) {

                                        System.out.println(
                                                (i + 1) + ". "
                                                + listBasket.get(i).getNamaTim()
                                        );
                                    }

                                    System.out.print(
                                            "Pilih nomor tim yang mau dihapus : "
                                    );

                                    int noTim = inputInt(input);
                                    input.nextLine();

                                    if (noTim >= 1 &&
                                        noTim <= listBasket.size()) {

                                        listBasket.remove(noTim - 1);

                                        System.out.println(
                                                "Tim berhasil dihapus."
                                        );

                                    } else {
                                        System.out.println(
                                                "Nomor tim tidak tersedia."
                                        );
                                    }
                                }
                                break;

                            case 5:
                                System.out.println("Kembali ke menu utama.");
                                break;

                            default:
                                System.out.println(
                                        "Pilihan tidak tersedia."
                                );
                        }

                    } while (pilihanTim != 5);

                    break;

                case 2:

                    int pilihanMatch;

                    do {
                        System.out.println(
                                "\n==== MANAJEMEN PERTANDINGAN ===="
                        );

                        System.out.println("1. Tambah Pertandingan");
                        System.out.println("2. Tampilkan Pertandingan");
                        System.out.println("3. Ubah Pertandingan");
                        System.out.println("4. Hapus Pertandingan");
                        System.out.println("5. Kembali");

                        System.out.print("\nPilih : ");
                        pilihanMatch = inputInt(input);
                        input.nextLine();

                        switch (pilihanMatch) {

                            case 1:

                                if (listBasket.size() < 2) {

                                    System.out.println(
                                            "Minimal harus ada 2 tim "
                                            + "untuk membuat pertandingan."
                                    );

                                } else {

                                    System.out.println(
                                            "\n==== TAMBAH PERTANDINGAN ===="
                                    );

                                    System.out.print(
                                            "ID Pertandingan : "
                                    );
                                    int idPertandingan =
                                            inputInt(input);
                                    input.nextLine();

                                    System.out.print("Tanggal : ");
                                    String tanggal =
                                            input.nextLine();

                                    System.out.print("Lokasi : ");
                                    String lokasi =
                                            input.nextLine();

                                    System.out.println(
                                            "\nDaftar Tim:"
                                    );

                                    for (int i = 0;
                                         i < listBasket.size();
                                         i++) {

                                        System.out.println(
                                                (i + 1) + ". "
                                                + listBasket.get(i)
                                                        .getNamaTim()
                                        );
                                    }

                                    System.out.print(
                                            "Pilih tim kandang : "
                                    );
                                    int pilihKandang =
                                            inputInt(input);
                                    input.nextLine();

                                    System.out.print(
                                            "Pilih tim tandang : "
                                    );
                                    int pilihTandang =
                                            inputInt(input);
                                    input.nextLine();

                                    if (pilihKandang >= 1 &&
                                        pilihKandang <= listBasket.size() &&
                                        pilihTandang >= 1 &&
                                        pilihTandang <= listBasket.size()) {

                                        if (pilihKandang == pilihTandang) {

                                            System.out.println(
                                                    "Tim kandang dan tim "
                                                    + "tandang tidak boleh sama."
                                            );

                                        } else {

                                            String timKandang =
                                                    listBasket
                                                            .get(pilihKandang - 1)
                                                            .getNamaTim();

                                            String timTandang =
                                                    listBasket
                                                            .get(pilihTandang - 1)
                                                            .getNamaTim();

                                            System.out.print(
                                                    "Status pertandingan : "
                                            );
                                            String status =
                                                    input.nextLine();

                                            Pertandingan pertandinganBaru =
                                                    new Pertandingan(
                                                            idPertandingan,
                                                            tanggal,
                                                            lokasi,
                                                            timKandang,
                                                            timTandang,
                                                            status
                                                    );

                                            listMatch.add(
                                                    pertandinganBaru
                                            );
                                            
                                            System.out.println("\nJenis Pertandingan:");
                                            System.out.println("1. Pertandingan Liga");
                                            System.out.println("2. Pertandingan Final");

                                            System.out.print("Pilih jenis : ");
                                            int jenisPertandingan = inputInt(input);
                                            input.nextLine();

                                            if (jenisPertandingan == 1) {

                                                System.out.print("Pekan Liga : ");
                                                int pekan = inputInt(input);
                                                input.nextLine();

                                                pertandinganBaru = new PertandinganLiga(
                                                        idPertandingan,
                                                        tanggal,
                                                        lokasi,
                                                        timKandang,
                                                        timTandang,
                                                        status,
                                                        pekan
                                                );

                                            } else if (jenisPertandingan == 2) {

                                                System.out.print("Babak Final : ");
                                                String babak = input.nextLine();

                                                pertandinganBaru = new PertandinganFinal(
                                                        idPertandingan,
                                                        tanggal,
                                                        lokasi,
                                                        timKandang,
                                                        timTandang,
                                                        status,
                                                        babak
                                                );

                                            } else {

                                                System.out.println("Jenis pertandingan tidak tersedia.");
                                                break;
                                            }

                                            listMatch.add(pertandinganBaru);

                                            System.out.println("Pertandingan berhasil ditambahkan.");

                                            System.out.println(
                                                    "Pertandingan berhasil "
                                                    + "ditambahkan."
                                            );
                                        }

                                    } else {

                                        System.out.println(
                                                "Nomor tim tidak tersedia."
                                        );
                                    }
                                }
                                break;


                            case 2:

                                System.out.println(
                                        "\n==== LIST PERTANDINGAN ===="
                                );

                                if (listMatch.isEmpty()) {

                                    System.out.println(
                                            "Belum ada pertandingan."
                                    );

                                } else {

                                    for (int i = 0;
                                         i < listMatch.size();
                                         i++) {

                                        Pertandingan pertandingan =
                                                listMatch.get(i);

                                        System.out.println(
                                                "\nPertandingan ke-"
                                                + (i + 1)
                                        );

                                        System.out.println(
                                                "ID          : "
                                                + pertandingan
                                                    .getIdPertandingan()
                                        );

                                        System.out.println(
                                                "Tanggal     : "
                                                + pertandingan.getTanggal()
                                        );

                                        System.out.println(
                                                "Lokasi      : "
                                                + pertandingan.getLokasi()
                                        );

                                        System.out.println(
                                                "Kandang     : "
                                                + pertandingan
                                                    .getTimKandang()
                                        );

                                        System.out.println(
                                                "Tandang     : "
                                                + pertandingan
                                                    .getTimTandang()
                                        );

                                        System.out.println(
                                                "Status      : "
                                                + pertandingan.getStatus()
                                        );
                                        
                                        if (pertandingan instanceof PertandinganLiga) {

                                            PertandinganLiga liga =
                                                    (PertandinganLiga) pertandingan;

                                            System.out.println(
                                                    "Jenis       : Pertandingan Liga"
                                            );

                                            System.out.println(
                                                    "Pekan Liga   : " + liga.getPekan()
                                            );

                                        } else if (pertandingan instanceof PertandinganFinal) {

                                            PertandinganFinal finalMatch =
                                                    (PertandinganFinal) pertandingan;

                                            System.out.println(
                                                    "Jenis       : Pertandingan Final"
                                            );

                                            System.out.println(
                                                    "Babak       : " + finalMatch.getBabak()
                                            );
                                        }
                                    }
                                }
                                break;


                            case 3:

                                if (listMatch.isEmpty()) {

                                    System.out.println(
                                            "Belum ada pertandingan."
                                    );

                                } else {

                                    System.out.println(
                                            "\n==== LIST PERTANDINGAN ===="
                                    );

                                    for (int i = 0;
                                         i < listMatch.size();
                                         i++) {

                                        System.out.println(
                                                (i + 1) + ". "
                                                + listMatch.get(i)
                                                    .getTimKandang()
                                                + " vs "
                                                + listMatch.get(i)
                                                    .getTimTandang()
                                        );
                                    }

                                    System.out.print(
                                            "Pilih nomor pertandingan : "
                                    );

                                    int noPertandingan =
                                            inputInt(input);
                                    input.nextLine();

                                    if (noPertandingan >= 1 &&
                                        noPertandingan <= listMatch.size()) {

                                        Pertandingan pertandingan =
                                                listMatch.get(
                                                        noPertandingan - 1
                                                );

                                        System.out.print(
                                                "Tanggal baru : "
                                        );
                                        String tanggalBaru =
                                                input.nextLine();

                                        System.out.print(
                                                "Lokasi baru : "
                                        );
                                        String lokasiBaru =
                                                input.nextLine();

                                        System.out.print(
                                                "Status baru : "
                                        );
                                        String statusBaru =
                                                input.nextLine();

                                        pertandingan.setTanggal(
                                                tanggalBaru
                                        );

                                        pertandingan.setLokasi(
                                                lokasiBaru
                                        );

                                        pertandingan.setStatus(
                                                statusBaru
                                        );

                                        System.out.println(
                                                "Pertandingan berhasil diubah."
                                        );

                                    } else {

                                        System.out.println(
                                                "Nomor pertandingan tidak tersedia."
                                        );
                                    }
                                }
                                break;


                            case 4:

                                if (listMatch.isEmpty()) {

                                    System.out.println(
                                            "Belum ada pertandingan."
                                    );

                                } else {

                                    System.out.println(
                                            "\n==== LIST PERTANDINGAN ===="
                                    );

                                    for (int i = 0;
                                         i < listMatch.size();
                                         i++) {

                                        System.out.println(
                                                (i + 1) + ". "
                                                + listMatch.get(i)
                                                    .getTimKandang()
                                                + " vs "
                                                + listMatch.get(i)
                                                    .getTimTandang()
                                        );
                                    }

                                    System.out.print(
                                            "Pilih nomor pertandingan "
                                            + "yang mau dihapus : "
                                    );

                                    int noPertandingan =
                                            inputInt(input);
                                    input.nextLine();

                                    if (noPertandingan >= 1 &&
                                        noPertandingan <= listMatch.size()) {

                                        listMatch.remove(
                                                noPertandingan - 1
                                        );

                                        System.out.println(
                                                "Pertandingan berhasil dihapus."
                                        );

                                    } else {

                                        System.out.println(
                                                "Nomor pertandingan tidak tersedia."
                                        );
                                    }
                                }
                                break;


                            case 5:
                                System.out.println(
                                        "Kembali ke menu utama."
                                );
                                break;

                            default:
                                System.out.println(
                                        "Pilihan tidak tersedia."
                                );
                        }

                    } while (pilihanMatch != 5);

                    break;
                    
                    
                case 3:

                    int pilihanHasil;

                    do {

                        System.out.println(
                                "\n==== MANAJEMEN HASIL PERTANDINGAN ===="
                        );

                        System.out.println(
                                "1. Tambah Hasil Pertandingan"
                        );

                        System.out.println(
                                "2. Tampilkan Hasil Pertandingan"
                        );

                        System.out.println(
                                "3. Ubah Hasil Pertandingan"
                        );

                        System.out.println(
                                "4. Hapus Hasil Pertandingan"
                        );

                        System.out.println(
                                "5. Kembali"
                        );

                        System.out.print("\nPilih : ");

                        pilihanHasil =
                                inputInt(input);
                        input.nextLine();

                        switch (pilihanHasil) {

                            case 1:

                                if (listMatch.isEmpty()) {

                                    System.out.println(
                                            "Belum ada pertandingan."
                                    );

                                } else {

                                    System.out.println(
                                            "\n==== DAFTAR PERTANDINGAN ===="
                                    );

                                    for (int i = 0;
                                         i < listMatch.size();
                                         i++) {

                                        System.out.println(
                                                (i + 1) + ". "
                                                + listMatch.get(i)
                                                    .getTimKandang()
                                                + " vs "
                                                + listMatch.get(i)
                                                    .getTimTandang()
                                        );
                                    }

                                    System.out.print(
                                            "Pilih pertandingan : "
                                    );

                                    int pilihMatch =
                                            inputInt(input);
                                    input.nextLine();

                                    if (pilihMatch >= 1 &&
                                        pilihMatch <= listMatch.size()) {

                                        Pertandingan pertandingan =
                                                listMatch.get(
                                                        pilihMatch - 1
                                                );

                                        System.out.print(
                                                "ID Hasil : "
                                        );
                                        int idHasil =
                                                inputInt(input);

                                        System.out.print(
                                                "Skor "
                                                + pertandingan
                                                    .getTimKandang()
                                                + " : "
                                        );

                                        int skorKandang =
                                                inputInt(input);

                                        System.out.print(
                                                "Skor "
                                                + pertandingan
                                                    .getTimTandang()
                                                + " : "
                                        );

                                        int skorTandang =
                                                inputInt(input);

                                        input.nextLine();

                                        String pemenang;

                                        if (skorKandang > skorTandang) {

                                            pemenang =
                                                    pertandingan
                                                        .getTimKandang();

                                        } else if (
                                                skorTandang > skorKandang) {

                                            pemenang =
                                                    pertandingan
                                                        .getTimTandang();

                                        } else {

                                            pemenang = "Seri";
                                        }

                                        HasilPertandingan hasilBaru =
                                                new HasilPertandingan(
                                                        idHasil,
                                                        pertandingan
                                                            .getIdPertandingan(),
                                                        skorKandang,
                                                        skorTandang,
                                                        pemenang
                                                );

                                        listHasil.add(hasilBaru);

                                        System.out.println(
                                                "Hasil pertandingan "
                                                + "berhasil ditambahkan."
                                        );

                                    } else {

                                        System.out.println(
                                                "Nomor pertandingan "
                                                + "tidak tersedia."
                                        );
                                    }
                                }
                                break;


                            case 2:

                                if (listHasil.isEmpty()) {

                                    System.out.println(
                                            "Belum ada hasil pertandingan."
                                    );

                                } else {

                                    System.out.println(
                                            "\n==== LIST HASIL PERTANDINGAN ===="
                                    );

                                    for (int i = 0;
                                         i < listHasil.size();
                                         i++) {

                                        HasilPertandingan hasil =
                                                listHasil.get(i);

                                        System.out.println(
                                                "\nHasil ke-" + (i + 1)
                                        );

                                        System.out.println(
                                                "ID Hasil        : "
                                                + hasil.getIdHasil()
                                        );

                                        System.out.println(
                                                "ID Pertandingan : "
                                                + hasil
                                                    .getIdPertandingan()
                                        );

                                        System.out.println(
                                                "Skor Kandang    : "
                                                + hasil
                                                    .getSkorKandang()
                                        );

                                        System.out.println(
                                                "Skor Tandang    : "
                                                + hasil
                                                    .getSkorTandang()
                                        );

                                        System.out.println(
                                                "Pemenang        : "
                                                + hasil.getPemenang()
                                        );
                                    }
                                }
                                break;


                            case 3:

                                if (listHasil.isEmpty()) {

                                    System.out.println(
                                            "Belum ada hasil pertandingan."
                                    );

                                } else {

                                    System.out.println(
                                            "\n==== LIST HASIL ===="
                                    );

                                    for (int i = 0;
                                         i < listHasil.size();
                                         i++) {

                                        System.out.println(
                                                (i + 1)
                                                + ". Pertandingan ID "
                                                + listHasil.get(i)
                                                    .getIdPertandingan()
                                        );
                                    }

                                    System.out.print(
                                            "Pilih nomor hasil : "
                                    );

                                    int noHasil =
                                            inputInt(input);

                                    input.nextLine();

                                    if (noHasil >= 1 &&
                                        noHasil <= listHasil.size()) {

                                        HasilPertandingan hasil =
                                                listHasil.get(
                                                        noHasil - 1
                                                );

                                        System.out.print(
                                                "Skor kandang baru : "
                                        );

                                        int skorKandang =
                                                inputInt(input);

                                        System.out.print(
                                                "Skor tandang baru : "
                                        );

                                        int skorTandang =
                                                inputInt(input);

                                        input.nextLine();

                                        String pemenang;

                                        if (skorKandang > skorTandang) {

                                            pemenang =
                                                    "Tim Kandang";

                                        } else if (
                                                skorTandang > skorKandang) {

                                            pemenang =
                                                    "Tim Tandang";

                                        } else {

                                            pemenang = "Seri";
                                        }

                                        hasil.setSkorKandang(
                                                skorKandang
                                        );

                                        hasil.setSkorTandang(
                                                skorTandang
                                        );

                                        hasil.setPemenang(
                                                pemenang
                                        );

                                        System.out.println(
                                                "Hasil berhasil diubah."
                                        );

                                    } else {

                                        System.out.println(
                                                "Nomor hasil tidak tersedia."
                                        );
                                    }
                                }
                                break;


                            case 4:

                                if (listHasil.isEmpty()) {

                                    System.out.println(
                                            "Belum ada hasil pertandingan."
                                    );

                                } else {

                                    for (int i = 0;
                                         i < listHasil.size();
                                         i++) {

                                        System.out.println(
                                                (i + 1)
                                                + ". Pertandingan ID "
                                                + listHasil.get(i)
                                                    .getIdPertandingan()
                                        );
                                    }

                                    System.out.print(
                                            "Pilih nomor hasil "
                                            + "yang mau dihapus : "
                                    );

                                    int noHasil =
                                            inputInt(input);

                                    input.nextLine();

                                    if (noHasil >= 1 &&
                                        noHasil <= listHasil.size()) {

                                        listHasil.remove(
                                                noHasil - 1
                                        );

                                        System.out.println(
                                                "Hasil pertandingan "
                                                + "berhasil dihapus."
                                        );

                                    } else {

                                        System.out.println(
                                                "Nomor hasil tidak tersedia."
                                        );
                                    }
                                }
                                break;


                            case 5:
                                System.out.println(
                                        "Kembali ke menu utama."
                                );
                                break;

                            default:
                                System.out.println(
                                        "Pilihan tidak tersedia."
                                );
                        }

                    } while (pilihanHasil != 5);

                    break;


                case 4:

                    int pilihanKlasemen;

                    do {

                        System.out.println(
                                "\n==== MANAJEMEN KLASEMEN ===="
                        );

                        System.out.println("1. Tambah Klasemen");
                        System.out.println("2. Tampilkan Klasemen");
                        System.out.println("3. Ubah Klasemen");
                        System.out.println("4. Hapus Klasemen");
                        System.out.println("5. Kembali");

                        System.out.print("\nPilih : ");

                        pilihanKlasemen =
                                inputInt(input);

                        input.nextLine();

                        switch (pilihanKlasemen) {

                            case 1:

                                if (listBasket.isEmpty()) {

                                    System.out.println(
                                            "Belum ada tim."
                                    );

                                } else {

                                    System.out.println(
                                            "\n==== TAMBAH KLASEMEN ===="
                                    );

                                    for (int i = 0;
                                         i < listBasket.size();
                                         i++) {

                                        System.out.println(
                                                (i + 1) + ". "
                                                + listBasket.get(i)
                                                    .getNamaTim()
                                        );
                                    }

                                    System.out.print(
                                            "Pilih tim : "
                                    );

                                    int pilihTim =
                                            inputInt(input);

                                    input.nextLine();

                                    if (pilihTim >= 1 &&
                                        pilihTim <= listBasket.size()) {

                                        String namaTimKlasemen =
                                                listBasket.get(
                                                        pilihTim - 1
                                                ).getNamaTim();

                                        System.out.print(
                                                "Jumlah pertandingan : "
                                        );

                                        int jumlahPertandingan =
                                                inputInt(input);

                                        System.out.print(
                                                "Jumlah menang : "
                                        );

                                        int jumlahMenang =
                                                inputInt(input);

                                        System.out.print(
                                                "Jumlah kalah : "
                                        );

                                        int jumlahKalah =
                                                inputInt(input);

                                        System.out.print(
                                                "Poin : "
                                        );

                                        int poin =
                                                inputInt(input);

                                        input.nextLine();

                                        Klasemen klasemenBaru =
                                                new Klasemen(
                                                        namaTimKlasemen,
                                                        jumlahPertandingan,
                                                        jumlahMenang,
                                                        jumlahKalah,
                                                        poin
                                                );

                                        listKlasemen.add(
                                                klasemenBaru
                                        );

                                        System.out.println(
                                                "Klasemen berhasil ditambahkan."
                                        );

                                    } else {

                                        System.out.println(
                                                "Nomor tim tidak tersedia."
                                        );
                                    }
                                }
                                break;


                            case 2:

                                if (listKlasemen.isEmpty()) {

                                    System.out.println(
                                            "Belum ada data klasemen."
                                    );

                                } else {

                                    System.out.println(
                                            "\n==== LIST KLASEMEN ===="
                                    );

                                    for (int i = 0;
                                         i < listKlasemen.size();
                                         i++) {

                                        Klasemen klasemen =
                                                listKlasemen.get(i);

                                        System.out.println(
                                                "\nTim : "
                                                + klasemen.getTim()
                                        );

                                        System.out.println(
                                                "Pertandingan : "
                                                + klasemen
                                                    .getJumlahPertandingan()
                                        );

                                        System.out.println(
                                                "Menang       : "
                                                + klasemen
                                                    .getJumlahMenang()
                                        );

                                        System.out.println(
                                                "Kalah        : "
                                                + klasemen
                                                    .getJumlahKalah()
                                        );

                                        System.out.println(
                                                "Poin         : "
                                                + klasemen.getPoin()
                                        );
                                    }
                                }
                                break;


                            case 3:

                                if (listKlasemen.isEmpty()) {

                                    System.out.println(
                                            "Belum ada data klasemen."
                                    );

                                } else {

                                    for (int i = 0;
                                         i < listKlasemen.size();
                                         i++) {

                                        System.out.println(
                                                (i + 1) + ". "
                                                + listKlasemen.get(i)
                                                    .getTim()
                                        );
                                    }

                                    System.out.print(
                                            "Pilih nomor klasemen : "
                                    );

                                    int noKlasemen =
                                            inputInt(input);

                                    input.nextLine();

                                    if (noKlasemen >= 1 &&
                                        noKlasemen <= listKlasemen.size()) {

                                        Klasemen klasemen =
                                                listKlasemen.get(
                                                        noKlasemen - 1
                                                );

                                        System.out.print(
                                                "Jumlah pertandingan baru : "
                                        );

                                        int pertandinganBaru =
                                                inputInt(input);

                                        System.out.print(
                                                "Jumlah menang baru : "
                                        );

                                        int menangBaru =
                                                inputInt(input);

                                        System.out.print(
                                                "Jumlah kalah baru : "
                                        );

                                        int kalahBaru =
                                                inputInt(input);

                                        System.out.print(
                                                "Poin baru : "
                                        );

                                        int poinBaru =
                                                inputInt(input);

                                        input.nextLine();

                                        klasemen.setJumlahPertandingan(
                                                pertandinganBaru
                                        );

                                        klasemen.setJumlahMenang(
                                                menangBaru
                                        );

                                        klasemen.setJumlahKalah(
                                                kalahBaru
                                        );

                                        klasemen.setPoin(
                                                poinBaru
                                        );

                                        System.out.println(
                                                "Klasemen berhasil diubah."
                                        );

                                    } else {

                                        System.out.println(
                                                "Nomor klasemen tidak tersedia."
                                        );
                                    }
                                }
                                break;


                            case 4:

                                if (listKlasemen.isEmpty()) {

                                    System.out.println(
                                            "Belum ada data klasemen."
                                    );

                                } else {

                                    for (int i = 0;
                                         i < listKlasemen.size();
                                         i++) {

                                        System.out.println(
                                                (i + 1) + ". "
                                                + listKlasemen.get(i)
                                                    .getTim()
                                        );
                                    }

                                    System.out.print(
                                            "Pilih nomor klasemen "
                                            + "yang mau dihapus : "
                                    );

                                    int noKlasemen =
                                            inputInt(input);

                                    input.nextLine();

                                    if (noKlasemen >= 1 &&
                                        noKlasemen <= listKlasemen.size()) {

                                        listKlasemen.remove(
                                                noKlasemen - 1
                                        );

                                        System.out.println(
                                                "Klasemen berhasil dihapus."
                                        );

                                    } else {

                                        System.out.println(
                                                "Nomor klasemen tidak tersedia."
                                        );
                                    }
                                }
                                break;


                            case 5:
                                System.out.println(
                                        "Kembali ke menu utama."
                                );
                                break;

                            default:
                                System.out.println(
                                        "Pilihan tidak tersedia."
                                );
                        }

                    } while (pilihanKlasemen != 5);

                    break;

                case 5:
                    System.out.println(
                            "\nProgram selesai. Terima kasih!"
                    );
                    break;

                default:
                    System.out.println(
                            "Pilihan tidak tersedia."
                    );
            }

        } while (pilihan != 5);

        input.close();
    }
}