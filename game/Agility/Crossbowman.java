package game.Agility;

import game.BaseUnit;
import game.Strength.Peasant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Crossbowman extends Agility {
    protected int bolt;
    protected int maxBolt;
    protected double accuracy;

    public Crossbowman(String name, int x, int y) {
        super(name, 100, 100, 30, 1, 15, 3, 1, 0, x, y, 10);
        this.maxBolt = this.bolt = 50;
        this.accuracy = 1;

    }

    //    public String getInfo() {
//        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
//    }
    public String getInfo() {
        return "Арбалетчик";
    }

    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if (getHp() <= 0 || bolt == 0) return;
        hitEnemy(findNearestTarget(enemy));
        bolt--;
        if (bolt < maxBolt){

            for (BaseUnit unit : friend) {
                if (unit.getInfo().equals("Фермер") && !((Peasant)unit).flag) {
                    ((Peasant)unit).flag = true;
                    bolt++;
                    return;
                }
            }
        }
    }
}
