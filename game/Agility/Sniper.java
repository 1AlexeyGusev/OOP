package game.Agility;

import game.BaseUnit;

import java.util.ArrayList;
import java.util.List;

public class Sniper extends Agility {
    protected int accuracy;
    protected int bullets;

    public Sniper(String name, int x, int y) {
        super(name, 100, 100, 12, 8, 5, 3, 1, 0, x, y, 12);
        this.accuracy = accuracy;
        this.bullets = bullets;
    }

    //    public String getInfo() {
//        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
//    }
    public String getInfo() {
        return "Снайпер";
    }

    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if ((hp <= 0) || (bullets == 0)) return;
        BaseUnit target = super.findNearestTarget(enemy);
        if (target == null) return;
        target.getDamage(this.attack);
        bullets--;
    }
}
