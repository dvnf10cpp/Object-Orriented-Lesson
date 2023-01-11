package com.studikasus;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    //Setter and Getter
    final String getNama(){
        return this.nama;
    }

    final void setNama(String nama){
        this.nama = nama;
    }

    final boolean getJenisKelamin(){
        return this.jenisKelamin;
    }

    final void setJenisKelamin(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    final String getNik(){
        return this.nik;
    }

    final void setNik(String nik){
        this.nik = nik;
    }

    final boolean getMenikah(){
        return this.menikah;
    }

    final void setMenikah(boolean menikah){
        this.menikah = menikah;
    }
    //Contoh final tidak bisa dioverride : Bisa tambahkan 'final' pada method dibawah ini
    double getTunjangan(){
        if(this.menikah && this.jenisKelamin) return 25;
        if(this.menikah && !this.jenisKelamin) return 20;
        return 15;
    }

    final double getPendapatan(){
        return this.getTunjangan() * 50;
    }

    public String toString(){
        return "Nama          : " + this.getNama() + "\n" 
        +      "NIK           : " + this.getNik() + "\n" 
        +      "Jenis Kelamin : " +(this.getJenisKelamin() ? "laki-laki" : "perempuan") + "\n"
        +      "Pendapatan    : " + this.getPendapatan() + "\n";
    }
}
