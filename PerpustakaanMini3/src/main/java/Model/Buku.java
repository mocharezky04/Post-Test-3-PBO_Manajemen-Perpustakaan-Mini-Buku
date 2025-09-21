/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Administrator
 */
public class Buku extends ItemPerpustakaan {
    private String penulis;

    // Constructor Buku
    public Buku(String judul, String penulis, int tahunTerbit) {
        super(judul, tahunTerbit);
        this.penulis = penulis;
    }

    // Getter & Setter untuk penulis
    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    @Override
    public String toString() {
        return getJudul() + " | " + penulis + " | " + getTahunTerbit();
    }
}