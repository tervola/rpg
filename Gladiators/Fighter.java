package Patterns.aStrategy.Gladiators;

import Patterns.aStrategy.Buildings.Armory;
import Patterns.aStrategy.Wiapons.Behavior;

/**
 * Created by Zigner on 11/1/2015.
 */
public class Fighter {
    String name;
    int straight;
    int agility;
    int health;

    Behavior behavior;

    public Fighter(String name, int streight, int agility, int health) {
        this.name = name;
        this.straight = streight;
        this.agility = agility;
        this.health = health;

    }

    public String getName() {
        return name;
    }

    public int getStraight() {
        return straight;
    }

    public int getAgility() {
        return agility;
    }

    public int getHealth() {
        return health;
    }

    public String setBehavior() {
        Armory armory = new Armory();
        return null;
    }
}
