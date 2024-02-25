package game;

public class Position {
    int x, y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setPosition(int valueX, int valueY){
        this.x = valueX;
        this.y = valueY;

    }
}
