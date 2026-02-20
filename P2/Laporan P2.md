# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 1 Konsep Dasar Pemrograman

<h4>Nama : Fafirru Hadzami Syach Mashuri<h4>
<h4>NIM : 254107020104<h4>
<h4>Kelas : TI-1E<h4>

## Praktikum Object
Hasil running percobaan 1


## Pertanyaan
1. Sebutkan dua karakteristik class atau object! 
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya! 
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0". 
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut? 
6. Commit dan push kode program ke Github 

## Jawaban
1. Atribut (Attribute/Property)  merupakan data atau variabel yang dimiliki oleh sebuah class/object, yang menggambarkan keadaan atau karakteristik dari object tersebut.
Method (Perilaku/Behavior)  merupakan fungsi atau prosedur yang didefinisikan di dalam class, yang menggambarkan apa yang bisa dilakukan oleh object tersebut.
2. Class Mahasiswa memiliki 4 atribut, yaitu: nim (String), nama (String), kelas (String), dan ipk (double).
3. Class Mahasiswa memiliki 4 method, yaitu: tampilkanInformasi(), ubahKelas(), updateIpk(), dan nilaiKinerja().
4. 
5. Method nilaiKinerja() bekerja dengan cara membaca nilai atribut ipk yang dimiliki object Mahasiswa, kemudian mengevaluasinya menggunakan serangkaian kondisi if else secara berurutan dari atas ke bawah. Kondisi yang pertama terpenuhi akan langsung mengembalikan hasilnya dan menghentikan proses pengecekan berikutnya.