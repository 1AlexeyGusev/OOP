package game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface MyInterface {
    /**
     * Метод совершения хода
     * @param enemy - 1я команда
     * @param friend - 2я команда
     */
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit>friend);
}
