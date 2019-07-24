package com.tavisca.workshops.pratham.rover;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoverTest
{
    @Test
    void testRoverSetUp()
    {
        Rover r = new Rover();
        r.roverSetUp(3, 3, Direction.EAST);
        assertEquals(3, r.vector.x);
        assertEquals(3, r.vector.y);
        assertEquals(Direction.EAST, r.vector.direction);
    }

    @Test
    void roverMoveAccordingToGivenCommands()
    {
        Rover r = new Rover();
        String currentPosition = "3 3 E";
        String commands = "MMRMMRMRRM";

        assertEquals("5 1 E", r.getFinalPosition(currentPosition, commands));
    }
}
