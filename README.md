# Post Test 3 - PBO
# Manajemen Perpustakaan Mini (Buku dan Majalah)

# Data diri
Nama : Mochammad Rezky Ramadhan 
NIM : 2409116029 Kelas : A 

# Deskripsi singkat
Program ini adalah pengembangan dari Post Test 2.
Masih bertema Manajemen Perpustakaan Mini, namun kini mendukung item perpustakaan lebih dari satu jenis (Buku dan Majalah) menggunakan konsep inheritance.

Pengguna dapat:
- Menambahkan item baru (buku / majalah) 
- Melihat daftar item 
- Memperbarui data item
- Menghapus item 
- Mencari item berdasarkan judul atau penulis

Fitur yang diterapkan:  
- **ArrayList** untuk menyimpan daftar item perpustakaan.
- **Packages** untuk pemisahan kode:  
  - `main` = entry point & menu utama.  
  - `model` = struktur data (`ItemPerpustakaan`, `Buku`, `Majalah`) 
  - `service` = logika CRUD dan fitur tambahan.  
- **Minimal 3 class** sudah lebih (`Main`, `Buku`, `Majalah`, `ItemPerpustakaan`, `PerpustakaanService`).  
- **Constructor** digunakan di semua class model.  
- **Access modifier** atribut `private`, method `public`.
- **Encapsulation** = semua atribut menggunakan getter & setter.
- **Inheritance:**
  - `ItemPerpustakaan` sebagai **superclass**
  - `Buku` dan `Majalah` sebagai **subclass**
- **Overriding** = method toString() di ``Buku`` dan ``Majalah``.
- **Validasi input angka** agar program tidak error saat salah input.
- **Fitur search** untuk mencari berdasarkan judul (atau penulis khusus Buku).

Program ini juga sudah menerapkan MVC (Model-View-Controller):
- Model ItemPerpustakaan, Buku, Majalah
  - Menyimpan struktur data Buku dan Majalah di ItemPerpustakaan serta menyediakan constructor, getter, dan setter.
- Controller (Service.PerpustakaanService)  
  - Menangani logika CRUD (Create, Read, Update, Delete), validasi input, serta fitur pencarian.  
- View (Main.Main)
  - Berperan sebagai entry point program, menampilkan menu ke pengguna, menerima input, dan memanggil method dari PerpustakaanService. 

## Struktur Package

<img width="233" height="169" alt="{0F3BE585-69EA-494C-ACA7-43BE6CBCF679}" src="https://github.com/user-attachments/assets/0fe0badd-5880-4b6f-ab7a-c84d69f2a9f8" />

---

# Alur program
## 1. Saat dijalankan, program menampilkan menu utama:
      1. Tambah buku
      2. Lihat daftar buku
      3. Update buku
      4. Hapus buku
      5. Cari buku
      6. Keluar
## 2. Penjelasan Menu
1. **Tambah buku**  
   - User pilih jenis (Buku / Majalah).
   - Input data sesuai jenis.
   - Data disimpan di ``ArrayList<ItemPerpustakaan>``.

2. **Lihat daftar item**  
   - Menampilkan semua item.
   - Jika kosong, muncul ``"Belum ada item yang tersimpan."``

3. **Update item**  
   - Pilih nomor item.
   - Jika Buku = update judul, penulis, tahun.
   - Jika Majalah = update judul, tahun, edisi. 

4. **Hapus item**  
   - Pilih nomor item = item dihapus dari list.

5. **Cari item**  
   - Input keyword.
   - Pencarian dilakukan di judul (semua item) + penulis (khusus Buku). 

6. **Keluar**  
   - Program berhenti dengan pesan:  
     ```
     Terima kasih sudah menggunakan sistem perpustakaan mini.
     ```

---

# Nilai Tambah
```
1. Encapsulation:
  Deskripsi: >
    Semua atribut dibuat private dan diakses menggunakan getter & setter.
2. Inheritance:
  Superclass: ItemPerpustakaan
  Subclass:
    - Buku (punya atribut tambahan: penulis)
    - Majalah (punya atribut tambahan: edisi)
3. Overriding:
  Deskripsi: >
    Method toString() di override di Buku dan Majalah
    untuk menampilkan detail masing-masing item.
```



Contoh output:

<img width="260" height="146" alt="{74E1145F-85E2-40B4-B3C4-10435879E1D8}" src="https://github.com/user-attachments/assets/4d17ffec-d30a-489e-a595-a9a826f3f733" />


## Contoh Output
### 1. Tambah item (Buku dan Majalah)

<img width="326" height="273" alt="{999EBBA3-1A44-4CD9-B548-1E4717FD12AF}" src="https://github.com/user-attachments/assets/229a8592-7178-49ac-bde8-cc1936e11d51" />
<img width="315" height="273" alt="{B1D6104D-7762-49DC-9A30-EE6A28B3A12C}" src="https://github.com/user-attachments/assets/36b30d6f-af3a-4a78-8c8e-c88815e7f29d" />

### 2. Lihat item

<img width="309" height="214" alt="{8A605438-F138-42A5-9FB7-D976A5723FD3}" src="https://github.com/user-attachments/assets/8b761c09-a043-4199-85df-19317f70f20d" />

### 3. Update item

<img width="326" height="294" alt="{2B7C291C-1855-4057-9CFD-DCF43F3225BE}" src="https://github.com/user-attachments/assets/77d6a083-5804-412e-a46d-f4db43fe2172" />

### 4. Hapus item

<img width="325" height="259" alt="{CC72B1CA-B243-4EF9-9130-8550CA945114}" src="https://github.com/user-attachments/assets/3463093c-2730-4d4f-a6e7-e8a9ffe4e4c0" />

### 5. Cari item

<img width="314" height="175" alt="{D1020417-B7E7-4BD8-8C57-F18B7EAC99F0}" src="https://github.com/user-attachments/assets/162a878b-52da-4fcc-87cf-36dfd48be3a2" />
