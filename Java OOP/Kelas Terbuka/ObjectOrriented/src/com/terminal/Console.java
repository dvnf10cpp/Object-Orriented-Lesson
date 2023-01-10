package com.terminal;

public class Console {
    //Penerapan overloading method
    public static void logf(int width, char argument){
        System.out.printf("%"+width +"c",argument);
    }

    public static void logf(int width, double argument){
        System.out.printf("%"+width +"f",argument);
    }

    public static void logf(int width, int argument){
        System.out.printf("%"+width +"d",argument);
    }
    public static void logf(int width, String argument){
        System.out.printf("%"+width +"s",argument);
    }

    public static void log(String message){
        System.out.println(message);
    }

    public static void log(int message){
        System.out.println(message);
    }
    
    public static void log(double message){
        System.out.println(message);
    }

    public static void log(char message){
        System.out.println(message);
    }

    public static void log(){
        System.out.println("");
    }
}
