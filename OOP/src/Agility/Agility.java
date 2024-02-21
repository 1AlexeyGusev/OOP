package Agility;

public class Agility extends BaseUnit {
    private int agility;

    public Agility(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative, int level, int experience,
                   int agility) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience);
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
}
