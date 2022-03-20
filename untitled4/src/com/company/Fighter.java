package com.company;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    double start;

    public Fighter(String name, int damage, int health, int weight, double dodge,double start) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.start=start;
    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        return Math.max(foe.health - this.damage, 0); //we do not want to return the negative numbers,using like an if statement

    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
     boolean start(){
        double randomStart=Math.random()*100;
        return randomStart <= this.start;
    }
}

