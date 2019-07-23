package com.tavisca.workshops.pratham.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTest
{
    @Test
    void vectorInitializesWithGivenDetails()
    {
        Vector r = new Vector(10, 10, 'N');
        assertEquals(10, r.getX());
        assertEquals(10, r.getX());
        assertEquals(10, r.getX());
    }

    @Test
    void  vectorCanRotateLeftFromNorth()
    {
        Vector r = new Vector(10, 10, 'N');
        Vector newVector = r.turnLeft();
        assertEquals('W', newVector.getDirection());
    }

    @Test
    void  vectorCanRotateRightFromNorth()
    {
        Vector r = new Vector(10, 10, 'N');
        Vector newVector = r.turnRight();
        assertEquals('W', newVector.getDirection());
    }

}
