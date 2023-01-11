package com.studikasus;

import java.time.LocalDate;

public class StudiMain {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja();

        pekerja1.setNama("Test1");
        pekerja1.setJenisKelamin(true);
        pekerja1.setNik("190933384");
        pekerja1.setMenikah(true);
        pekerja1.setJumlahAnak(3);
        pekerja1.setGaji(100);

        pekerja1.setTahunMasuk(LocalDate.now());

        System.out.println(pekerja1);    
    }
    
}
