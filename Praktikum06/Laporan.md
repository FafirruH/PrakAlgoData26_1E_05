<h4>Nama : Fafirru Hadzami Syach Mashuri<h4>
<h4>NIM : 254107020104<h4>
<h4>Kelas : TI-1E<h4>

# Praktikum SEARCHING
## Percobaan 1
### Hasil Running Percobaan 1
<img width="227" height="911" alt="Screenshot 2026-04-09 183220" src="https://github.com/user-attachments/assets/8a4fa493-c3ea-4d0c-a458-3d6d61ba9ba8" />

### Pertanyaan
1. Method tampilPosisi berfungsi hanya untuk mengecek dan mencetak letak indeks di mana data (IPK) yang dicari ditemukan di dalam array. Sedangkan method tampilDataSearch berfungsi untuk menampilkan detail seluruh informasi dari objek mahasiswa pada indeks yang telah ditemukan tersebut, meliputi NIM, nama, kelas, dan IPK.
2. Untuk menghentikan proses perulangan for secara langsung sesaat setelah data yang dicari berhasil ditemukan.
3. Untuk menunjukkan lokasi elemen di dalam struktur array.
4. Yang tampil adalah data kemunculan pertama. Begitu ketemu yang pertama, program langsung berhenti (karena ada break).
5. Program akan terus mengecek sampai data paling akhir. Akibatnya, memori posisi akan terus tertimpa dan yang tampil malah data kemunculan yang terakhir.


## Percobaan 2
### Hasil Running Percobaan 2
<img width="178" height="914" alt="image" src="https://github.com/user-attachments/assets/cfcd8592-b95c-489c-a57e-6dc7c5869f0b" />

### Pertanyaan
1. <img width="191" height="43" alt="image" src="https://github.com/user-attachments/assets/9379c60f-0699-4468-b746-8f08cbdb460c" />
2. <img width="405" height="119" alt="image" src="https://github.com/user-attachments/assets/f2018bd7-5d7b-44b0-b011-6cac7068a553" />
3. left: Menyimpan indeks batas paling kiri dari sub-array yang sedang dicari. right: Menyimpan indeks batas paling kanan dari sub-array yang sedang dicari. mid: Menyimpan indeks tengah dari array (titik potong pembagian array berdasarkan left dan right), yang digunakan sebagai titik perbandingan dengan data yang dicari.
4. Program akan tetap berjalan (tidak terjadi error), tetapi hasilnya menjadi tidak valid atau data akan dianggap tidak ditemukan. Alasannya, logika utama binary search bergantung mutlak pada data yang sudah terurut. Algoritma ini harus tahu pasti apakah harus membuang rentang kiri atau rentang kanan saat membandingkan nilai mid dengan nilai yang dicari. Jika acak, arah pencariannya akan salah sasaran.
5. Hasilnya tidak sesuai karena kode di modul dirancang untuk data yang terurut membesar (ascending). Saat array tersusun mengecil (descending), posisi nilai yang lebih besar dan lebih kecil terbalik, sehingga pencarian akan gagal.
6. Binary search mendeteksi bahwa data tidak ada ketika batas pencarian sebelah kiri (left) nilainya sudah melewati batas pencarian sebelah kanan (right), yang berarti rentang area pencarian sudah habis. Pada kode, kondisi ini ditandai ketika perulangan rekursif gagal memenuhi syarat if (right >= left), sehingga ia akan melompat keluar dan mengeksekusi instruksi return -1; (indikasi data tidak ditemukan).
7. <img width="480" height="87" alt="image" src="https://github.com/user-attachments/assets/a1c121bd-6a6d-4227-900c-e4bf8f606922" />
<img width="223" height="102" alt="image" src="https://github.com/user-attachments/assets/76489114-c1c9-407e-bd8c-51526a58fad3" />
<img width="265" height="927" alt="image" src="https://github.com/user-attachments/assets/996cfed5-45a9-4bc9-98ce-143fb353b324" />
