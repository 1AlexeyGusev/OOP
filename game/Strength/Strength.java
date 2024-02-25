package game.Strength;

import game.BaseUnit;

import java.util.List;

class Strength extends BaseUnit {
    protected int strength;
    protected int stamina;
    protected int maxStamina;

    public Strength(String name, int HP, int maxHP, int attack, int attackRange, int defense, int initiative,
                    int level, int experience, int x, int y) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience, x, y);
        this.strength = strength;
        this.maxStamina = this.stamina = stamina;

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
