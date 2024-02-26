package game.Agility;

import game.BaseUnit;

import java.util.List;

public class Crossbowman extends Agility {
    protected int bolt;
    protected int accuracy;
    public Crossbowman(String name, int x, int y) {
        super(name, 100, 100, 20, 1, 15, 3, 1, 0, x, y, 10);
        this.bolt = bolt;
        this.accuracy = accuracy;
    }

    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }

    @Override
    public void step(List<BaseUnit> team1, List<BaseUnit> team2) {
        super.step(team1, team2);
        if ((hp<=0) || (bolt == 0)) return;
        BaseUnit target = super.findNearestTarget(team2);
        target.getDamage(this.attack);
        bolt--;
    }
}
