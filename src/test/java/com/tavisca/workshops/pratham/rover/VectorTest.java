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
    void wrongVectorDirectionThrowRuntimeException(){
        assertThrows(RuntimeException.class , () ->  new Vector(10, 10, 'P'));
    }

}
