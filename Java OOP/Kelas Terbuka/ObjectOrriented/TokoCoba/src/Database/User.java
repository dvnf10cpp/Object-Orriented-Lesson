package Database;

public class User
{
    private String name;
    private String phoneNumber;
    private int age;
    
    public User(String name, String phoneNumber, int age)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    //Getter-Setter
    String getName(){
        return this.name;
    }
    
    void setName(String name){
        this.name = name;
    }

    String getPhoneNumber(){
        return this.phoneNumber;
    }
    
    void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    int getAge(){
        return this.age;
    }
    
    void setAge(int age){
        this.age = age;
    }

    public String toString()
    {
        return 
        "Name         : " + this.name + "\n" +     
        "Phone Number : " + this.phoneNumber + "\n" + 
        "Age          : " + this.age + "\n\n";
    }
}