package com.tavisca.workshops.pratham.rover;

public class Rover
{
    Vector v;
    public void roverSetUp(int x, int y, char direction)
    {
        v = new Vector(x, y, direction);
    }

    public void getFinalPosition(String currentPosition, String commands)
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
    }

    private void rove(char command)
    {

    }
}
