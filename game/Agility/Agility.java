package game.Agility;

import game.BaseUnit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Agility extends BaseUnit {
    private int agility;

    public Agility(String name, double hp, double maxhp, int attack, int attackRange, int defense, int initiative, int level, int experience,
                   int x, int y,int agility) {
        super(name, hp, maxhp, attack, attackRange, defense, initiative, level, experience, x, y);
        this.agility = agility;
    }


    @Override
    public void healing(BaseUnit target) {

    }


    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
    }
}
