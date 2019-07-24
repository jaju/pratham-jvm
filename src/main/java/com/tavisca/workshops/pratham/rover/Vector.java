package com.tavisca.workshops.pratham.rover;

import java.util.Set;
import java.util.HashSet;

public class Vector {
    public final int x;
    public final int y;
    public final char direction;

    public final Set<Character> directions = new HashSet<Character>() {{
        add('N');
        add('S');
        add('E');
        add('W');
    }};


    public Vector(int x, int y, char direction) {

        this.x = x;
        this.y = y;
        if(directions.contains(direction))
            this.direction = direction;
        else
            throw new RuntimeException("Direction not correct");
    }
}
