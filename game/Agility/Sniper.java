package game.Agility;

public class Sniper extends Agility {
    int accuracy;
    int ammo;
    public Sniper(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative,
                  int level, int experience, int agility, int accuracy, int ammo) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience, agility);
        this.accuracy = accuracy;
        this.ammo = ammo;
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
}
