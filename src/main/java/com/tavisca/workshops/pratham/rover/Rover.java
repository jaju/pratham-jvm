package com.tavisca.workshops.pratham.rover;

public class Rover
{
    Vector vector;

    public void roverSetUp(int x, int y, Direction d)
    {
        vector = new Vector(x, y, d);
    }

    public String getFinalPosition(String currentPosition, String commands)
    {
        String[] positions = currentPosition.split(" ");

        int x = Integer.valueOf(positions[0]);
        int y = Integer.valueOf(positions[1]);
        Direction direction = Vector.charToDirection.get(positions[2].charAt(0));

        roverSetUp(x, y, direction);

        for (char command : commands.toCharArray())
        {
            rove(command);
        }

        return vector.x + " " + vector.y + " " + Vector.directionToChar.get(vector.direction);
    }

    private void rove(char command)
    {
        switch(command)
        {
            case 'L':
                vector = vector.left();
                break;
            case 'R':
                vector = vector.right();
                break;
            case 'M':
                vector = vector.next();
                break;
        }
    }
}
