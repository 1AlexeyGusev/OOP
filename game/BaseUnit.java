package game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseUnit implements MyInterface {
    protected String name;
    protected double hp;
    protected double maxhp;
    protected int attack;
    protected int attackRange;
    protected int defense;
    protected int initiative;
    protected int level;
    protected int experience;
    int x;
    int y;
    public Position position;


    public BaseUnit(String name, double hp, double maxhp, int attack, int attackRange, int defense, int initiative, int level,
                    int experience, int x, int y) {
        this.name = name;
        this.maxhp = this.hp = hp;
        this.attack = attack;
        this.attackRange = attackRange;
        this.defense = defense;
        this.initiative = initiative;
        this.level = level;
        this.experience = experience;
        this.position = new Position(x, y);
    }

    public int getInitiative() {
        return initiative;
    }

    public double getHp() {
        return hp;
    }

    //    public String getInfo() {
//        return String.format("Name: %s HP: %d LVL: %d", this.name, this.hp, this.level);
//    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name + ", \u2665: " + hp + ",  ⚔ : " + attack + ", \uD83D\uDEE1\uFE0F :" + defense;
    }

    /**
     * Метод получения урона
     * @param damage урон
     */
    public void getDamage(double damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
            death();
        }
        if (hp >= maxhp) hp = maxhp;
    }

    public void hitEnemy(BaseUnit target) {
        double damage = this.attack - target.defense;
        target.getDamage(damage);
    }

    public void Healing(BaseUnit target) {
        int heal = this.attack;
        target.hp += heal;
        if (target.hp > target.maxhp) {
            target.hp = target.maxhp;
        }
    }

    public void death() {
        if (getHp() <= 0) {
            System.out.println("Персонаж умер...");
        }

    }


    public boolean isDead() {
        if (getHp() <= 0) {
            return true;
        }
        return false;
    }

    /**
     * Метод атаки
     *
     * @param target - противник
     */


    /**
     * Метод поиска ближайшего противника
     *
     * @param targets список противников
     * @return ближайшего противника
     */
    public BaseUnit findNearestTarget(ArrayList<BaseUnit> targets) {
        if (targets == null || targets.isEmpty()) {
            throw new IllegalArgumentException("Противников нет!");
        }
        BaseUnit nearestTarget = null;
        double minDistanse = Double.MAX_VALUE;
        for (BaseUnit target : targets) {
            double distance = this.position.getDistance(target.position);
            if (distance < minDistanse && target.hp > 0) {
                minDistanse = distance;
                nearestTarget = target;
            }
        }
        return nearestTarget;
    }


    public abstract void healing(BaseUnit target);

    public String getInfo() {
        return "";
    }
}

