

import java.util.ArrayList;
//Import class dari folder lain : 
import com.terminal.Console;

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
    void setExperience(int experience){
        this.experience = experience;
    }
}

//Penerapan Static Atribute and Method
class Main13{
    private static String University = "Universitas Brawijaya"; //-Static Atribute
    private static ArrayList<String> studentList = new ArrayList<>(); //-Static Atribute
    private static int totalStd = 0;
    private String name;

    Main13(String name){
        this.name = name;
        Main13.studentList.add(name);
        totalStd++;
    }

    void sayHello(){
        System.out.printf("Hello, my name is %s\n",this.name);
    }

    static void setUniversity(String University){
        Main13.University = University;
    }

    //Static Method akan terjadi compile error ketika diganti menjadi non static
    //karena static method mengakses static atribut
    static void displayUniversity(){
        System.out.printf("Ini adalah %s\n",Main13.University);
        System.out.printf("Ada %d jumlah mahasiswa di %s\n",Main13.totalStd,Main13.University);
    }

    static void displayStudents(){
        //Bisa dibuat for loop ketika ingin ditampilkan dlm bentuk tabel
        System.out.printf("%s\n",studentList);
    }
}

public class Main{
    public static void main(String[]args){
        demoMultiPackage();
        
    }

    //Demonstrasi dari penerapan dimasukkan kedalam method.
    static void demoMultiPackage(){
        Adick adick1 = new Adick("Klee");
        Adick adick2 = new Adick("Nahida");

        adick1.halodek();
        adick2.halodek();
        
        Console.log(adick1.getWant());
    }

    static void demoStaticAtribute(){
        Main13 stdMain13_01 = new Main13("Wawa");
        Main13 stdMain13_02 = new Main13("Dada");
        Main13.setUniversity("Universitas Indonesia");

        stdMain13_01.sayHello();
        stdMain13_02.sayHello();
    }

    static void demoStaticMethod(){
        Main13 stdMain13_01 = new Main13("Wawa");
        Main13 stdMain13_02 = new Main13("Dada");
        Main13 stdMain13_03 = new Main13("Foo");

        Main13.displayUniversity();
        Main13.displayStudents();

        stdMain13_01.sayHello();
        stdMain13_02.sayHello();
        stdMain13_03.sayHello();
    }

    static void demoConstructor(){
        //Demo Constructor
        Main04 main04 = new Main04("Main 04","Computer Science",18);
        main04.introMain04();
        System.out.println(main04.name); //-- Membaca Data
        main04.name = "Main 09"; //-- Menulis Data
        System.out.println(main04.name);
    }

    static void demoReference(){
        //Demo Reference Object
        Main04 main04 = new Main04("Main 04","Computer Science",18);
        Main04 main05 = main04;
        main05.introMain04();
        //Pada assignment main05, ketika merubah sesuatu pada main05, 
        //Maka main04 ikut berubah karena adressnya yang sama atau reference
        //Contoh
        main05.major = "Engineering"; 
        main04.introMain04();
    }

    static void demoGetterAndSetter(){
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