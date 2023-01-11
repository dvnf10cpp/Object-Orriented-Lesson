## Catatan Pemrograman Berorientasi Objek
## Kelas Terbuka, Java

Class adalah template untuk objek
Objek adalah sebuah wujud hasil dari class  

Sebuah objek memiliki atribut(data member) dan method(data function)  

Instansiasi adalah proses pembuatan suatu objek dari sebuah class__
Contoh Student student1 = new Student();  

Constructor adalah method yang pertama kali di panggil saat kita melakukan instansiasi dan nama method dari sebuah constructor adalah nama dari class itu sendiri

this keyword adalah keyword yang mengacu kepada objek saat ini dalam class. Digunakan untuk menghindari kesalahan akses antara atribut class dan argument method yang memiliki nama sama

Default Keyword pada java : public
Default Keyword pada C++ : private

public : atribut atau method bisa diakses diluar class
protected : atribut atau method hanya bisa diakses ketika satu package atau subclass dari superclass
private : atribut atau method hanya bisa diakses dalam class itu sendiri

Encapsulasi : Konsep OOP dimana kita mengikat atribut didalam class dengan method yang bisa mengolah data atribut tersebut dengan tujuan untuk menghindari class lain mengakses atau melakukan modifikasi data dari class secara langsung
Ada 2 method dalam encapsulasi, getter dan setter.
Getter method adalah method yang melakukan return value dari atribut sebuah class
Setter method adalah method yang akan menetapkan value atribut dengan argumen yang diterima dari method tersebut.

Static dalam java sesuai pengertiannya "tidak berubah" yang berarti semua objek memiliki static variabel dengan value yang sama karena static variabel atau method merupakan milik kelas bukan objek spesifik tertentu.
TLDR : Static = milik class bukan spesifik objek 
Static atribut hanya bisa diakses dengan static method.
Main method pada java dibuat static supaya jvm bisa memanggil method tersebut tanpa harus menginstansiasi objek terlebih dahulu

Overloading method : 2 atau lebih method dengan nama yang sama tetapi mempunyai argumen yang berbeda-beda atau return value yang berbeda

Overriding method : menimpa method dengan nama yang sama yang ada di parent class/super class  

Inheritance == Warisan(Catatan Lebih lengkap bisa dilihat di CPP OOP)
Inheritance juga berarti objek dari sebuah class "is a" object dari class yang lain
Contoh : 
    Superclass : Kendaraan 
    Subclass : Car (lebih spesifik)

Polymorphism == Banyak Bentuk
Poly = Banyak, Morph = Bentuk

Keyword : 
    Final   : Atribute/Method yang memiliki keyword final tidak bisa diubah dan dioverride, 
              tetapi bisa dioverload.
    Public  : Atribute/Method terbuka untuk semua class dari luar
    Private : Atribute/Method hanya bisa diakses oleh class itu sendiri

Ketika ada method superclass yang memiliki keyword public (bukan default), maka saat override didalam subclass,
method subclass juga harus memiliki keyword public
Visibility :
    1. Jika ada method atau atribute dgn keyword public didalam superclass secara explisit alias bukan default
       maka subclass tidak boleh mengurangi visibility dan harus mengikuti superclass (Visibility harus sama dengan superclass)
    2. Jika ada method atau atribute dgn keyword private didalam superclass, maka subclass tidak dapat mengaksesnya.
       Jika ingin mengakses atribut/method superclass yang private maka harus dibuat ulang di subclass
