package game.Intellect;

import game.BaseUnit;

import java.util.List;

public class Intellect extends BaseUnit {
    protected int intellect;

    public Intellect(String name, int HP, int maxHP, int attack, int attackRange, int defense, int initiative,
                     int level, int experience, int intellect, int x, int y) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience, x, y);
        this.intellect = intellect;
    }

    @Override
    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

    @Override
    public void attack(BaseUnit target) {

    }

    @Override
    public void healing(BaseUnit target) {

    }

    @Override
    public void step(List<BaseUnit> team1, List<BaseUnit> team2) {

    }
}
