package game;

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

    Position position;

    public BaseUnit(String name, int hp, int maxhp, int attack, int attackRange, int defense, int initiative, int level,
                    int experience, int x, int y) {
        this.name = name;
        this.maxhp = this.hp = hp;
        this.attack = attack;
        this.attackRange = attackRange;
        this.defense = defense;
        this.initiative = initiative;
        this.level = level;
        this.experience = experience;
        position = new Position(x, y);
    }

    public String getInfo() {
        return String.format("Name: %s HP: %d LVL: %d", this.name, this.hp, this.level);
    }

    public String getInfoPos() {
        return String.format("Name: %s HP: %d Position: %s", this.name, this.hp, position);
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

    public void Attack(BaseUnit target) {
        int damage = this.attack - target.defense;
    }

    public void Healing(BaseUnit target) {
        int heal = this.attack;
        target.hp += heal;
        if (target.hp > target.maxhp) {
            target.hp = target.maxhp;
        }
    }
}
