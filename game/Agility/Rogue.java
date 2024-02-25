package game.Agility;

import game.BaseUnit;

import java.util.List;

public class Rogue extends Agility {
    protected int venom;
    protected double stealth;
    public Rogue(String name, int x, int y) {
        super(name, 90, 90, 12, 1, 5, 1, 1, 0,x, y, 20);
        this.venom = venom;
        this.stealth = stealth;
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }

    @Override
    public void step(List<BaseUnit> team1, List<BaseUnit> team2) {
        super.step(team1, team2);
    }
}
