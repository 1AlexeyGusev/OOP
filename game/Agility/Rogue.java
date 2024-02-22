package game.Agility;

public class Rogue extends Agility {
    int venom;
    double stealth;
    public Rogue(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative,
                 int level, int experience, int agility, int venom, double stealth) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience, agility);
        this.venom = venom;
        this.stealth = stealth;
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
}
