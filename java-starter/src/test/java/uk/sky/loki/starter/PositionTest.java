package uk.sky.loki.starter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class PositionTest {

    private Position position;

    @Test
    public void testPositionEquals() {
        Position positionOne = new Position(1,1);
        Position positionTwo = new Position(1,1);

        Assertions.assertThat(positionOne).isEqualTo(positionTwo);
    }

    @Test
    public void testPositionNotEquals() {
        Position positionOne = new Position(1,1);
        Position positionTwo = new Position(1,2);

        Assertions.assertThat(positionOne).isNotEqualTo(positionTwo);
    }

    @Test
    public void testPositionNotEqualsAgain() {
        Position positionOne = new Position(1,1);
        Position positionTwo = new Position(2,2);

        Assertions.assertThat(positionOne).isNotEqualTo(positionTwo);
    }

    @Test
    public void testPositionNotEqualsAgainAgain() {
        Position positionOne = new Position(2,1);
        Position positionTwo = new Position(1,2);

        Assertions.assertThat(positionOne).isNotEqualTo(positionTwo);
    }

    @Test
    public void PositionNotEqualToNull(){

        Position position = new Position(4,4);

        Assertions.assertThat(position).isNotEqualTo(null);
    }

    @Test
    public void equalsShouldBeReflective() {
        Position positionOne = new Position(1,1);

        Assertions.assertThat(positionOne).isEqualTo(positionOne);

    }

    @Test
    public void equalsIsSymmetric() {
        Position positionOne = new Position(1,1);
        Position positionTwo = new Position(1,1);

        Assertions.assertThat(positionOne).isEqualTo(positionTwo);
        Assertions.assertThat(positionTwo).isEqualTo(positionOne);
    }

    @Test
    public void equalsIsTransitive() {
        Position positionOne = new Position(1,1);
        Position positionTwo = new Position(1,1);
        Position positionThree = new Position(1,1);

        Assertions.assertThat(positionOne).isEqualTo(positionTwo);
        Assertions.assertThat(positionTwo).isEqualTo(positionThree);
        Assertions.assertThat(positionOne).isEqualTo(positionThree);
    }

    @Test
    public void PositionIsNotEqualToPositionXYZ(){
        Position positionOne = new Position(1,1);
        PositionXYZ positionTwo = new PositionXYZ(1,1, 1);

        Assertions.assertThat(positionOne).isNotEqualTo(positionTwo);
    }

    @Test
    public void hashCodeEquals(){
        //given
        Position positionOne = new Position(1,1);
        Position positionTwo = new Position(1,1);

        Assertions.assertThat(positionOne.hashCode()).isEqualTo(positionTwo.hashCode());


    }

    @Test
    public void moveXright() {
        Position one = new Position(1,1);

        Position move = one.move(1, 0);

        Assertions.assertThat(move.getX()).isEqualTo(2);
        Assertions.assertThat(move.getY()).isEqualTo(1);
    }

    @Test
    public void hacking() {
        Position one = new Position(1,1);

        HashSet<Position> hashSet = new HashSet<>();

        hashSet.add(one);

        Assertions.assertThat(hashSet).contains(one);
        int hashCodeBefore = one.hashCode();
        one.move(1,0);
        int hashCodeAfter = one.hashCode();
        Assertions.assertThat(hashSet.contains(one)).isEqualTo(true);
        Assertions.assertThat(hashCodeBefore).isEqualTo(hashCodeAfter);
    }





}
