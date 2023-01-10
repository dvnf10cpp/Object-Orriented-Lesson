package com.basecode;

class Player{
    //Atribut yang diencapsulasi:
    private String name;
    private int health;
    private int attack;
    private Weapon weapon;
    private Armor armor;
    private int level;
    private int addHealth;
    private int addAttack;

    Player(String name){
        this.name = name;
        this.health = 180;
        this.level = 1;
        this.addHealth = 20; 
        this.attack = 10;
        this.addAttack = 10;
    }
    //Function
    void displayPlayer(){
        System.out.printf("Name    : %s\n",this.name);
        System.out.printf("Level   : %d\n",this.level);
        System.out.printf("Health  : %d\n",this.maxHealth());
        System.out.printf("Attack  : %d\n",this.maxAttack());
        System.out.printf("Armor   : %s\n",this.armor.getName());
        System.out.printf("Weapon  : %s\n",this.weapon.getName());
        System.out.println("");
    }

    void attack(Player opponent){
        int attack = (int)(Math.random() * this.maxAttack()) + this.maxAttack() - this.attack;
        int opponentHealth = opponent.getHealth() - attack;
        opponent.setHealth(opponentHealth);
        this.levelUp();
        System.out.printf("%s attacked %s\n",this.name, opponent.getName());
        System.out.printf("Damage done : %d\n\n",attack);
    }

    private void levelUp(){
        this.level++;
    }

    int maxHealth(){
        return this.health + (this.level * this.addHealth) + this.armor.getStrength();
    }

    int maxAttack(){
        return this.attack + (this.level * this.addAttack) + this.weapon.getPower();
    }

    //Setter
    void setHealth(int health){
        this.health = health;
    }

    void setArmor(Armor armor){
        this.armor = armor;
    }

    void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    //Getter
    String getName(){
        return this.name;
    }
    int getHealth(){
        return this.health;
    }

    int getAttack(){
        return this.maxAttack();
    }

}

class Weapon{
    private String name;
    private int power;

    Weapon(String name, int power){
        this.name = name;
        this.power = power;
    }

    int getPower(){
        return this.power;
    }

    String getName(){
        return this.name;
    }
}

class Armor{
    private String name;
    private int strength;


    Armor(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    //Getter
    int getStrength(){
        return this.strength;
    }
    String getName(){
        return this.name;
    }
}

public class LatihanEncapsulasi{
    public static void main(String[] args) {
        Player player1 = new Player("Aether");
        Armor armor1 = new Armor("Raiden Armor",200);
        Weapon weapon1 = new Weapon("Musou Isshin", 45);

        Player player2 = new Player("Lumine");
        Armor armor2 = new Armor("Zhongli Suit",400);
        Weapon weapon2 = new Weapon("Big Dong Zhong", 10);

        equipArmory(player1, armor1, weapon1);
        equipArmory(player2, armor2, weapon2);
        
        player1.displayPlayer();
        player2.displayPlayer();

        player1.attack(player2);
        player2.attack(player1);

        player1.displayPlayer();
        player2.displayPlayer();

    }

    static void equipArmory(Player player, Armor armor, Weapon weapon){
        player.setArmor(armor);
        player.setWeapon(weapon);
    }
}