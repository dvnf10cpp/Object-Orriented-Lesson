package com.latihaninheritance;

public class MainInheritance {
    public static void main(String[] args) {
        Player11 player11 = new Player11("C", 15, 100);
        Player14 player14 = new Player14("C++", 25, 80);

        displayPlayers(player11, player14);

        player11.attack(player14);
        player14.display();
    }

    static void displayPlayers(Player11 player11, Player14 player14){
        player11.display();
        player14.display();
    }
}
