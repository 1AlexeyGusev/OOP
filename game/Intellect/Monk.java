package game.Intellect;

import game.BaseUnit;

import java.util.List;

public class Monk extends Intellect {
    protected int mana;
    protected int maxMana;

    public Monk(String name, int x, int y) {
        super(name, 85, 85, 10, 7, 5, 1, 1, 0, 25, x, y);
        this.maxMana = this.mana = mana;
    }

    //    public String getInfo() {
//        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
//    }
    public String getInfo() {
        return "Монах";
    }
}
