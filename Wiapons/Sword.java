package Patterns.aStrategy.Wiapons;

/**
 * Created by Zigner on 10/31/2015.
 */
public class Sword implements Behavior {
    @Override
    public void execute() {
        System.out.println("cut to opponent");
    }
}
