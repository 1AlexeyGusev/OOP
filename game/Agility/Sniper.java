package game.Agility;

import game.BaseUnit;
import game.Strength.Peasant;

import java.util.ArrayList;
import java.util.List;

public class Sniper extends Agility {
    protected int bullets;
    protected int maxBullets;

    public Sniper(String name, int x, int y) {
        super(name, 100, 100, 12, 8, 5, 3, 1, 0, x, y, 12);
        this.maxBullets = this.bullets = 100;
    }

    public String getInfo() {
        return "Снайпер";
    }

    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if ((getHp() <= 0) || (bullets == 0)) return;
        hitEnemy(findNearestTarget(enemy));
        bullets--;
        if (bullets < maxBullets){

            for (BaseUnit unit : friend) {
                if (unit.getInfo().equals("Фермер") && !((Peasant)unit).flag) {
                    ((Peasant)unit).flag = true;
                    bullets++;
                    return;
                }
            }
        }
    }
}
