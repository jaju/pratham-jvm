package com.tavisca.workshops.pratham.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    @Test
    void roverCanTakeStringCommands(){
        String commands = "MMRMMRMRRM";
        Vector v = new Vector(3,3,'E');
        Rover r = new Rover(v);
        assertEquals("newPosition...5 1 E",r.Rove(commands));
    }
    @Test
    void roverCanTakeMultipleMoveCommands(){
        Vector v = new Vector(10, 10, 'W');
        Rover r = new Rover(v);
        Vector newVector = r.move();
        for(int i = 0; i < 5; i++){
            newVector = r.move();
        }
        assertEquals(4, newVector.x);
        assertEquals(10, newVector.y);
        assertEquals('W',newVector.direction);
    }
    @Test
    void roverCanRotateMultipleTimes(){
        Vector v = new Vector(10, 10, 'W');
        Rover r = new Rover(v);
        Vector newVector = r.turnLeft();
        for(int i = 0; i < 2; i++){
            newVector = r.turnLeft();
        }
        assertEquals(10, newVector.x);
        assertEquals(10, newVector.y);
        assertEquals('N',newVector.direction);
    }
    @Test
    void roverCanMoveAndRotateLeft(){
        Vector v = new Vector(10, 10, 'W');
        Rover r = new Rover(v);
        Vector newVector = r.turnLeft();
        for(int i = 0; i < 2; i++){
            newVector = r.move();
        }
        assertEquals(10, newVector.x);
        assertEquals(8, newVector.y);
        assertEquals('S',newVector.direction);
    }
    @Test
    void roverCanMoveAndRotateRight(){
        Vector v = new Vector(10, 10, 'W');
        Rover r = new Rover(v);
        Vector newVector = r.turnRight();
        for(int i = 0; i < 2; i++){
            newVector = r.move();
        }
        assertEquals(10, newVector.x);
        assertEquals(12, newVector.y);
        assertEquals('N',newVector.direction);
    }
    @Test
    void roverDoingComplementaryActionsOnTurnRightAndTurnLeft(){
        Vector v = new Vector(10, 10, 'W');
        Rover r = new Rover(v);
        r.turnRight();
        Vector newVector = r.turnLeft();
        assertEquals(10, newVector.x);
        assertEquals(10, newVector.y);
        assertEquals('W',newVector.direction);
    }
    @Test
    void roverWorkingOnInterpersedCommands(){
        Vector v = new Vector(10, 10, 'W');
        Rover r = new Rover(v);
        r.turnRight();
        r.move();
        r.turnLeft();
        r.move();
        Vector newVector = r.turnLeft();
        assertEquals(9, newVector.x);
        assertEquals(11, newVector.y);
        assertEquals('S',newVector.direction);
    }
    @Test
    void roverCanMoveWhileFacingNorth(){
        Vector v = new Vector(10, 10, 'N');
        Rover r = new Rover(v);
        Vector newVector = r.move();
        assertEquals(10, newVector.x);
        assertEquals(11, newVector.y);
        assertEquals('N',newVector.direction);
    }
    @Test
    void roverCanMoveWhileFacingSouth(){
        Vector v = new Vector(10, 10, 'S');
        Rover r = new Rover(v);
        Vector newVector = r.move();
        assertEquals(10, newVector.x);
        assertEquals(9, newVector.y);
        assertEquals('S',newVector.direction);
    }
    @Test
    void roverCanMoveWhileFacingEast(){
        Vector v = new Vector(10, 10, 'E');
        Rover r = new Rover(v);
        Vector newVector = r.move();
        assertEquals(11, newVector.x);
        assertEquals(10, newVector.y);
        assertEquals('E',newVector.direction);
    }
    @Test
    void roverCanMoveWhileFacingWest(){
        Vector v = new Vector(10, 10, 'W');
        Rover r = new Rover(v);
        Vector newVector = r.move();
        assertEquals(9, newVector.x);
        assertEquals(10, newVector.y);
        assertEquals('W',newVector.direction);
    }
}
