package Patterns.aStrategy.Gladiators;

import Patterns.aStrategy.Buildings.Armory;
import Patterns.aStrategy.Wiapons.Behavior;

import java.util.Random;

/**
 * Created by Zigner on 11/1/2015.
 */
public class Fighter {
    String name;
    int strength;
    int agility;
    int health;

    public int getOriginalHealth() {
        return originalHealth;
    }

    int originalHealth;

    /**
     * warriorType:
     * 1 - strength:
     *  a. if weapon - sword: damage + 50%
     *  b. if no any weapons  - damage = damage + 25%
     *  c. health = strength + basic health
     *  d. attack speed - normal
     * 2 - agility
     * *  a. if weapon - bow, knife: damage + 50%
     *  b. if no any weapons  - damage = damage - 25%
     *  c. health = strength + basic health
     *  d. attack Speed = attack speed + agility
     */
    int warriorType;

    int damage;

    Behavior behavior;


    public void setHealth(int health) {
        this.health = health;
    }

    public Fighter(String name, int streight, int agility, int health, int warriorType) {
        this.name = name;
        this.strength = streight;
        this.agility = agility;
        this.health = health;
        originalHealth = health;
        this.warriorType = warriorType;
        setBehavior();
        setDamage();
        //damage += new Random().nextInt((3-0))+1;
    }

    private void setDamage() {
        if (warriorType == 1){
            if (getBehaviorDescription().equals("sword") || getBehaviorDescription().isEmpty()) {
                damage = damage + strength / 2;
            }
        } else if(warriorType == 2 ) {
            if(this.getBehaviorDescription().equals("bow")) {
                damage = damage + agility;
            } else if (this.getBehaviorDescription().isEmpty())
            {
                damage = damage - damage/4;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getHealth() {
        return health;
    }

    public int getWarriorType() {
        return warriorType;
    }

    public void setBehavior() {
        Armory armory = new Armory();
        if(armory.getBehavior() != null){
            behavior = armory.getBehavior();
        } else
        {
            //
        }

    }
    public String getBehaviorDescription(){
        return behavior.toString();
    }

    public int getDamage(){
        return damage + new Random().nextInt((3-0))+1;
    }
}
