package Patterns.aStrategy.Wiapons;

/**
 * Created by Zigner on 11/1/2015.
 */
public enum Behaviors {
    SWORD("sword"),
    BOW("bow");

    private String value;

    Behaviors(String s) {
        this.value = s;
    }

    public String getBehavior(){
        return this.value;
    }


}
