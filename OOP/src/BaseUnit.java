
public abstract class BaseUnit {
    protected String name;
    protected int hp;
    protected int maxhp;
    protected int attack;
    protected int attackRange;
    protected int defense;
    protected int initiative;
    protected int level;
    protected int experience;

    public BaseUnit(String name, int hp, int maxhp, int attack, int attackRange, int defense, int initiative, int level,
                    int experience){
        this.name = name;
        this.maxhp = this.hp = hp;
        this. attack = attack;
        this.attackRange = attackRange;
        this.defense = defense;
        this.initiative = initiative;
        this.level = level;
        this.experience = experience;
    }
    public abstract void GetDamage(int damage);
    public abstract void Attack(BaseUnit target);
    public abstract void Healing(BaseUnit target);
}
