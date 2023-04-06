#include <bits/stdc++.h>

using namespace std;

//Abstraction : Interface / Virtual class
class AbstractStudent{
    virtual void AskCumlaude() = 0;
};

//Student is a superclass
class Student:AbstractStudent {
protected:
    //ENCAPSULATED ATRIBUTE
    //Ketika atribut protected, atribut bisa diakses oleh subclass
    string name;
    string major;
    int age;
    double ipk;

public:
    //Constructor
    Student(string name, string major, int age, double ipk){
        this->name = name;
        this->major = major;
        this->age = age;
        this->ipk = ipk;
    }

    void intro(){
        cout << "Hello, my name is " << this->name << endl;
        cout << "I am a " << this->major << " student" << endl;
        cout << "I am " << this->age << " years old" << endl;
    }

    // START ENCAPSULATION
    ///SETTING UP SETTER AND GETTER
    void setName(string name){
        this->name = name;
    }
    
    string getName(){
        return this->name;
    }

    void setMajor(string major){
        this->major = major;
    }

    string getMajor(){
        return this->major;
    }

    void setAge(int age){
        if(age >= 4){
            this->age = age;
        }
        
    }

    int getAge(){
        return this->age;
    }

    double getIpk(){
        return this->ipk;
    }
    ///END GETTER AND SETTER
    //START ABSTRACTION
    void AskCumlaude(){
        if(this->ipk > 3.5){
            cout << this->getName() << " is a cumlaude student\n";
        } else {
            cout << this->getName() << " is not a cumlaude student\n";
        }
    }

    //method yang akan di overriding oleh subclass sebagai contoh dari polymorphism:
    void study(){
        cout << this->name << " is studying a class lesson" << endl;
    }

};

//INHERITANCE
///Programmer is a subclass
class Programmer:public Student{
private:
    /*
    bisa dibuat protected supaya subclass dari programmer 
    bisa mengakses atribut ini secara langsung
    */
    string language;
    string division;
public:
    ///Constructor
    Programmer(string name, string major, int age, double ipk, string language, string division)
    :Student(name,major,age,ipk){
        this->language = language;
        this->division = division;
    }

    void developApp(){
        cout << this->name << " is developing " << this->getDivison() << " application with " << this->getLanguage() << " language" << endl;
    }
    //Method yang telah dioverride
    void study(){
        cout << this->name << " is studying " << this->language << " language" << endl;
    }

    //Contoh penerapan method overloading
    void learnedLanguage(int numbers){
        if(numbers > 1){
            cout << this->name << " has learned " << numbers << " language" << endl;
            cout << "With that many language he learned" << endl;
            cout << "He's able to perfom many task!" << endl;
        } else if(numbers == 1){
            cout << this->name << " has learned only " << numbers << " languages" << endl;
        } else{
            cout << this->name << " hasnt learned any language yet" << endl;
            cout << "but for some reason, he's a programmer, hmmm. sus" << endl;
        }

    }

    void learnedLanguage(string language){
        string task = "code in that language";
        if(language == "Java"){
            task = "build application";
        }
        else if(language == "C#"){
            task = "build game application";
        }
        else if(language == "Java"){
            task = "build dekstop application";
        }
        else if(language == "C"){
            task = "build embedded system";
        }
        else if(language == "Kotlin"){
            task = "build mobile appliaction";
        }
        else if(language == "C++"){
            task = "build efficient game and dekstop app";
        }
        else if(language == "Python"){
            task = "build an AI";
        }
        else if(language == "Javascript"){
            task = "build web application";
        }
        cout << this->name << " has learned " << language << " language" << endl;
        cout << "With that language, he's able to " << task << endl;
    }

    ///Setter and Getter
    string getLanguage(){
        return this->language;
    }

    void setLanguage(string language){
        this->language = language;
    }

    string getDivison(){
        return this->division;
    }

    void setDivision(string division){
        this->division = division;
    }
};

class Designer:public Student{
private:
    string project;
    string tool;
public:
    Designer(string name, string major, int age, double ipk, string project, string tool):Student(name,major,age,ipk){
        this->project = project;
        this->tool = tool;
    }
    void designing(){
        cout << this->name << " is designing " << this->project << " using " << this->tool << endl;
    }

    //Method yang telah dioverride
    void study(){
        cout << this->name << " is studying " << this->tool << endl;
    }
};

int main(){
    //constructor demo
    Student student1 = Student("Me1","Computer Science",23,3.76);
    // student1.intro();

    Student student2 = Student("Me2","Engineering",23,3.81);
    // student2.intro();

    Student student3 = Student("Ma1","Economics",21,3.4);
    Programmer programmer1 = Programmer("Mo","Informatics",22,3.91,"C#","Game");
    // programmer1.developApp();
    //Buat inheritnace menjadi public supaya bisa mengakses abstract method
    // programmer1.AskCumlaude();

    Designer designer1 = Designer("Mn","Design and Art",22,3.61,"Web","Figma");
    // designer1.designing();


    
    //getter and setter demo
    // student1.setAge(21);
    // cout << student1.getName() << " is " << student1.getAge() << " years old"<<endl;

    //abstraction demo
    // student3.AskCumlaude();
    // student2.AskCumlaude();

    //overriding demo
    // student1.study();
    // programmer1.study();
    // designer1.study();

    //overloading demo
    programmer1.learnedLanguage(4);
    programmer1.learnedLanguage("Ruby");

    return 0;
}
