package com.latihaninheritance;

public class Player14 extends Player11 {
    String type = "14";
    //Subclass Constructor
    Player14(String name, double attack, double health){
        super(name, attack, health);
    }

    @Override
    void display(){
        super.display();
        System.out.printf("Type : %s\n",this.type);
    }

    @Override
    void takeDamage(double damage){
        System.out.printf("%s recieve half damage %.2f\n",this.name, damage * 0.5);
        this.health -= 0.5 * damage;
    }
}
