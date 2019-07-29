package com.tavisca.workshops.pratham.rover;

import java.util.Set;
import java.util.HashSet;

public class Vector {
    public final int x;
    public final int y;
    //public final char direction;

    public final Direction direction;

    public final Set<Character> directions = new HashSet<Character>() {{
        add('N');
        add('S');
        add('E');
        add('W');
    }};


    public Vector(int x, int y, Direction direction) {

        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
