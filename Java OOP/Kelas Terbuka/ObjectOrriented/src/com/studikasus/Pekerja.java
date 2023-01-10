package com.studikasus;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    double getGaji(){
        return this.gaji;
    }

    void setGaji(double gaji){
        this.gaji = gaji;
    }

    LocalDate getTahunMasuk(){
        return this.tahunMasuk;
    }

    void setTahunMasuk(LocalDate tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }

    int getJumlahAnak(){
        return this.jumlahAnak;
    }

    void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }

    double getBonus(){
        int yearIn = this.tahunMasuk.getYear();
        if(yearIn - 2020 <= 5){
            return 0.05 * this.gaji;
        }
        if(yearIn - 2020 <= 10){
            return 0.10 * this.gaji;
        }
        return 0.15 * this.gaji;
    }

    double getTunjangan(){
        return super.getTunjangan() + (20 * this.jumlahAnak);
    }

    public String toString(){
        return super.toString()
        +      "Tahun Masuk   : " + this.tahunMasuk.getYear() + "\n"
        +      "Jumlah Anak   : " + this.getJumlahAnak() + "\n"
        +      "Gaji          : " + this.getGaji() + "\n";
    }
}