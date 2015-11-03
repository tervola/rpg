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


    public void begin() throws InterruptedException {
        while (fighter1.getHealth()>0 && fighter2.getHealth()>0){
            doDamage();
            Thread.sleep(100);
        }
    }

    private void doDamage() {
        int damage1 = fighter1.getDamage();
        int damage2 = fighter2.getDamage();

        int fighter1Health = fighter2.getHealth() - damage2;
        int fighter2Health = fighter1.getHealth() - damage1;
        fighter1.setHealth(fighter1Health);
        fighter2.setHealth(fighter2Health);

        printer.printBattle(fighter1,fighter2,damage1,damage2);

    }
}
