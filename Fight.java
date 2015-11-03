package Patterns.aStrategy;

import Patterns.aStrategy.Gladiators.Fighter;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by user on 11/2/2015.
 */
public class Fight {
    Fighter fighter1;
    Fighter fighter2;
    Printer printer;

    public Fight(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        printer = new Printer();
    }


    public void begin() {
        while (fighter1.getHealth()>0 && fighter2.getHealth()>0){
            doDamage();
        }
    }

    private void doDamage() {
        int damage1 = fighter1.getDamage();
        int damage2 = fighter2.getDamage();

        int fighter1Health = fighter2.getHealth() - damage1;
        int fighter2Health = fighter1.getHealth() - damage2;
        fighter1.setHealth(fighter1Health);
        fighter2.setHealth(fighter2Health);


        StringBuilder switchHit = new StringBuilder();
        if(fighter1.getHealth()>0 && fighter2.getHealth()>0) {
            switchHit.append(String.format("\n%s hit %s -%s. Now %s has health - %s ", fighter1.getName(), fighter2.getName(), damage1, fighter2.getName(), fighter1Health));
            switchHit.append(String.format("\n%s hit %s -%s. Now %s has health - %s", fighter2.getName(), fighter1.getName(), damage2, fighter1.getName(), fighter2Health));
        } else if(fighter1.getHealth() > 0) {
            switchHit = new StringBuilder(String.format("\n%s is winner!",fighter1.getName()));
        } else {
            switchHit = new StringBuilder(String.format("\n%s is winner!",fighter2.getName()));
        }
        printer.printConsole(switchHit.toString());

    }
}
