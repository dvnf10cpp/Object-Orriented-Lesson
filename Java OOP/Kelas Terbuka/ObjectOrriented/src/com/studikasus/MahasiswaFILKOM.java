package com.studikasus;

public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    String getNim(){
        return this.nim;
    }

    void setNim(String nim){
        this.nim = nim;
    }

    double getIpk(){
        return this.ipk;
    }

    void setIpk(double ipk){
        this.ipk = ipk;
    }

    String getStatus(){
        String tahun = "20" + this.nim.substring(0,2);
        String prodi = "";
        switch(this.nim.charAt(6)){
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
        }
        return prodi + ", " + tahun;
    }

    double getBeasiswa(){
        if(this.getIpk() >= 3.0 && this.getIpk() < 3.5) return 50;
        if(this.getIpk() >= 3.5 && this.getIpk() <= 4.0) return 75;
        return 0;
    }

    public String toString(){
        return super.toString() 
        +      "NIM           : " + this.getNim() + "\n"
        +      "IPK           : " + this.getIpk() + "\n"
        +      "Status        : " + this.getStatus() + "\n";
    }
}
