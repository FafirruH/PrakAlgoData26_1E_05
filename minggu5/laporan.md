<h4>Nama : Fafirru Hadzami Syach Mashuri<h4>
<h4>NIM : 254107020104<h4>
<h4>Kelas : TI-1E<h4>

# Praktikum BRUTE FORCE DAN DIVIDE CONQUER  
## Percobaan 1
### Hasil Running Percobaan 1

<img width="404" height="110" alt="image" src="https://github.com/user-attachments/assets/64f63ea6-aef2-4ab0-8b3c-e8c99fb86b14" />

### Peratanyaan
1. if (n == 1)
Merupakan base case atau kondisi dasar untuk menghentikan rekursi.
Jika n = 1, maka faktorialnya adalah 1.
else
Merupakan proses rekursif yang memecah masalah menjadi masalah yang lebih kecil.
Program akan menghitung:
2. Bisa menggunakan while

<img width="301" height="197" alt="image" src="https://github.com/user-attachments/assets/6ce4b772-4302-4b55-ab88-809de5280c93" />
<img width="399" height="86" alt="image" src="https://github.com/user-attachments/assets/e5400d6a-a919-42b1-a51b-64905690a9d8" />

3. Perbedaan fakto *= i; dan int fakto = n * faktorialDC(n-1); adalah pada cara perhitungannya. fakto *= i; digunakan pada metode Brute Force dengan perulangan (iterasi) untuk mengalikan nilai secara bertahap. Sedangkan int fakto = n * faktorialDC(n-1); digunakan pada metode Divide and Conquer dengan rekursi, yaitu fungsi memanggil dirinya sendiri hingga mencapai kondisi dasar.
4. Method faktorialBF() menghitung nilai faktorial menggunakan perulangan (iterasi) dengan mengalikan angka dari 1 sampai n secara langsung. Sedangkan method faktorialDC() menghitung faktorial menggunakan rekursi (Divide and Conquer) dengan memecah masalah menjadi perhitungan faktorial yang lebih kecil hingga mencapai kondisi dasar.

## Percobaan 2
### Hasil Running Percobaan 2
<img width="422" height="362" alt="image" src="https://github.com/user-attachments/assets/464bc0e2-c11b-4c46-96ec-7f0057f96f1a" />

### Pertanyaan
1. Method pangkatBF() menghitung nilai pangkat menggunakan perulangan (iterasi) dengan mengalikan nilai bilangan secara berulang sesuai jumlah pangkatnya. Sedangkan method pangkatDC() menghitung nilai pangkat menggunakan rekursi dengan metode Divide and Conquer, yaitu dengan memecah perhitungan pangkat menjadi bagian yang lebih kecil hingga mencapai kondisi dasar.
2. Ya
  <img width="541" height="121" alt="image" src="https://github.com/user-attachments/assets/3f8c93f2-69bc-4a7c-9128-7b62848ffb68" />

3. Method pangkatBF() sebenarnya tidak harus memiliki parameter, karena pada class Pangkat sudah terdapat atribut nilai dan pangkat. Method tersebut tetap dapat bekerja dengan menggunakan atribut yang sudah ada di dalam class. Oleh karena itu, method pangkatBF() bisa dibuat tanpa parameter dengan langsung menggunakan atribut nilai dan pangkat
<img width="353" height="149" alt="image" src="https://github.com/user-attachments/assets/d026bc1e-0151-435e-81d8-1c080d13097f" />
<img width="422" height="362" alt="image" src="https://github.com/user-attachments/assets/464bc0e2-c11b-4c46-96ec-7f0057f96f1a" />

4. Method pangkatBF() menghitung nilai pangkat menggunakan perulangan (iterasi) dengan mengalikan nilai bilangan secara berulang sesuai jumlah pangkatnya. Sedangkan method pangkatDC() menghitung nilai pangkat menggunakan rekursi dengan metode Divide and Conquer, yaitu dengan membagi perhitungan pangkat menjadi bagian yang lebih kecil kemudian menggabungkan hasilnya kembali untuk mendapatkan hasil akhir.

## Percobaan 3
### Hasil Running Percobaan 3
<img width="523" height="227" alt="image" src="https://github.com/user-attachments/assets/6b2b8501-5c01-408e-b65e-06575ba13c54" />

### Pertanyaan
1. Variabel mid pada method TotalDC() digunakan untuk membagi array menjadi dua bagian pada proses Divide and Conquer. Nilai mid menentukan titik tengah antara indeks kiri (l) dan indeks kanan (r) sehingga data dapat diproses menjadi dua submasalah.
2. Method TotalDC() memiliki parameter l dan r karena digunakan untuk menentukan batas kiri dan batas kanan dari array yang sedang diproses. Parameter tersebut diperlukan agar metode Divide and Conquer dapat membagi data menjadi beberapa bagian yang lebih kecil, kemudian menghitung total masing-masing bagian secara rekursif hingga mencapai kondisi dasar. Setelah itu, hasil dari tiap bagian dijumlahkan kembali untuk mendapatkan total keseluruhan.
3. Penjumlahan lsum dan rsum diperlukan untuk menggabungkan hasil perhitungan dari dua bagian array yang telah dibagi pada metode Divide and Conquer. lsum merupakan jumlah dari bagian kiri array, sedangkan rsum merupakan jumlah dari bagian kanan array. Dengan menjumlahkan keduanya, diperoleh total keseluruhan nilai dalam array.
4. Base case dari method TotalDC() adalah kondisi ketika indeks kiri sama dengan indeks kanan (l == r). Pada kondisi ini berarti hanya terdapat satu elemen array yang diproses, sehingga method langsung mengembalikan nilai elemen tersebut tanpa melakukan pembagian lagi. Kondisi ini digunakan untuk menghentikan proses rekursi.
5. Method totalDC() bekerja dengan menggunakan metode Divide and Conquer, yaitu dengan membagi array menjadi dua bagian yang lebih kecil secara rekursif hingga mencapai base case (satu elemen). Setelah itu, hasil dari bagian kiri dan kanan dijumlahkan kembali sehingga diperoleh total seluruh elemen dalam array.


### Tugas

<img width="813" height="363" alt="image" src="https://github.com/user-attachments/assets/9a21e634-aa10-47f8-857f-c8535fb20b13" />

<img width="986" height="977" alt="image" src="https://github.com/user-attachments/assets/71a62fea-359c-4174-b49f-349072edb494" />

<img width="416" height="108" alt="image" src="https://github.com/user-attachments/assets/e527fe72-4a00-4efa-b5b9-ad9a1843824d" />
