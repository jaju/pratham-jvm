package com.tavisca.workshops.pratham.rover;

import java.util.HashMap;

public class Vector
{
    public final int x;
    public final int y;
    public final Direction direction;

    public Vector(int x, int y, Direction direction)
    {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public static HashMap<Character, Direction> charToDirection
            = new HashMap<Character, Direction>()
                {{
                    put('N', Direction.NORTH);
                    put('W', Direction.WEST);
                    put('E', Direction.EAST);
                    put('S', Direction.SOUTH);
                }};

    private static HashMap<Direction, Direction> leftMap
            = new HashMap<Direction, Direction>()
                {{
                    put(Direction.NORTH, Direction.WEST);
                    put(Direction.WEST, Direction.SOUTH);
                    put(Direction.EAST, Direction.NORTH);
                    put(Direction.SOUTH, Direction.EAST);

                }};

    private static HashMap<Direction, Direction> rightMap
            = new HashMap<Direction, Direction>()
                {{
                    put(Direction.NORTH, Direction.EAST);
                    put(Direction.WEST, Direction.NORTH);
                    put(Direction.EAST, Direction.SOUTH);
                    put(Direction.SOUTH, Direction.WEST);
                }};

    public Vector turnLeft()
    {
        return new Vector(this.x, this.y, leftMap.get(this.direction));
    }

    public Vector turnRight()
    {
        return new Vector(this.x, this.y, rightMap.get(this.direction));
    }

    public Vector incrementX()
    {
        return new Vector(this.x + 1, this.y, rightMap.get(this.direction));
    }

    public Vector incrementY()
    {
        return new Vector(this.x, this.y + 1, rightMap.get(this.direction));
    }

    public Vector decrementX()
    {
        return new Vector(this.x - 1, this.y, rightMap.get(this.direction));
    }

    public Vector decrementY()
    {
        return new Vector(this.x, this.y - 1, rightMap.get(this.direction));
    }

    public Vector moveForward()
    {
        if(direction == Direction.NORTH)
            return incrementY();
        else if(direction == Direction.SOUTH)
            return decrementY();
        else if(direction == Direction.EAST)
            return incrementX();
        else
            return decrementX();
    }
}
