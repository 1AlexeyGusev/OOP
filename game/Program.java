package game;

import game.Agility.Crossbowman;

public class Program {
    public static void main(String[] args) {
        BaseUnit unit1 = new Crossbowman();
        System.out.println(unit1.getInfo());
    }
}
