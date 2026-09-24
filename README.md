# Sistem Manajemen Pertandingan dan Klasemen Liga Basket

## Deskripsi Singkat Program

Program **Sistem Manajemen Pertandingan dan Klasemen Liga Basket** merupakan program berbasis Java yang digunakan untuk mengelola data dalam sebuah liga basket. Program ini memungkinkan pengguna untuk mengelola data tim, pertandingan, hasil pertandingan, dan klasemen.

Program menerapkan konsep **CRUD (Create, Read, Update, Delete)** serta menggunakan `ArrayList` untuk menyimpan data selama program berjalan. Program juga menggunakan beberapa class, yaitu `Tim`, `Pertandingan`, `HasilPertandingan`, dan `Klasemen`.

## Alur Program

Saat program dijalankan, pengguna akan diberikan menu utama yang terdiri dari beberapa pilihan:

<img width="272" height="165" alt="image" src="https://github.com/user-attachments/assets/f553d4cf-f744-40d0-bfa4-858d680d7075" />

1. **Manajemen Data Tim**
   - Menambahkan data tim.
   - Menampilkan data tim.
   - Mengubah data tim.
   - Menghapus data tim.

     <img width="267" height="159" alt="image" src="https://github.com/user-attachments/assets/22e79209-7b98-45e5-9606-19822afb8950" />
     <img width="311" height="441" alt="image" src="https://github.com/user-attachments/assets/c5bff1a3-b32d-45cc-ab75-6528dae75305" />
Pada bagian Manajemen Data Tim pengguna dapat menambahkan Tim sesuai dengan keiinginan user, dalam kasus ini digunakan data-data Tim dari Laga asli yaitu dari NBA. Pengguna dapat menampilkan data tim yang telah ditambahkan sebelumnya, jika belum ada data tim yang tersedia maka output yang akan keluar adalah "Belum ada tim.". Jika pengguna merasa melakukan kesalahan pada proses penambahan data tim pengguna dapat melakukan perubahan pada data tim yang telah ditambahkan sebelumnya. Jika data tim sudah tidak relevan maka pengguna dapat menghapusnya.

2. **Manajemen Pertandingan**
   - Menambahkan data pertandingan.
   - Menampilkan data pertandingan.
   - Mengubah data pertandingan.
   - Menghapus data pertandingan.
  
     <img width="392" height="700" alt="image" src="https://github.com/user-attachments/assets/822bcf61-bc86-4576-a590-a39698e77632" />
Pada bagian Manajemen Pertandingan pengguna dapat Menambahkan data pertandingan dengan memilih Tim yang sebelumnya sudah ditambahkan maksimal 2, jika belum ada tim atau tim belum memenuhi jumlah minimal maka output yang akan dihasilkan adalah "Minimal harus ada 2 tim". Setelah data pertandingan ditambahkan pengguna dapat menampilkan data pertandingan tersebut. Jika pengguna mearasa melakukan kesalahan pada proses penambahan data pertandingan pengguna dapat melakukan perubahan pada data pertandingan yang telah ditambahkan sebelumnya. Jika data pertandingan sudah tidak relevan maka pengguna dapat menghapusnya.

3. **Manajemen Hasil Pertandingan**
   - Menambahkan hasil pertandingan.
   - Menampilkan hasil pertandingan.
   - Mengubah hasil pertandingan.
   - Menghapus hasil pertandingan.
  
     <img width="452" height="629" alt="image" src="https://github.com/user-attachments/assets/88e31acb-23af-45aa-aa0f-f3f4afc4f8e1" />
Pada bagian Manajemen Hasil Pertandingan pengguna dapat menambahkan hasil pertandingan daripada pertandingan yang telah ditambahkan sebelumnya. Setelah menambahkan hasil pertandingan pengguna dapat menampilkannya. Jika pengguna merasa melakukan keasalahan pada proses penambahan hasil pertandingan pengguna dapat melakukan perubahan pada data hasil pertandingan yang telah ditambahkan sebelumnya. Jika hasil pertandingan sudah tidak dibutuhkan maka pengguna dapat menghapusnya.

4. **Manajemen Klasemen**
   - Menambahkan data klasemen.
   - Menampilkan data klasemen.
   - Mengubah data klasemen.
   - Menghapus data klasemen.
  
     <img width="509" height="758" alt="image" src="https://github.com/user-attachments/assets/e538a8e8-a4f3-4103-87a6-e6c8177ac9ea" />
Pada bagian Manajemen Klasemen pengguna dapat menambahkan data klasemen tetapi jika belum ada tim yang ditambahkan maka output yang akan dihasilkan adalah "Belum ada tim". Jika pengguna telah menambahkan seluruh data dari data tim, data pertandingan, dan hasil pertandingan maka pengguna dapat menentukan klasemen untuk tim-tim yang ada. Jika pengguna telah menambahkan data klasemen maka data klasemen tersebut dapat ditampilkan oleh pengguna. Jika pengguna merasa melakukan kesalahan pada proses penambahan data klasemen pengguna dapat melakukan perubahan pada data klasemen tersebut. Jika data klasemen tidak relevan maka pengguna juga dapat menghapusnya.

5. **Keluar**
   - Mengakhiri program.

Pengguna memilih menu dengan memasukkan nomor pilihan melalui `Scanner`. Setiap menu memiliki submenu untuk melakukan proses CRUD. Program menggunakan perulangan sehingga menu akan terus ditampilkan dan dapat digunakan kembali sampai pengguna memilih pilihan **Keluar**.

Data yang dimasukkan pengguna akan disimpan ke dalam `ArrayList` sesuai dengan jenis datanya. Data tim disimpan pada `ArrayList<Tim>`, data pertandingan pada `ArrayList<Pertandingan>`, data hasil pertandingan pada `ArrayList<HasilPertandingan>`, dan data klasemen pada `ArrayList<Klasemen>`.

Encapsulation digunakan pada masing-masing class dengan menerapkan `Access Modifier` dan `Setter` `Getter`. Encapsulation `Setter` `Getter` dapat ditemukan pada class Tim, Pertandingan, Hasil Pertandingan, dan Klasemen. Hal tersebut digunakan penulis untuk digunakan sebagai pintu gerbang resmi dari atribut-atribut yang diterapkan `Access Modifier` yang dimana atribut ditetapkan sebagai `private`.

Overriding dan Overloading diterapkan pada subclass PertandinganLiga dan PertandinganFinal tetapi belum sepenuhnya dimanfaatkan atau diterapkan.
