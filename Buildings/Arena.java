package Patterns.aStrategy.Buildings;

import Patterns.aStrategy.Gladiators.Fighter;
import Patterns.aStrategy.Wiapons.Behavior;

/**
 * Created by Zigner on 10/31/2015.
 */
public class Arena {

    Fighter fighter1;
    Fighter fighter2;
    public Arena(Behavior behavior) {
        fighter1= new Fighter("Conan", 25,10,100);
        fighter2 = new Fighter("Xena", 15,20,90);
    }

    public void performance() {
        //behavior.execute();
    }

    /* Creating fighters
        1. humans
            sword
            bow
            alebarda
        2. animals
    */

    public void getWarriors(){
        System.out.printf("Today will be fight between %s and %s", fighter1.getName(), fighter2.getName());
        //System.out.println("%s get %s",fighter1.getName(),fighter1.setBehavior());
    }

    /*
    begin fight
     */

    /*
    finish fight
     */
}
