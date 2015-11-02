package Patterns.aStrategy.Wiapons;

/**
 * Created by Zigner on 10/31/2015.
 */
public class Bow implements Behavior {

    @Override
    public void execute() {
        System.out.println("shout to opponent");
    }

    @Override
    public String toString(){
        return getClass().getSimpleName();
    }
}
