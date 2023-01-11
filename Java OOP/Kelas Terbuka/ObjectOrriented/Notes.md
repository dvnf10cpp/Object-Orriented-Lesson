## Catatan Pemrograman Berorientasi Objek
## Kelas Terbuka, Java

# Pengenalan OOP
Class adalah template / blueprint untuk membuat objek
Objek adalah sebuah wujud hasil dari class  

Sebuah objek memiliki atribut(data member) || properti(data yang ada pada class ) dan method(data function) || (function yang ada pada class) 

Instansiasi adalah proses pembuatan suatu objek dari sebuah class <br />
Contoh Student student1 = new Student();  

Constructor adalah method yang pertama kali di panggil saat kita melakukan instansiasi dan nama method dari sebuah constructor adalah nama dari class itu sendiri

this keyword adalah keyword yang mengacu kepada objek saat ini dalam class. Digunakan untuk menghindari kesalahan akses antara atribut class dan argument method yang memiliki nama sama

Default Keyword pada java : public <br />
Default Keyword pada C++ : private

public : atribut atau method bisa diakses diluar class <br />
protected : atribut atau method hanya bisa diakses ketika satu package atau subclass dari superclass <br />
private : atribut atau method hanya bisa diakses dalam class itu sendiri <br />

# Encapsulasi
Encapsulasi : Konsep OOP dimana kita mengikat atribut didalam class dengan method yang bisa mengolah data atribut tersebut dengan tujuan untuk menghindari class lain mengakses atau melakukan modifikasi data dari class secara langsung <br />
Ada 2 method dalam encapsulasi, getter dan setter. <br />
Getter method adalah method yang melakukan return value dari atribut sebuah class <br />
Setter method adalah method yang akan menetapkan value atribut dengan argumen yang diterima dari method tersebut. <br />

# Static Keyword
Static dalam java sesuai pengertiannya "tidak berubah" yang berarti semua objek memiliki static variabel dengan value yang sama karena static variabel atau method merupakan milik kelas bukan objek spesifik tertentu. <br />
TLDR : Static = milik class bukan spesifik objek <br />
Static atribut hanya bisa diakses dengan static method. <br />
Main method pada java dibuat static supaya jvm bisa memanggil method tersebut tanpa harus menginstansiasi objek terlebih dahulu <br />

# Inheritance
Inheritance == Warisan(Catatan Lebih lengkap bisa dilihat di CPP OOP) <br />
Inheritance juga berarti objek dari sebuah class "is a" object dari class yang lain <br />
Contoh : <br />
    Superclass : Kendaraan <br />
    Subclass : Car (lebih spesifik) <br />

Jenis-Jenis Inheritance : <br />
- Single Inheritance : class yang dibuat hanya mewakili satu class. <br />
- Multi Level Inheritance : subclass mewarisi superclass yang mana merupakan subclass yang mewarisi superclass  <br />
- Multiple Inheritance : sebuah class mewarisi lebih dari satu superclass, didalam java gunakan interface untuk implementasi inheritance tipe ini <br />
- Hierarchical Inheritance : Sama seperti umumnya, superclass yang diwarisi oleh beberapa subclass

# Polymorphism
Polymorphism == Banyak Bentuk <br />
Poly = Banyak, Morph = Bentuk <br />
Definisi dalam OOP : kemampuan sebuah objek, atau fungsi untuk memiliki berbagai macam bentuk.

Overloading method : 2 atau lebih method dengan nama yang sama tetapi mempunyai argumen yang berbeda-beda <br/>
Overloading juga bisa disebut Compile Time Polymorphism, karena method dipanggil saat kompilasi. <br/>

Overriding method : menimpa method dengan nama yang sama yang ada di parent class/super class  <br/>
Overriding juga bisa disebut Runtime Polymorphism karena method dipanggil saat runtime <br/>

Perbedaan Compile Time dan Runtime : <br/>
Compile Time adalah Proses yang pertama kali terjadi <br/>
Runtime adlaah Proses yang kedua setelah proses pertama <br/>
<br/>
Contoh Kasusnya adalah ketika kita run C++ source code kita memberikan source code kita ke program yang biasanya dipanggil compiler dalam contoh yang kita gunakan, compiler tersebut berupa G++.<br/>
Lalu Program ini akan menghasilkan sebuah file executeable. Proses ini merupakan Compile Time. <br/>
Saat kita menjalankan file executeable, proses inilah yang merupakan Runtime. Yang mana bisa menjelaskan Runtime error seperti user melakukan input string ke tipe data int dan sebagainya.


# More Keyword
Keyword :  <br />
- Final   : Atribute/Method yang memiliki keyword final tidak bisa diubah dan dioverride,  <br />
                tetapi bisa dioverload di class yang sama. <br />
- Public  : Atribute/Method terbuka untuk semua class dari luar <br />
- Private : Atribute/Method hanya bisa diakses oleh class itu sendiri <br />

# Visibility
Ketika ada method superclass yang memiliki keyword public (bukan default), maka saat override didalam subclass, <br />
method subclass juga harus memiliki keyword public <br />
Visibility : <br />
    - Jika ada method atau atribute dgn keyword public didalam superclass secara explisit alias bukan default <br />
       maka subclass tidak boleh mengurangi visibility dan harus mengikuti superclass (Visibility harus sama dengan superclass) <br />
    - Jika ada method atau atribute dgn keyword private didalam superclass, maka subclass tidak dapat mengaksesnya. <br />
       Jika ingin mengakses atribut/method superclass yang private maka harus dibuat ulang di subclass <br />

# Abstraction
Abstraction : menyembunyikan impelementasi dengan memanfaatkan abstract class, interface dan sebagainya
<br/>
Abstraction Layer merupakan mekanisme yang memisahkan 2 (dua) kompleksitas sebuah sistem
