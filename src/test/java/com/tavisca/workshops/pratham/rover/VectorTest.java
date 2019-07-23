package com.tavisca.workshops.pratham.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    @Test
    void vectorInitializesWithGivenDetails(){
        Vector v = new Vector(10, 10, 'N');
        assertEquals(10, v.x);
        assertEquals(10, v.y);
        assertEquals('N', v.direction);
    }

    @Test
    void vectorCanRotateLeftFromNorth(){
        Vector v = new Vector(10, 10, 'N');
        Rover r = new Rover(v);
        Vector newVector = r.turnLeft();
        assertEquals('W',newVector.direction);
    }

    @Test
    void vectorCanRotateLeftFromWest(){
        Vector v = new Vector(10, 10, 'W');
        Rover r = new Rover(v);
        Vector newVector = r.turnLeft();
        assertEquals('S',newVector.direction);
    }

    @Test
    void vectorCanRotateLeftFromSouth(){
        Vector v = new Vector(10, 10, 'S');
        Rover r = new Rover(v);
        Vector newVector = r.turnLeft();
        assertEquals('E',newVector.direction);
    }

    @Test
    void vectorCanRotateLeftFromEast(){
        Vector v = new Vector(10, 10, 'E');
        Rover r = new Rover(v);
        Vector newVector = r.turnLeft();
        assertEquals('N',newVector.direction);
    }


    @Test
    void vectorCanRotateRightFromNorth(){
        Vector v = new Vector(10, 10, 'N');
        Rover r = new Rover(v);
        Vector newVector = r.turnRight();
        assertEquals('E',newVector.direction);
    }

    @Test
    void vectorCanRotateRightFromWest(){
        Vector v = new Vector(10, 10, 'W');
        Rover r = new Rover(v);
        Vector newVector = r.turnRight();
        assertEquals('N',newVector.direction);
    }

    @Test
    void vectorCanRotateRightFromSouth(){
        Vector v = new Vector(10, 10, 'S');
        Rover r = new Rover(v);
        Vector newVector = r.turnRight();
        assertEquals('W',newVector.direction);
    }

    @Test
    void vectorCanRotateRightFromEast(){
        Vector v = new Vector(10, 10, 'E');
        Rover r = new Rover(v);
        Vector newVector = r.turnRight();
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


}
