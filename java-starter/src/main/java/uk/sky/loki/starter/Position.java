package uk.sky.loki.starter;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position move(int moveX, int moveY) {
        return new Position(this.getX()+moveX, this.getY()+moveY);
    }

    @Override
    public boolean equals(Object object){
        if (object == null) {
            return false;
        }

        if(!(object.getClass().equals(Position.class))){
            return false;
        }


        Position position = (Position)object;
        return this.getX() == position.getX()
                && this.getY() == position.getY();
    }

    @Override
    public int hashCode(){
        return (x)*19+(y)*7;
    }
}
