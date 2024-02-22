package game.Intellect;

import game.BaseUnit;

public class Intellect extends BaseUnit {
    private int intellect;
    private int magic;
    private int maxMagic;
    public Intellect(String name, int HP, int maxHP, int attack, int attackRange, int defense, int initiative,
                     int level, int experience, int intellect, int magic, int maxMagic, int x, int y) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience, x, y);
        this.intellect = intellect;
        this.maxMagic = this.magic = magic;
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
}
