package game.Agility;

public class Sniper extends Agility {
    protected int accuracy;
    protected int ammo;
    public Sniper(String name, int x, int y) {
        super(name, 100, 100, 12, 8, 5, 1, 1, 0, x, y, 12);
        this.accuracy = accuracy;
        this.ammo = ammo;
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
}
