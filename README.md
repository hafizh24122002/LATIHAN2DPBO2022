# LATIHAN2DPBO2022

*Saya Hafizh Lutfi Hidayat mengerjakan Latihan 2 dalam mata kuliah
Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*

Pada program yang saya buat, hirearki kelas dari atas yaitu `Product -> Hardware -> Memory`. Alasannya adalah melihat attribute dari setiap kelas dari paling umum sampai paling spesifik dimana setiap level memberikan detail yang lebih banyak dari parentnya. Kemudian untuk penjelasan setiap kelasnya, seperti yang telah disebutkan sebelumnya dimulai dari kelas `Product`.

Pada kelas `Product` terdapat 2 attribute sesuai dengan spesifikasi yang diberikan yaitu `price` dan `idProduct`, dimana `price` merupakan integer dan `idProduct` merupakan string. Alasannya adalah jika nantinya akan dilakukan penambahan pada kode, maka akan lebih mudah dalam prosesnya jika menggunakan tipe data tersebut.

Pada kelas `Hardware` terdapat 2 attribute sesuai dengan spesifikasi yang diberikan yaitu `brand` dan `model`, dimana `brand` dan `model` merupakan string. constructor yang digunakan terdapat argumen/parameter yang bersifat opsional, alasannya adalah jika input yang diberikan tidak lengkap (hanya untuk 1 atau 2 kelas saja) maka program tetap dapat berjalan dengan mengisi variabel yang kosong dengan default value yang telah ditetapkan. Sehingga tidak perlu membuat banyak constructor yang akan memperumit kode. Namun terdapat pengecualian untuk bahasa pemrograman Java karena tidak mendukung argumen/parameter opsional maka menggunakan banyak constructor/overload.

Pada kelas `Memory` terdapat 3 attribute sesuai dengan spesifikasi yang diberikan yaitu `frequency`, `memorySize`, dan `supportsCuda`, dimana `frequency` dan `memorySize` merupakan integer dan `supportsCuda` merupakan boolean karena hanya ada 2 kemungkinan antara mendukung fungsi CUDA atau tidak. Untuk constructor sama seperti pada kelas `Hardware` dimana juga menggunakan argumen/parameter opsional (kecuali untuk bahasa Java).

*Catatan:
- Seperti yang telah disebutkan sebelumnya pada program dengan bahasa pemrograman Java tidak menggunakan parameter opsional karena tidak didukung.
- Pada bahasa pemrograman PHP (line 1) dituliskan seperti berikut ini agar nilai dari attribute tidak terisi dengan tipe data yang tidak diharapkan.
```php 
<?php declare(strict_types=1);
...
``` 
