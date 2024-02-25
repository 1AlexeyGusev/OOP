package game;

import java.util.List;

public abstract class BaseUnit implements MyInterface {
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

    /**
     * Метод поиска ближайшего противника
     * @param targets список противников
     * @return ближайшего противника
     */
    public BaseUnit findNearestTarget(List<BaseUnit> targets) {
        if (targets == null || targets.isEmpty()) {
            throw new IllegalArgumentException("Противников нет!");
        }
        BaseUnit nearestTarget = null;
        double minDistanse = Double.MAX_VALUE;
        for (BaseUnit target : targets) {
            double distance = this.position.getDistance(target.position);
            if (distance < minDistanse) {
                minDistanse = distance;
                nearestTarget = target;
            }
        }
        return nearestTarget;
    }
}
