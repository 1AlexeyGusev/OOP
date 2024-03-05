package game.Strength;

import game.BaseUnit;

import java.util.List;

public class Spearman extends Strength {
    protected int armor;
    public Spearman(String name, int x, int y) {
        super(name, 150, 150, 20, 2, 20, 2, 1, 0, x, y);
        this.armor = armor;
    }
//    public String getInfo() {
//        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
//    }
public String getInfo(){
    return "Копейщик";
}

}
