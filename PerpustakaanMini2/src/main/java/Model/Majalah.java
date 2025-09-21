/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Administrator
 */
public class Majalah extends ItemPerpustakaan {
    private int edisi;

    // Constructor Majalah
    public Majalah(String judul, int tahunTerbit, int edisi) {
        super(judul, tahunTerbit);
        this.edisi = edisi;
    }

    // Getter & Setter untuk edisi
    public int getEdisi() {
        return edisi;
    }

    public void setEdisi(int edisi) {
        this.edisi = edisi;
    }

    // Override toString untuk menampilkan data majalah
    @Override
    public String toString() {
        return getJudul() + " | Edisi " + edisi + " | " + getTahunTerbit();
    }
}