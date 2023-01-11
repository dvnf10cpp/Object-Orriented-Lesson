package com.polymorphism;

public class HeroIntel extends HeroParent {
    String type = "Intel";

    HeroIntel(String name){
        super(name);
    }

    public String toString(){
        return super.toString()
        + "Type : " + this.type + "\n";
    }
}
