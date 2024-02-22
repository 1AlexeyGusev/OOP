package game.Strength;

public class Peasant extends Strength {

    public Peasant(String name, int x, int y) {
        super(name, 20, 20, 3, 1, 5, 1, 1, 0, x, y);
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
}