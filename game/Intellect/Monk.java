package game.Intellect;

public class Monk extends Intellect {
    int mana;
    int maxMana;

    public Monk(String name, int x, int y) {
        super(name, 85, 85, 10, 7, 5, 2, 1, 0, 25,
                100, 100, x, y);
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
}
