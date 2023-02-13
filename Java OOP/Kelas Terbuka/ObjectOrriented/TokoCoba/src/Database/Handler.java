package Database;

import java.util.Scanner;

public class Handler 
{
    private static Scanner in = new Scanner(System.in);
    
    public static void createUser()
    {
        System.out.println("Register Your Account!");
        System.out.print("Name         : ");
        String name = in.nextLine();
        System.out.print("Phone Number : ");
        String phoneNum = in.nextLine();
        System.out.print("Age          : ");
        int age = in.nextInt(); in.nextLine();
        Data.addData(new User(name,phoneNum,age));
    }

    public static void tableDisplay()
    {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|           Nama           |        Phone Number        |       Age      |");
        System.out.println("--------------------------------------------------------------------------");
        for(User user : Data.getDb())
        {
            System.out.printf("| %-24s | %-26s | %-14d |\n",user.getName(),user.getPhoneNumber(),user.getAge());
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}
