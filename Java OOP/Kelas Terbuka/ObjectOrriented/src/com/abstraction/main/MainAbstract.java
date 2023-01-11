package com.abstraction.main;

import com.abstraction.classes.*;

public class MainAbstract {
    public static void main(String[] args) {
        //Membuat objek dari kelas non abstract
        Police police1 = new Police("Sambomaster");
        police1.display();

        //Membuat objek dari kelas abstract
        //Human human1 = new Human("Hooman"); --Error
    }
}
