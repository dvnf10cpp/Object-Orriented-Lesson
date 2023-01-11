package com.polymorphism;

public class MainPolymorph {
    public static void main(String[] args) {
        demoDownCasting();
    }

    static void demoDownCasting(){
        HeroParent heroP = new HeroParent("Parent-1");
        System.out.println(heroP);
        //Tidak bisa melakukan downcasting dari superclass ke subclass
        //Akan terjadi runtime error
        // HeroAgility heroA = (HeroAgility) heroP; //- Direct DownCasting -RUNTIME ERROR

        //Percobaan dari Agility ke Parent, Balikan Parent ke Agility
        //Indirect DownCasting
        HeroAgility heroA = new HeroAgility("Agility-1");
        HeroParent heroR = (HeroParent) heroA;
        HeroAgility heroL = (HeroAgility) heroR;
        heroL.showAgility();
        System.out.println(heroL);
        //Status : 201(OK)
        //Kesimpulan : Downcasting hanya bisa dilakukan ketika sudah di upcasting dari class yang sama dengan
        //downcasting, tetapi tidak bisa direct downcasting.
    }

    static void demoUpCasting(){
        HeroIntel heroI = new HeroIntel("Intel-1");
        //Objek yang diupcasting tidak bisa mengakses atribut / method spesifik yang ada di subclass lagi
        //Jadinya dia kehilangan akses ke atribut / method di subclass yang tidak dimiliki superclass 
        //alias class yang diupcast
        HeroParent heroP = (HeroParent) heroI; //-UpCasting
        // heroP.intel(); --TIDAK BISA
        System.out.println(heroP);
    }

    static void demoPoly(){
        HeroParent heroP = new HeroParent("Odin");
        HeroStrength heroS = new HeroStrength("Thor");
        HeroIntel heroI = new HeroIntel("Loki");
        HeroAgility heroA = new HeroAgility("Blah");

        System.out.println(heroP);
        System.out.println(heroS);

        //Polymorphic
        //Berlaku untuk kebawah
        //Tipe data bisa superclass tetapi objeknya subclass
        //Sebaliknya tidak bisa, karena superclass belum tentu is a subclass
        //Berikut Demonya
        HeroParent heroP1 = new HeroIntel("Bleh");
        System.out.println(heroP1);

        //Array
        //1. Subclass bisa masuk ke array tipe superclass
        //   Sebaliknya superclass tidak bisa masuk ke array tipe subclass
        //   Inilah kaitan hubungan is a dari inheritance
        //   Dengan 1 superclass bisa menumpulkan berbagai macam class dengan array
        //2. Perlu di note, method yang dipanggil adalah method yang ada di semua class
        //   Jika ada subclass yang memiliki method spesifik dan dimasukkan ke array
        //   Bertipe superclass, subclass tidak bisa memanggil method spesifik
        //   Karena saat objek subclass dimasukan ke superclass array, maka objek
        //   Subclass tersebut dianggap sebagai superclass alias berlaku casting

        //Pada Proses ini, terjadilah upcasting
        HeroParent[] heroes = new HeroParent[4];
        heroes[0] = heroP;
        heroes[1] = heroS;
        heroes[2] = heroI;
        heroes[3] = heroA;

        //Contoh Penerapan No.2
        // heroes[1].showStrength(); --TIDAK BISA
        //Kode Diatas akan menunjukkan compiler error
        //Sedangkan kode dibawah tidak menunjukkan compiler error
        heroS.showStrength();
    }
}
