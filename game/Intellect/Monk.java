package game.Intellect;

import game.BaseUnit;
import game.MyInterface;

import java.util.ArrayList;
import java.util.List;

public class Monk extends Intellect {
    protected int mana;
    protected int maxMana;
    boolean flag;

    public Monk(String name, int x, int y) {
        super(name, 85, 85, 10, 7, 5, 1, 1, 0, 25, x, y);
        this.maxMana = this.mana = 10;
        flag = false;

    }

    public String getInfo() {
        return "Монах";
    }

    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if (getHp() <= 0) return;
        ArrayList<BaseUnit> sortlist = new ArrayList<>(friend);
        ArrayList<BaseUnit> deadlist = new ArrayList<>();
        sortlist.sort((o1, o2) -> (int) (o1.getHp() - o2.getHp()));
        for (BaseUnit unit : sortlist) {
            if (unit.getHp() == 0) {
                deadlist.add(unit);
            }
        }
        if (deadlist.size() > 3 ) {
            flag = true;
            System.out.println("Флаг установлен");
        }

        if (flag && mana == 10) {
            deadlist.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative());
            deadlist.getFirst().setHp(maxhp);
            mana = 0;
            System.out.println("Воскресил: " + deadlist.getFirst().getName());
            flag = false;
            return;
        }
        if (flag) {
            mana++;
            return;
        }
        if (mana < 2) {
            mana++;
            return;
        }
        Healing(sortlist.getFirst());
        mana -= 2;
    }
}
