package game.Strength;

public class Spearman extends Strength {
    int armor;
    public Spearman(String name, int x, int y) {
        super(name, 150, 150, 20, 2, 20, 3, 1, 0, x, y);
        this.armor = armor;
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
}
