package game.Intellect;

import game.BaseUnit;

import java.util.ArrayList;
import java.util.List;

public class Intellect extends BaseUnit {
    protected int intellect;

    public Intellect(String name, double hp, double maxhp, int attack, int attackRange, int defense, int initiative,
                     int level, int experience, int intellect, int x, int y) {
        super(name, hp, maxhp, attack, attackRange, defense, initiative, level, experience, x, y);
        this.intellect = intellect;
    }


    @Override
    public void healing(BaseUnit target) {

    }
    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {

    }
}
