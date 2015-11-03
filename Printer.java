package Patterns.aStrategy;

import Patterns.aStrategy.Gladiators.Fighter;

import java.util.List;

/**
 * Created by user on 11/2/2015.
 */
public class Printer {
    public void printConsole(String message) {
        System.out.println(message);
    }

    public void printBanner(List<Fighter> warriors) {
        Fighter fighter1 = warriors.get(0);
        Fighter fighter2 = warriors.get(1);
        StringBuilder banner = new StringBuilder();
        banner.append(String.format("Today will be fight between %s and %s!", fighter1.getName(), fighter2.getName()));
        banner.append(String.format("\nFighter %s chose %s", fighter1.getName(), fighter1.getBehaviorDescription()));
        banner.append(String.format("\nFighter %s chose %s", fighter2.getName(), fighter2.getBehaviorDescription()));
        printConsole(banner.toString());
    }

    public void printBattle(Fighter fighter1, Fighter fighter2, int damage1, int damage2) {
        StringBuilder switchHit = new StringBuilder();
        if(fighter1.getHealth()>0 || fighter2.getHealth()>0) {
            switchHit.append(String.format("\n%s hit %s -%s. Now %s has health: %s/%s ",
                    fighter1.getName(),
                    fighter2.getName(),
                    damage1,
                    fighter2.getName(),
                    fighter2.getHealth(),
                    fighter2.getOriginalHealth()
            ));
            switchHit.append(String.format("\n%s hit %s -%s. Now %s has health: %s/%s",
                    fighter2.getName(),
                    fighter1.getName(),
                    damage2,
                    fighter1.getName(),
                    fighter1.getHealth(),
                    fighter1.getOriginalHealth()
            ));
        } else if(fighter1.getHealth() < 0 || fighter2.getHealth() < 0) {
            switchHit = new StringBuilder(String.format("\nBoth of warriors are dead!\n%s has %s, \n%s has %s",fighter1.getName(),fighter1.getHealth(),fighter2.getName(),fighter2.getHealth()));
        } else if( fighter1.getHealth() < 0) {
            switchHit = new StringBuilder(String.format("\n%s is winner!",fighter1.getName()));
        } else {
            switchHit = new StringBuilder(String.format("\n%s is winner!",fighter2.getName()));
        }
        printConsole(switchHit.toString());
    }
}
