package com.latihaninheritance;

public class Player15 extends Player11{
    String type = "15";

    Player15(String name, double attack, double health){
        super(name, attack, health);
    }

    @Override
    void display(){
        super.display();
        System.out.printf("Type : %s\n",this.type);
    }

    @Override
    void takeDamage(double damage){
        System.out.printf("%s recieve critical damage %.2f\n",this.name, damage * 1.5);
        this.health -= 1.5 * damage;
    }
}
