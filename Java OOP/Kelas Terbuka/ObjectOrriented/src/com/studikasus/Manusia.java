package com.studikasus;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    //Setter and Getter
    String getNama(){
        return this.nama;
    }

    void setNama(String nama){
        this.nama = nama;
    }

    boolean getJenisKelamin(){
        return this.jenisKelamin;
    }

    void setJenisKelamin(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    String getNik(){
        return this.nik;
    }

    void setNik(String nik){
        this.nik = nik;
    }

    boolean getMenikah(){
        return this.menikah;
    }

    void setMenikah(boolean menikah){
        this.menikah = menikah;
    }

    double getTunjangan(){
        if(this.menikah && this.jenisKelamin) return 25;
        if(this.menikah && !this.jenisKelamin) return 20;
        return 15;
    }

    double getPendapatan(){
        return this.getTunjangan() * 50;
    }

    public String toString(){
        return "Nama          : " + this.getNama() + "\n" 
        +      "NIK           : " + this.getNik() + "\n" 
        +      "Jenis Kelamin : " +(this.getJenisKelamin() ? "laki-laki" : "perempuan") + "\n"
        +      "Pendapatan    : " + this.getPendapatan() + "\n";
    }
}
