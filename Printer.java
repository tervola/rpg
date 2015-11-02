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
}
