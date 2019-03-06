package uk.sky.loki.starter;

import java.util.Objects;

public class PositionXYZ extends Position
{
    private int z;

    public PositionXYZ(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }


    @Override
    public boolean equals(Object object) {

        if (object == null) {
            return false;
        }

        if(!(object.getClass().equals(Position.class))){
            return false;
        }

        PositionXYZ position = (PositionXYZ) object;

        return Objects.equals(position.getX(), this.getX()) && Objects.equals(position.getY(), this.getY()) && Objects.equals(position.getZ(), this.getZ());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.z, this.getY(), this.getX());
    }
}
