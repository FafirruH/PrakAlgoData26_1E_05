# Laporan Praktikum Algoritma dan Struktur Data Jobsheet 1 Konsep Dasar Pemrograman

<h4>Nama : Fafirru Hadzami Syach Mashuri<h4>
<h4>NIM : 254107020104<h4>
<h4>Kelas : TI-1E<h4>

## Percobaan 2.1: Praktikum Pemilihan

Hasil running program Percobaan 2.1

  <img width="311" height="217" alt="Screenshot 2026-02-17 215545" src="https://github.com/user-attachments/assets/56abf292-62ef-4b2c-ac15-9e0513a5f267" />

### Pertanyaan Percobaan 2.1
1. Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai tugas, 20% dari nilai kuis, 30% nilai UTS, dan 40% nilai UAS. Setiap nilai yang dimasukkan mempunyai batas nilai 0 ‐ 100. Ketika pengguna memasukkan di luar rentang tersebut maka akan keluar output “nilai tidak valid”. Ketika nilai akhir sudah didapatkan selanjutnya lakukan konversi nilai dengan ketentuan sebagai berikut: 
  <img width="343" height="176" alt="Screenshot 2026-02-17 220200" src="https://github.com/user-attachments/assets/5d1555e3-736c-4448-917d-bc80aa8d571c" />

  Jika Nilai Huruf yang didapatkan adalah A, B+, B, C+, C maka LULUS, jika nilai huruf D dan E maka TIDAK LULUS. • Input dari program berupa komponen nilai tugas, kuis, UTS, UAS • Otuput dari program “nilai tidak valid” jika nilai yang dimasukkan diluar ketentuan • Output dari program berupa hasil nilai akhir, nilai huruf, dan keterangan LULUS/ TIDAK LULUS

### Jawaban Percobaan 2.1
1. Hasil running program ketika salah satu nilai tidak valid:
<img width="311" height="217" alt="Screenshot 2026-02-17 215545" src="https://github.com/user-attachments/assets/0aca3012-4116-4811-8fa2-d5b0d788c0b7" />

Hasil running program ketika mahasiswa memiliki nilai diatas D:
   
<img width="312" height="248" alt="Screenshot 2026-02-17 215710" src="https://github.com/user-attachments/assets/4bf7a53b-6abd-4a5e-8ded-f814fc3da6a0" />

Hasil running program ketika mahsiswa mendapatkan nilai D / E: 

<img width="295" height="243" alt="Screenshot 2026-02-17 215726" src="https://github.com/user-attachments/assets/ef54544c-573e-40c7-831a-34f9305a1ba8" />




## Percobaan 2.2: Praktikum Perulangan
Hasil running program percobaan 2.2

<img width="818" height="107" alt="Screenshot 2026-02-17 222429" src="https://github.com/user-attachments/assets/66acf669-de66-4ac1-9d1f-c6a7a36104d8" />


### Pertanyaan Percobaan 2.2
1. Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n,  dengan n = 2-digit terakhir NIM Anda. Berikut Adalah ketentuan untuk mencetak deretnya a. Bilangan kelipatan 3 dicetak dengan simbol # b. Bilangan genap selain kelipatan 3 dicetak sesuai angkanya c. Bilangan ganjil dicetak dengan simbol * d. Bilangan 10 dan 15 tidak dicetak *bila n<10 maka tambahkan 10 (n+=10) Contoh 1: Input NIM: 2541720102 maka n=12 Output: * 2 # 4 * # * 8 # * # Contoh 2: Input NIM: 2541720120 maka n=20 Output: * 2 # 4 * # * 8 # * # * 14 16 * # * 20 

### Jawaban Percobaan 2.2
1. Hasil running:

  <img width="312" height="68" alt="Screenshot 2026-02-17 222753" src="https://github.com/user-attachments/assets/65d9d71e-1f38-46de-8943-8cdd522b1a34" />
  <img width="301" height="68" alt="Screenshot 2026-02-17 222759" src="https://github.com/user-attachments/assets/4e0cfd37-d2c6-4a77-a761-dcf43e9edeca" />


## Percobaan 2.3: Praktikum Array

### Pertanyaan Percobaan 2.3
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian? 
2. Jelaskan maksud dari potongan kode berikut! 
if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi! 

### Jawaban Percobaan 2.3
1. Jika mahasiswa menjawab "No", maka program akan langsung mengeksekusi blok else yang berisi pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen". Karena syarat bebas kompen adalah syarat utama atau pertama yang harus dipenuhi. Kalau sudah gagal di awal, maka pemeriksaan log bimbingan menjadi tidak relevan lagi.
2. Potongan kode ini digunakan untuk memeriksa apakah mahasiswa telah memenuhi syarat log bimbingan, yaitu:
Log bimbingan Pembimbing 1 harus minimal 8 kali
Log bimbingan Pembimbing 2 harus minimal 4 kali
Jika kedua syarat ini terpenuhi, maka mahasiswa dianggap telah memenuhi syarat log bimbingan dan boleh mendaftar ujian skripsi.
3. Berikut alur pemeriksaan syarat mahasiswa dari awal sampai akhir:
    1. Mahasiswa ditanya: Apakah sudah bebas kompen?
    2. Jika jawabannya "Ya" (tidak case sensitive, karena pakai equalsIgnoreCase("Ya")):
    3. Maka lanjut ke pemeriksaan log bimbingan:
    Jika bimbinganP1 >= 8 dan bimbinganP2 >= 4 →
    Output: "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi"
    4. Jika bimbinganP1 < 8 dan bimbinganP2 < 4 →
    Output: "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali"
    5. Jika bimbinganP1 < 8 saja →
    Output: "Gagal! Log bimbingan P1 belum mencapai 8 kali"
    6. Jika bimbinganP2 < 4 saja →
    Output: "Gagal! Log bimbingan P2 belum mencapai 4 kali"
    7. Jika jawabannya selain "Ya" (misalnya: "No", "Tidak", dll):
    Maka langsung keluar pesan: "Gagal! Mahasiswa masih memiliki tanggungan kompen."

## Percobaan 2.4: Praktikum Fungsi
Hasil running program percobaan 2.4

<img width="473" height="199" alt="Screenshot 2026-02-17 224514" src="https://github.com/user-attachments/assets/d84bdc21-7830-46de-94b0-109ac1c93492" />

### Pertanyaan Percobaan 2.4
<img width="505" height="294" alt="Screenshot 2026-02-17 224728" src="https://github.com/user-attachments/assets/23e64563-1c9a-4da4-9e5d-f3b0f7a5ec08" />

### Jawaban Percobaan 2.4
1. Fungsi untuk menampilkan pendapatan cabang

  <img width="1106" height="233" alt="Screenshot 2026-02-17 225455" src="https://github.com/user-attachments/assets/41368c90-7590-4bf6-ad83-4b6a7a5bd582" />

2. Tampilan Status tiap cabang berupa (Perlu evaluasi/Sangat Baik)

  <img width="1106" height="233" alt="Screenshot 2026-02-17 225455" src="https://github.com/user-attachments/assets/0e8f5696-6090-404d-9696-288e7959bf52" />


## Tugas 1 
Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array pertama adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array dua dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil. Ilustrasi tampilan array tersebut adalah sebagai berikut: 

<img width="438" height="263" alt="Screenshot 2026-02-17 230119" src="https://github.com/user-attachments/assets/78259d8c-f0ac-463a-b37e-cb986c9d354e" />

Hasil Running Program tugas 1

<img width="315" height="63" alt="Screenshot 2026-02-17 231212" src="https://github.com/user-attachments/assets/cf352348-398d-4ee2-802c-3fef9308f411" />

## Tugas 2 
Sebuah program digunakan untuk menyimpan dan mengelola jadwal kuliah mahasiswa. Data jadwal disimpan dalam array 2 dimensi bertipe string, dengan ketentuan  • Baris menyatakan jadwal ke-i • Kolom menyatakan informasi jadwal: Nama Mata Kuliah, Ruang, Hari Kuliah, , Jam Kuliah. Contoh :  jadwal[0][0] = "Pemrograman Dasar" jadwal[0][1] = "Lab Komputasi 1" jadwal[0][2] = "Senin" jadwal[0][3] = "08.00–10.00" • Jumlah jadwal kuliah sebanyak n, diinputkan oleh pengguna. 
Buatkan fungsi untuk :
1. Menginput data jadwal kuliah ke dalam array 2 dimensi
2. Menampilkan seluruh jadwal kuliah dalam bentuk tabel
3. Menampilkan jadwal kuliah berdasarkan hari tertentu
4. Menampilkan jadwal kuliah berdasarkan nama mata kuliah tertentu 
- Berikut implementasi flowchart soal nomor dua:
  <img width="861" height="933" alt="Screenshot 2025-10-10 135651" src="https://github.com/user-attachments/assets/04040e70-07d8-4d42-b233-0ce874ff89b8" />