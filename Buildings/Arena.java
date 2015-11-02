package Patterns.aStrategy.Buildings;

import Patterns.aStrategy.Gladiators.Fighter;
import Patterns.aStrategy.Printer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zigner on 10/31/2015.
 */
public class Arena {

    Fighter fighter1;
    Fighter fighter2;

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

    public Fighter getFirstFigter(){
        return fighter1;
    }

    public Fighter getSecondFigter(){
        return fighter2;
    }
    public void setWarriors(String firstFighter, String secondFighter){
        fighter1 = new Fighter(firstFighter, 25,10,100);
        fighter2 = new Fighter(secondFighter, 15,20,90);
    }

    public List<Fighter> getWarriors(){
        List<Fighter> warriors = new ArrayList<>();
        warriors.add(fighter1);
        warriors.add(fighter2);
        return warriors;
    }

    /*
    begin fight
     */

    /*
    finish fight
     */
}
