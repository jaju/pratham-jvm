package com.tavisca.workshops.pratham.rover;

import java.util.HashMap;

public class Vector
{
    private final int x;
    private final int y;
    private final char direction;

    public Vector(int x, int y, char direction)
    {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getY()
    {
        return y;
    }

    public char getDirection()
    {
        return direction;
    }

    public int getX()
    {
        return x;
    }

    private static HashMap<Character, Character> leftMap
            = new HashMap<Character, Character>()
                {{
                    put('N', 'W');
                    put('W', 'S');
                    put('E', 'N');
                    put('S', 'E');

                }};

    private static HashMap<Character, Character> rightMap
            = new HashMap<Character, Character>()
                {{
                    put('N', 'E');
                    put('W', 'N');
                    put('E', 'S');
                    put('S', 'W');
            }};

    public Vector turnLeft()
    {
        return new Vector(this.x, this.y, leftMap.get(this.direction));
    }

    public Vector turnRight()
    {
        return new Vector(this.x, this.y, rightMap.get(this.direction));
    }

}
