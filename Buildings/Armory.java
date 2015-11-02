package Patterns.aStrategy.Buildings;

import Patterns.aStrategy.Wiapons.Behavior;
import Patterns.aStrategy.Wiapons.Behaviors;
import Patterns.aStrategy.Wiapons.Bow;
import Patterns.aStrategy.Wiapons.Sword;

import java.util.Random;

/**
 * Created by Zigner on 11/1/2015.
 */
public class Armory {
    Behavior behavior;
    int weaponVariations = Behaviors.values().length;

    int choise = new Random().nextInt(weaponVariations-0)+1;

    public Armory() {
        switch (choise){
            case 1: behavior = new Sword();
                    break;
            case 2: behavior = new Bow();
                    break;
            default: behavior = null;
        }
    }

    public Behavior getBehavior() {
        return behavior;
    }
}
