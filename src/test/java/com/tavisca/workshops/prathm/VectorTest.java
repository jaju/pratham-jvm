package com.tavisca.workshops.prathm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class VectorTest {
    @Test
    void roverInitializesWithStartingPosition(){
        Vector r = new Vector(10, 10, 'N');
        assertEquals(10, r.x);
        assertEquals(10, r.y);
        assertEquals('N', r.direction);
    }

    @Test
    void roverCanRotateLeftFromNorth() {
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.turnLeft();
        assertEquals('W', newVector.direction);
    }

    @Test
    void roverCanRotateLeftFromWest() {
        Vector r = new Vector(10,10,'W');
        Vector newVector = r.turnLeft();
        assertEquals('S', newVector.direction);
    }

    @Test
    void roverCanRotateLeftFromSouth() {
        Vector r = new Vector(10,10,'S');
        Vector newVector = r.turnLeft();
        assertEquals('E', newVector.direction);
    }

    @Test
    void roverCanRotateLeftFromEast() {
        Vector r = new Vector(10,10,'E');
        Vector newVector = r.turnLeft();
        assertEquals('N', newVector.direction);
    }

    @Test
    void roverCanRotateRightFromNorth() {
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.turnRight();
        assertEquals('E', newVector.direction);
    }

    @Test
    void roverCanRotateRightFromWest() {
        Vector r = new Vector(10,10,'W');
        Vector newVector = r.turnRight();
        assertEquals('N', newVector.direction);
    }

    @Test
    void roverCanRotateRightFromSouth() {
        Vector r = new Vector(10,10,'S');
        Vector newVector = r.turnRight();
        assertEquals('W', newVector.direction);
    }

    @Test
    void roverCanRotateRightFromEast() {
        Vector r = new Vector(10,10,'E');
        Vector newVector = r.turnRight();
        assertEquals('S', newVector.direction);
    }

    @Test
    void roverMovesInEast(){
        Rover r = new Rover(10, 10, 'E');
        Rover newRover = r.MoveForward();
        assertEquals(11, newRover.getPositionOfX());
    }

    @Test
    void roverMovesInWest(){
        Rover r = new Rover(10, 10, 'W');
        Rover newRover = r.MoveForward();
        assertEquals(9, newRover.getPositionOfX());
    }

    @Test
    void roverMovesInNorth(){
        Rover r = new Rover(10, 10, 'N');
        Rover newRover = r.MoveForward();
        assertEquals(11, newRover.getPositionOfY());
    }

    @Test
    void roverMovesInSouth(){
        Rover r = new Rover(10, 10, 'S');
        Rover newRover = r.MoveForward();
        assertEquals(9, newRover.getPositionOfY());
    }
}

