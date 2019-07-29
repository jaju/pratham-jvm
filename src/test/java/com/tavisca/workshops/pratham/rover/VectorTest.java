package com.tavisca.workshops.pratham.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    @Test
    void vectorInitializesWithGivenDetails(){
        Vector v = new Vector(10, 10, new North());
        assertEquals(10, v.x);
        assertEquals(10, v.y);
        assert(v.direction instanceof North);
    }
    @Test
    void vectorCanRotateLeftFromNorth(){
        Vector v = new Vector(10, 10, new North());
        Rover r = new Rover(v);
        Vector newVector = r.turnLeft();
        assert(newVector.direction instanceof West);
    }
    @Test
    void vectorCanRotateLeftFromWest(){
        Vector v = new Vector(10, 10, new West());
        Rover r = new Rover(v);
        Vector newVector = r.turnLeft();
        assert(newVector.direction instanceof South);
    }
    @Test
    void vectorCanRotateLeftFromSouth(){
        Vector v = new Vector(10, 10, new South());
        Rover r = new Rover(v);
        Vector newVector = r.turnLeft();
        assert(newVector.direction instanceof East);
    }
    @Test
    void vectorCanRotateLeftFromEast(){
        Vector v = new Vector(10, 10, new East());
        Rover r = new Rover(v);
        Vector newVector = r.turnLeft();
        assert(newVector.direction instanceof North);
    }
    @Test
    void vectorCanRotateRightFromNorth(){
        Vector v = new Vector(10, 10, new North());
        Rover r = new Rover(v);
        Vector newVector = r.turnRight();
        assert(newVector.direction instanceof East);
    }
    @Test
    void vectorCanRotateRightFromWest(){
        Vector v = new Vector(10, 10, new West());
        Rover r = new Rover(v);
        Vector newVector = r.turnRight();
        assert(newVector.direction instanceof North);
    }
    @Test
    void vectorCanRotateRightFromSouth(){
        Vector v = new Vector(10, 10, new South());
        Rover r = new Rover(v);
        Vector newVector = r.turnRight();
        assert(newVector.direction instanceof West);
    }
    @Test
    void vectorCanRotateRightFromEast(){
        Vector v = new Vector(10, 10, new East());
        Rover r = new Rover(v);
        Vector newVector = r.turnRight();
        assert(newVector.direction instanceof South);
    }
//    @Test
//    void wrongVectorDirectionThrowRuntimeException(){
//        assertThrows(RuntimeException.class , () ->  new Vector(10, 10, 'P'));
//    }

}
