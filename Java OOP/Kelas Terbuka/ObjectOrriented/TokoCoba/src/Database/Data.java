package Database;

import java.util.ArrayList;


public class Data 
{
    private static ArrayList<User>db = new ArrayList<>();

    static void addData(User user)
    {
        db.add(user);
    }

    static ArrayList<User> getDb()
    {
        return db;
    }
}
