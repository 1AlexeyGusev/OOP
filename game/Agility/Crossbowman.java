package game.Agility;

public class Crossbowman extends Agility {
    protected int bolt;
    protected int accuracy;
    public Crossbowman(String name, int x, int y) {
        super(name, 100, 100, 20, 1, 15, 2, 1, 0, x, y, 10);
        this.bolt = bolt;
        this.accuracy = accuracy;
    }

    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
}
