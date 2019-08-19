package com.tavisca.workshops.prathm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
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
    //**********************************************************************************************************************
//**********************************************************************************************************************
    @Test
    void roverRotatingLeftFromNorth() {
        Rover r = new Rover(10,10,'N');
        Rover newRover = r.turnLeft();
        assertEquals('W', newRover.direction());
    }

    @Test
    void roverRotatingLeftFromWest() {
        Rover r = new Rover(10,10,'W');
        Rover newRover = r.turnLeft();
        assertEquals('S', newRover.direction());
    }

    @Test
    void roverRotatingLeftFromSouth() {
        Rover r = new Rover(10,10,'S');
        Rover newRover = r.turnLeft();
        assertEquals('E', newRover.direction());
    }

    @Test
    void roverRotatingLeftFromEast() {
        Rover r = new Rover(10,10,'E');
        Rover newRover = r.turnLeft();
        assertEquals('N', newRover.direction());
    }
    //**********************************************************************************************************************
    @Test
    void roverRotatingRightFromNorth() {
        Rover r = new Rover(10,10,'N');
        Rover newRover = r.turnRight();
        assertEquals('E', newRover.direction());
    }

    @Test
    void roverRotatingRightFromWest() {
        Rover r = new Rover(10,10,'W');
        Rover newRover = r.turnRight();
        assertEquals('N', newRover.direction());
    }

    @Test
    void roverRotatingRightFromSouth() {
        Rover r = new Rover(10,10,'S');
        Rover newRover = r.turnRight();
        assertEquals('W', newRover.direction());
    }

    @Test
    void roverRotatingRightFromEast() {
        Rover r = new Rover(10,10,'E');
        Rover newRover = r.turnRight();
        assertEquals('S', newRover.direction());
    }
}
