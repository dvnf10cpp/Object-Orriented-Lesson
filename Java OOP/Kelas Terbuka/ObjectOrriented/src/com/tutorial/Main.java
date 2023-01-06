package com.tutorial;

//CODE BASE
//Penerapan Constructor 04 dan basic OOP
class Main04{
    //Data Member / Atribut
    String name;
    String major;
    int age;

    //Constructor Demo 1
    // Main04(){
    //     System.out.println("Main 04 Calling");
    // }

    //Constructor dengan paramter
    Main04(String name, String major, int age){
        //Penerapan this
        this.name = name;
        this.major = major;
        this.age = age;
    }

    //Data Function / Method
    void introMain04(){
        System.out.printf("Name  : %s\n",this.name);
        System.out.printf("Major : %s\n", this.major);
        System.out.printf("Age   : %d\n\n",this.age);
    }
}

//Penerapan Encapsulasi(Getter and Setter)
class Main10{
    //Data yang terencapsulasi
    private String name;
    private String language;
    private int experience;

    Main10(String name, String language, int experience){
        this.name = name;
        this.language = language;
        this.experience = experience;
    }

    //Getter and Setter
    ///Name
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name = name;
    }
    ///Language
    String getLanguage(){
        return this.language;
    }
    void setLanguage(String language){
        this.language = language;
    }   
    ///Experience
    int getExperience(){
        return this.experience;
    }
    void setExperience(){
        this.experience = experience;
    }
}

public class Main{
    public static void main(String[]args){
        //Demo Constructor
        Main04 main04 = new Main04("Main 04","Computer Science",18);
        // System.out.println(main04.name); -- Membaca Data
        // main04.name = "Main 09" -- Menulis Data

        //Demo Class Function
        // main04.introMain04();

        //Demo Reference Object
        Main04 main05 = main04;
        // main05.introMain04();
        //Pada assignment main05, ketika merubah sesuatu pada main05, 
        //Maka main04 ikut berubah karena adressnya yang sama atau reference
        //Contoh
        // main05.major = "Engineering"; 
        // main04.introMain04();
        //==============================================================
        //==============================================================
        //Demo Getter and Setter
        Main10 main10 = new Main10("Main 10","C++",5);
        System.out.printf("Get Name     : %s\n",main10.getName());
        System.out.printf("Get Language : %s\n",main10.getLanguage());
        main10.setName("Main 09");
        main10.setLanguage("Javascript");
        System.out.printf("Get Name     : %s\n",main10.getName());
        System.out.printf("Get Language : %s\n",main10.getLanguage());
    }
}
