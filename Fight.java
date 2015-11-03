package Patterns.aStrategy;

import Patterns.aStrategy.Gladiators.Fighter;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by user on 11/2/2015.
 */
public class Fight {
    Fighter fighter1;
    Fighter fighter2;

    public Fight(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }


    public void begin() {
        while (fighter1.getHealth()>0 || fighter2.getHealth()>0){
            doDamage();
        }
    }

    private void doDamage() {
        int damage1 = fighter1.getDamage();
        int damage2 = fighter2.getDamage();

        fighter2.set

        StringBuilder switchHit = new StringBuilder();
        switchHit.append(String.format("%s hit %s and %s has %s of health",fighter1.getName(),fighter2.getName(),fighter2.getName(),fighter2 ))
    }
}
