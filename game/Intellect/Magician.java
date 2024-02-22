package game.Intellect;

public class Magician extends Intellect {
    int mana;
    int maxMana;
    public Magician(String name, int x, int y) {
        super(name, 80, 80, 8, 7, 6, 1, 1, 0, 30,
                100, 100, x, y);
        this.maxMana = this.mana = mana;
    }

    @Override
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
}
