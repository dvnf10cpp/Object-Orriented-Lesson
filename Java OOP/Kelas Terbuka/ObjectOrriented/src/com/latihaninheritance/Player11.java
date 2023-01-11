package com.latihaninheritance;

public class Player11{
    String name;
    double attack;
    double health;

    Player11(String name, double attack, double health){
        this.name = name;
        this.attack = attack;
        this.health = health;
    }

    void display(){
        System.out.printf("Name   : %s\n",this.name);
        System.out.printf("Health : %.2f\n",this.health);
        System.out.printf("Attack : %.2f\n",this.attack);
    }

    void attack(Player11 opponent){
        System.out.printf("\n%s attack %s\n",this.name, opponent.name);
        opponent.takeDamage(this.attack);
    }

    void takeDamage(double damage){
        System.out.printf("%s recieve damage %.2f\n",this.name, damage);
        this.health -= damage;
    }
}
