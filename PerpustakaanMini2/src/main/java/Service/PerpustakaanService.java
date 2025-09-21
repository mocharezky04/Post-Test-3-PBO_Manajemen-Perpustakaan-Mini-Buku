/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Buku;
import Model.ItemPerpustakaan;
import Model.Majalah;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PerpustakaanService {
    private ArrayList<ItemPerpustakaan> daftarItem = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    // Create
    public void tambahItem() {
        System.out.println("Pilih jenis item:");
        System.out.println("1. Buku");
        System.out.println("2. Majalah");
        System.out.print("Pilihan: ");
        int jenis = validasiAngka();

        input.nextLine();
        if (jenis == 1) {
            // Tambah Buku
            System.out.print("Masukkan judul buku: ");
            String judul = input.nextLine();
            System.out.print("Masukkan penulis buku: ");
            String penulis = input.nextLine();
            System.out.print("Masukkan tahun terbit: ");
            int tahun = validasiAngka();

            daftarItem.add(new Buku(judul, penulis, tahun));
            System.out.println("Buku berhasil ditambahkan");
        } else if (jenis == 2) {
            // Tambah Majalah
            System.out.print("Masukkan judul majalah: ");
            String judul = input.nextLine();
            System.out.print("Masukkan tahun terbit: ");
            int tahun = validasiAngka();
            System.out.print("Masukkan nomor edisi: ");
            int edisi = validasiAngka();

            daftarItem.add(new Majalah(judul, tahun, edisi));
            System.out.println("Majalah berhasil ditambahkan");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    // Read
    public void lihatItem() {
        if (daftarItem.isEmpty()) {
            System.out.println("Belum ada item yang tersimpan.");
        } else {
            System.out.println("\n=== Daftar Item Perpustakaan ===");
            for (int i = 0; i < daftarItem.size(); i++) {
                System.out.println((i + 1) + ". " + daftarItem.get(i));
            }
        }
    }

    // Update
    public void updateItem() {
        lihatItem();
        if (daftarItem.isEmpty()) return;

        System.out.print("Masukkan nomor item yang ingin diupdate: ");
        int idx = validasiAngka();
        if (idx <= 0 || idx > daftarItem.size()) {
            System.out.println("Nomor item tidak ada");
            return;
        }

        ItemPerpustakaan item = daftarItem.get(idx - 1);

        if (item instanceof Buku) {
            input.nextLine();
            System.out.print("Masukkan judul baru: ");
            String judul = input.nextLine();
            System.out.print("Masukkan penulis baru: ");
            String penulis = input.nextLine();
            System.out.print("Masukkan tahun terbit baru: ");
            int tahun = validasiAngka();

            ((Buku) item).setJudul(judul);
            ((Buku) item).setPenulis(penulis);
            ((Buku) item).setTahunTerbit(tahun);

            System.out.println("Buku berhasil diupdate");
        } else if (item instanceof Majalah) {
            input.nextLine();
            System.out.print("Masukkan judul baru: ");
            String judul = input.nextLine();
            System.out.print("Masukkan tahun terbit baru: ");
            int tahun = validasiAngka();
            System.out.print("Masukkan edisi baru: ");
            int edisi = validasiAngka();

            ((Majalah) item).setJudul(judul);
            ((Majalah) item).setTahunTerbit(tahun);
            ((Majalah) item).setEdisi(edisi);

            System.out.println("Majalah berhasil diupdate");
        }
    }

    // Delete
    public void hapusItem() {
        lihatItem();
        if (daftarItem.isEmpty()) return;

        System.out.print("Masukkan nomor item yang ingin dihapus: ");
        int idx = validasiAngka();
        if (idx <= 0 || idx > daftarItem.size()) {
            System.out.println("Nomor item tidak ada");
            return;
        }

        daftarItem.remove(idx - 1);
        System.out.println("Item berhasil dihapus");
    }

    // Search
    public void cariItem() {
        if (daftarItem.isEmpty()) {
            System.out.println("Belum ada item yang tersimpan.");
            return;
        }

        input.nextLine(); // buffer
        System.out.print("Masukkan kata kunci pencarian: ");
        String keyword = input.nextLine().toLowerCase();

        boolean ditemukan = false;
        for (ItemPerpustakaan item : daftarItem) {
            if (item.getJudul().toLowerCase().contains(keyword)) {
                System.out.println(item);
                ditemukan = true;
            } else if (item instanceof Buku && ((Buku) item).getPenulis().toLowerCase().contains(keyword)) {
                System.out.println(item);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Item tidak ditemukan.");
        }
    }

    // Validasi input angka
    private int validasiAngka() {
        while (!input.hasNextInt()) {
            System.out.print("Input harus berupa angka, coba lagi: ");
            input.next();
        }
        return input.nextInt();
    }
}