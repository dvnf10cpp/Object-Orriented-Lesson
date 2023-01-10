package com.studikasus;

public class Manager extends Pekerja {
    private String departemen;

    String getDepartemen(){
        return this.departemen;
    }

    void setDepartemen(String departemen){
        this.departemen = departemen;
    }

    double getTunjangan(){
        return super.getTunjangan() + (0.1 * this.getGaji());
    }

    public String toString(){
        return super.toString()
        + "Departemen   : " + this.getDepartemen() + "\n";
    }
}
