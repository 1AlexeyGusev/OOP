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

    @Override
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }

    @Override
    public void step(List<BaseUnit> team1, List<BaseUnit> team2) {
        super.step(team1, team2);
    }
}
