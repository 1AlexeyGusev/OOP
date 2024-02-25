package game;

import java.util.List;

public interface MyInterface {
    /**
     * Метод совершения хода
     * @param team1 - 1я команда
     * @param team2 - 2я команда
     */
    public void step(List<BaseUnit>team1, List<BaseUnit>team2);
}
