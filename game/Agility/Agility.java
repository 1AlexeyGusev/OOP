package game.Agility;

import game.BaseUnit;

import java.util.List;

public class Agility extends BaseUnit {
    private int agility;

    public Agility(String name, int HP, int maxHP, int attack, int attackRange, int defense, int initiative, int level, int experience,
                   int x, int y,int agility) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience, x, y);
        this.agility = agility;
    }

    @Override
    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

    @Override
    public void Attack(BaseUnit target) {

    }

    @Override
    public void Healing(BaseUnit target) {

    }

    @Override
    public void step(List<BaseUnit> team1, List<BaseUnit> team2) {

    }
}
