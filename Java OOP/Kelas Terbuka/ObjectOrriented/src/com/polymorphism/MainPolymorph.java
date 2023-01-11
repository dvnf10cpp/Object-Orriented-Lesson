package com.polymorphism;

public class MainPolymorph {
    public static void main(String[] args) {
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
