Class adalah template untuk objek
Objek adalah sebuah wujud hasil dari class

Sebuah objek memiliki atribut(data member) dan method(data function)

Instansiasi adalah proses pembuatan suatu objek dari sebuah class
Contoh Student student1 = new Student();

Constructor adalah method yang pertama kali di panggil saat kita melakukan instansiasi dan nama method dari sebuah constructor adalah nama dari class itu sendiri

this keyword adalah keyword yang mengacu kepada objek saat ini dalam class. Digunakan untuk menghindari kesalahan akses antara atribut class dan argument method yang memiliki nama sama

Default Keyword pada java : public
Default Keyword pada C++ : private

public : atribut atau method bisa diakses diluar class
protected : atribut atau method hanya bisa diakses ketika satu package atau subclass dari superclass
private : atribut atau method hanya bisa diakses dalam class itu sendiri

Encapsulasi : Konsep OOP dimana kita mengikat atribut didalam class dengan method yang bisa mengolah data atribut tersebut dengan tujuan untuk menghindari class lain mengakses data dari class secara langsung
