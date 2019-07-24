package com.tavisca.workshops.pratham.rover;

public class Rover
{
    Vector vector;

    public void roverSetUp(int x, int y, char d)
    {
        Direction direction = Vector.charToDirection.get(d);
        vector = new Vector(x, y, direction);
    }

    public String getFinalPosition(String currentPosition, String commands)
    {
        String[] positions = currentPosition.split(" ");

        int x = Integer.valueOf(positions[0]);
        int y = Integer.valueOf(positions[1]);
        char dir = positions[2].charAt(0);

        roverSetUp(x, y, dir);

        for (char command : commands.toCharArray())
        {
            rove(command);
        }

        return vector.x + " " + vector.y + " " + vector.direction;
    }

    private void rove(char command)
    {
        switch(command)
        {
            case 'L':
                vector = vector.turnLeft();
                break;
            case 'R':
                vector = vector.turnRight();
                break;
            case 'M':
                vector = vector.moveForward();
                break;

        }
    }
}
