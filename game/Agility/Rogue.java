package game.Agility;

import game.BaseUnit;

import java.util.List;

public class Rogue extends Agility {
    protected int venom;
    protected double stealth;
    public Rogue(String name, int x, int y) {
        super(name, 90, 90, 12, 1, 5, 2, 1, 0,x, y, 20);
        this.venom = venom;
        this.stealth = stealth;
    }
//    public String getInfo() {
//        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
//    }
public String getInfo(){
    return "Разбойник";
}

}
