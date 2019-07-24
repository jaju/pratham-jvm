package com.tavisca.workshops.pratham.rover;

import java.util.HashMap;

public class Vector
{
    public final int x;
    public final int y;
    public final char direction;

    public Vector(int x, int y, char direction)
    {
        this.x = x;
        this.y = y;
        this.direction = direction;
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
