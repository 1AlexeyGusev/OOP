package game.Intellect;

import game.BaseUnit;

import java.util.List;

public class Magician extends Intellect {
    protected int mana;
    protected int maxMana;
    public Magician(String name, int x, int y) {
        super(name, 80, 80, 8, 7, 6, 1, 1, 0, 30, x, y);
        this.maxMana = this.mana = mana;
    }


//    public String getInfo() {
//        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
//    }
    public String getInfo(){
        return "Маг";
    }

}
