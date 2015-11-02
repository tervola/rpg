package Patterns.aStrategy;

import Patterns.aStrategy.Buildings.Arena;
import Patterns.aStrategy.Wiapons.Behavior;
import Patterns.aStrategy.Wiapons.Bow;
import Patterns.aStrategy.Wiapons.Sword;

/**
 * Created by Zigner on 10/31/2015.
 */
public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Arena arena = new Arena();
        arena.setWarriors("Conan", "Xena");
        printer.printBanner(arena.getWarriors());

    }



}
