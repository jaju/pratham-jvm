package com.tavisca.workshops.pratham.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTest
{
    @Test
    void vectorInitializesWithGivenDetails()
    {
        Vector r = new Vector(10, 10, Direction.NORTH);
        assertEquals(10, r.x);
        assertEquals(10, r.y);
        assertEquals(Direction.NORTH, r.direction);
    }

    @Test
    void  vectorCanRotateLeftFromNorth()
    {
        Vector r = new Vector(10, 10, Direction.NORTH);
        Vector newVector = r.turnLeft();
        assertEquals(Direction.WEST, newVector.direction);
    }

    @Test
    void  vectorCanRotateRightFromNorth()
    {
        Vector r = new Vector(10, 10, Direction.NORTH);
        Vector newVector = r.turnRight();
        assertEquals(Direction.EAST, newVector.direction);
    }

    @Test
    void  vectorCanRotateLeftFromWest()
    {
        Vector r = new Vector(10, 10, Direction.WEST);
        Vector newVector = r.turnLeft();
        assertEquals(Direction.SOUTH, newVector.direction);
    }

    @Test
    void  vectorCanRotateRightFromWest()
    {
        Vector r = new Vector(10, 10, Direction.WEST);
        Vector newVector = r.turnRight();
        assertEquals(Direction.NORTH, newVector.direction);
    }

    @Test
    void  vectorCanRotateLeftFromSouth()
    {
        Vector r = new Vector(10, 10, Direction.SOUTH);
        Vector newVector = r.turnLeft();
        assertEquals(Direction.EAST, newVector.direction);
    }

    @Test
    void  vectorCanRotateRightFromSouth()
    {
        Vector r = new Vector(10, 10, Direction.SOUTH);
        Vector newVector = r.turnRight();
        assertEquals(Direction.WEST, newVector.direction);
    }

    @Test
    void  vectorCanRotateLeftFromEast()
    {
        Vector r = new Vector(10, 10, Direction.EAST);
        Vector newVector = r.turnLeft();
        assertEquals(Direction.NORTH, newVector.direction);
    }

    @Test
    void  vectorCanRotateRightFromEast()
    {
        Vector r = new Vector(10, 10, Direction.EAST);
        Vector newVector = r.turnRight();
        assertEquals(Direction.SOUTH, newVector.direction);
    }

    @Test
    void vectorCanMoveForwardInNorth()
    {
        Vector r = new Vector(10, 10, Direction.NORTH);
        Vector newVector = r.moveForward();
        assertEquals(11 , newVector.y);
    }
}
