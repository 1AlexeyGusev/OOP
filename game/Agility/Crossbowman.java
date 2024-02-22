package game.Agility;

public class Crossbowman extends Agility {
    int bolt;
    int accuracy;
    public Crossbowman(String name, int HP, int maxHP, int attack, int attackRange, int defense,
                       int initiative, int level, int experience, int agility, int bolt, int accuracy) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience, agility);
        this.bolt = bolt;
        this.accuracy = accuracy;
    }

    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
}
