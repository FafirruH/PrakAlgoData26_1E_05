# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 1 Konsep Dasar Pemrograman

<h4>Nama : Fafirru Hadzami Syach Mashuri<h4>
<h4>NIM : 254107020104<h4>
<h4>Kelas : TI-1E<h4>

## Praktikum Object
## Percobaan 1
Hasil running percobaan 1

<img width="782" height="119" alt="Screenshot 2026-02-20 133902" src="https://github.com/user-attachments/assets/4ddec9f6-1893-4d16-bf36-ea54414da390" />


## Pertanyaan Percobaan 1
1. Sebutkan dua karakteristik class atau object! 
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya! 
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0". 
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut? 
6. Commit dan push kode program ke Github 

## Jawaban Percobaan 1
1. Atribut (Attribute/Property)  merupakan data atau variabel yang dimiliki oleh sebuah class/object, yang menggambarkan keadaan atau karakteristik dari object tersebut.
Method (Perilaku/Behavior)  merupakan fungsi atau prosedur yang didefinisikan di dalam class, yang menggambarkan apa yang bisa dilakukan oleh object tersebut.
2. Class Mahasiswa memiliki 4 atribut, yaitu: nim (String), nama (String), kelas (String), dan ipk (double).
3. Class Mahasiswa memiliki 4 method, yaitu: tampilkanInformasi(), ubahKelas(), updateIpk(), dan nilaiKinerja().
4. 
<img width="710" height="149" alt="Screenshot 2026-02-20 134057" src="https://github.com/user-attachments/assets/fa283f26-5246-44b3-b283-74933bac8c6a" />

5. Method nilaiKinerja() bekerja dengan cara membaca nilai atribut ipk yang dimiliki object Mahasiswa, kemudian mengevaluasinya menggunakan serangkaian kondisi if else secara berurutan dari atas ke bawah. Kondisi yang pertama terpenuhi akan langsung mengembalikan hasilnya dan menghentikan proses pengecekan berikutnya.

## Percobaan 2
Hasil running percobaan 2

<img width="386" height="207" alt="Screenshot 2026-02-20 135646" src="https://github.com/user-attachments/assets/7593ce2b-5886-4f31-8f09-6604424cf42c" />

## Pertanyaan Percobaan 1
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

## Jawaban Percobaan 1
1. 
<img width="369" height="24" alt="Screenshot 2026-02-20 140113" src="https://github.com/user-attachments/assets/39727680-0de2-4b96-9628-094ff574c72d" />

Nama objectnya adalah mhs1.

2. Cara mengakses atribut dan method dari suatu objek adalah dengan menggunakan operator titik (.) .
3. Method tampilkanInformasi() hanya menampilkan nilai atribut yang ada pada saat itu. Ketika ubahKelas("SI 2K") dan updateIpk(3.60) dipanggil, nilai atribut kelas dan ipk pada object mhs1 berubah. Sehingga saat tampilkanInformasi() dipanggil untuk kedua kalinya, nilai yang ditampilkan adalah nilai atribut yang sudah diperbarui.

## Percobaan 3
hasil running percobaan 3

<img width="413" height="310" alt="image" src="https://github.com/user-attachments/assets/9c630693-9973-4b76-b89c-ea2ce5231a22" />

## Pertanyaan Percobaan 3
1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut?  

<img width="667" height="26" alt="image" src="https://github.com/user-attachments/assets/b0222ae5-9135-4262-92ff-67c0f9ee310c" />

3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!
5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!
6. Commit dan push kode program ke Github

## Jawaban Percobaan 3
1.
<img width="653" height="154" alt="image" src="https://github.com/user-attachments/assets/1ee06d3f-15c5-4103-a47e-37deb3201314" />

2. Baris program tersebut melakukan deklarasi, instansiasi, dan inisialisasi atribut secara sekaligus dalam satu baris. Berbeda dengan menggunakan konstruktor default yang masih memerlukan pengisian atribut satu per satu

3.
<img width="875" height="845" alt="image" src="https://github.com/user-attachments/assets/c0765bac-f2b5-4985-8894-87ea9e2ef492" />

4. Tidak harus berurutan. Method di dalam class Mahasiswa dapat dipanggil dalam urutan mana saja sesuai kebutuhan program, karena setiap method bersifat independen satu sama lain, artinya masing-masing method memiliki tugasnya sendiri dan tidak bergantung pada method lain untuk dapat dijalankan.

5.
<img width="1165" height="86" alt="image" src="https://github.com/user-attachments/assets/f5fb723b-a949-402f-93f2-132d86bc4a5b" />

