package game.Intellect;

import game.BaseUnit;
import game.Strength.Peasant;

import java.util.ArrayList;
import java.util.List;

public class Magician extends Intellect {
    protected int mana;
    protected int maxMana;

    public Magician(String name, int x, int y) {
        super(name, 80, 80, 8, 7, 6, 1, 1, 0, 30, x, y);
        this.maxMana = this.mana = 15;
    }

    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if ((getHp() <= 0) || (mana < 3)) {
            mana += 1;
        } else {
            hitEnemy(findNearestTarget(enemy));
            mana -= 3;
        }
    }

    public String getInfo() {
        return "Маг";
    }

}
