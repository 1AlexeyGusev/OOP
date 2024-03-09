package game.Strength;

import game.BaseUnit;

import java.util.ArrayList;
import java.util.List;

public class Peasant extends Strength {
    int ammo;
    public boolean flag;

    public Peasant(String name, int x, int y) {

        super(name, 20, 20, 3, 1, 5, 0, 1, 0, x, y);
        ammo = 0;
        flag = false;
    }

public String getInfo(){
        return "Фермер";
    }

    public void step(ArrayList<BaseUnit> targets, ArrayList<BaseUnit> friends) {

        if (getHp() <= 0) return;
        flag = false;
    }
}

