package game.Strength;

import game.BaseUnit;
import game.MyInterface;
import game.Position;

import java.util.ArrayList;
import java.util.List;

public class Spearman extends Strength {
    protected int armor;

    public Spearman(String name, int x, int y) {
        super(name, 150, 150, 20, 2, 15, 2, 1, 0, x, y);
        this.armor = armor;
    }

    //    public String getInfo() {
//        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
//    }
    public String getInfo() {
        return "Копейщик";
    }


    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if (hp <= 0) return;
        if(findNearestTarget(enemy) == null){
            return;
        }
        BaseUnit target = super.findNearestTarget(enemy);
        if (position.getDistance(target.position) < 2) {
            hitEnemy(findNearestTarget(enemy));
            return;
        }
        Position diff = position.getDiffPos(target.position);
        Position newposition = new Position(position.getX(), position.getY());
        if (Math.abs(diff.x) > Math.abs(diff.y))
            newposition.x += diff.x < 0 ? 1 : -1;
        else
            newposition.y += diff.y < 0 ? 1 : -1;

        for (BaseUnit unit : friend) {
            if (unit.position.equals(newposition) && unit.getHp() > 0) return;

        }
        this.position = newposition;

    }
}
