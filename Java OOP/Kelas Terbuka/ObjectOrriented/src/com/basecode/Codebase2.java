package com.basecode;

//Start Penerapan Inheritance
class Main18Parent{ 
    //Superclass || Baseclass || Parentclass
    public String name;

    //Method yang akan dioverrid
    void saySomething(){
        System.out.println("My name is Yoshikage Kira. I'm 33 years old. My house is in the northeast section of Morioh,\n" + 
        " where all the villas are, and I am not married. I work as an employee for the Kame Yu department stores,\n"+
        " and I get home every day by 8 PM at the latest. I don't smoke, but I occasionally drink. I'm in bed by 11 PM, \n"+
        "and make sure I get eight hours of sleep, no matter what. After having a glass of warm milk and doing about twenty minutes of stretches before going to bed,\n"+
        "I usually have no problems sleeping until morning. Just like a baby, I wake up without any fatigue or stress in the morning. \n"+
        "I was told there were no issues at my last check-up. I'm trying to explain that I'm a person who wishes to live a very quiet life.\n"+
        " I take care not to trouble myself with any enemies, like winning and losing, that would cause me to lose sleep at night. \n"+
        "That is how I deal with society, and I know that is what brings me happiness. Although, if I were to fight I wouldn't lose to anyone.");
    }

    //Setter And Getter
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}

//Penerapan Overriding Method
class Main18Child extends Main18Parent{ 
    //Subclass || Derivedclass || Childclass

    //Method yang dioverride dari parent class
    //Bisa dicomment untuk mengetahui perbedaanya
    void saySomething(){
        System.out.println("apology for poor england\n" +
        "when were you when he die?\n" +
        "i was at house eating dorito when phone ring\n"+
        "he is kill\n"+
        "no");
    }
}
//End Penerapan Inheritance



public class Codebase2 {
    public static void main(String[] args) {
        demoOverriding();
    }

    static void demoOverriding(){
        Main18Child m18child = new Main18Child();
        m18child.saySomething();
    }
    
    static void demoInheritance(){
        Main18Child m18child = new Main18Child();
        m18child.setName("Child Class");
    }
}
