package Intellect;

public class Intellect extends BaseUnit {
    private int intellect;
    private int magic;
    private int maxMagic;
    public Intellect(String name, int HP, int maxHP, int attack, int attackRange, int defence, int initiative, int level, int experience,
                     int intellect, int magic, int maxMagic) {
        super(name, HP, maxHP, attack, attackRange, defence, initiative, level, experience);
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
