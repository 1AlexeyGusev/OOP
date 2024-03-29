package game.Agility;

import game.BaseUnit;
import game.Position;

import java.util.ArrayList;
import java.util.List;

public class Rogue extends Agility {
    protected int venom;
    protected double stealth;
    public Rogue(String name, int x, int y) {
        super(name, 90, 90, 12, 1, 5, 2, 1, 0,x, y, 20);
        this.venom = venom;
        this.stealth = stealth;
    }
//    public String getInfo() {
//        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
//    }
public String getInfo(){
    return "Разбойник";
}
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if (hp<=0) return;
        if(findNearestTarget(enemy) == null){
            return;
        }

        BaseUnit target = super.findNearestTarget(enemy);
        if (position.getDistance(target.position) < 2){
            hitEnemy(target);
            return;
        }
        Position diff = position.getDiffPos(target.position);

        Position newposition = new Position(position.x, position.y);

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
