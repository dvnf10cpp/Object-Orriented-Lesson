Object Orriented Programming Notes

OOP digunakan untuk mengelompokkan data dan fungsi yang saling berkaitan.

4 Pillar OOP : 
- Encapsulation
- Abstraction 
- Polymorphism
- Inheritance

Gunakan Ref(&) dalam argumen void di class ketika oop cpp.(Pass Reference)

Access Modifier : 
- Private : hanya bisa diakses didalam class 
- Protected : hanya bisa diakses ketika satu package(java) dan merupakn subclass dari superclass dan 
- Public : bisa diakses diluar class

Class : tipe data yang merupakan template atau blueprint untuk membuat objek 
Class memiliki atribut member dan fungsi.
Contoh penerapan dari ini : 
Atribut member dari Mobil : 
- Warna
- Merek
- Kecepatan

Fungsi dari mobil : 
- Jalan
- Stop


Object : Sebuah entitas yang merupakan hasil/wujud dari class

Constructor : Method yang langsung dipanggil ketika kita menginstansiasi objek.

Default Constructor : Constructor yang dibuat otomatis oleh compiler ketika sebuah class tidak memiliki constructor.

Constructor memiliki aturan sebagai berikut:
- Nama methodnya sesuai class
- Tidak memiliki return value
- Constructor bersifat public - Beginner Level

Encapsulation : Konsep dimana kita mengikat data/variabel dengan method yang melakukan operasi kepada data tersebut. <br />
Konsep ini digunakan untuk membatasi akses supaya user atau class lain tidak dapat mengakses, berinteraksi dan mengubah nilai/data pada class secara langsung <br />
Inti dari encapsulation : Class seharusnya tidak berinteraksi dengan data class lain secara langsung <br />

Mengakses data yang telah dienkapsulasi dapat digunakan dengan setter dan getter method <br />
Setter method adalah method yang digunakan untuk menetapkan atau mengganti suatu nilai atribut pada objek menjadi nilai yang terbaru <br />
dengan menyampaikan nilai yang terbaru melalui argumen method tersebut. <br />
Getter method adalah method yang digunakan untuk mengambil suatu nilai atribut pada objek. Getter method selalu melakukan return value. <br />

Abstraction : Menyembunyikan hal-hal kompleks dibalik prosedur yang terlihat simpel

Inheritance : Konsep dimana sebuah class yang dinamakan superclass mewariskan atau menurunkan atribut/method yang ada pada class itu sendiri terhadap class lain atau subclass.

Base class == parent class == superclass <br />
Derived class == child class == subclass <br />

Polymorphism comes from greek, poli means many and morph means form; <br />
Polymorphism : Konsep dimana sebuah method mempunyai banyak bentuknya. Bentuk yang dimaksud adalah body dari method tersebut atau argumen yang dipass ke  dalam method tersebut. <br />

Ada 2 macam polymorphism : <br />
- Override : mengimplementasikan ulang method yang ada dari super class di sub class. <br />
Override dilakukan supaya subclass memiliki fungsi yang melakukan hal yang lebih spesifik <br />

- Overloading : 2 method yang sama dalam class tetapi beda argumen.

