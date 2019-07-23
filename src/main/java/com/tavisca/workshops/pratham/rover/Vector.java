package com.tavisca.workshops.pratham.rover;

import java.util.HashMap;


public class Vector {
    public final int x;
    public final int y;
    public final char direction;
    private final HashMap<Character, Character> leftMap = new HashMap<>() {{
        put('N', 'W');
        put('W', 'S');
        put('S', 'E');
        put('E', 'N');
    }};

    private final HashMap<Character, Character> rightMap = new HashMap<>() {{
        put('N', 'E');
        put('E', 'S');
        put('S', 'W');
        put('W', 'N');
    }};

    public Vector(int x, int y, char direction) {

        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }

    public char direction() {
        return this.direction;
    }

    public Vector turnLeft() {
        return new Vector(this.x, this.y, leftMap.get(this.direction()));
    }

    public Vector turnRight() {
        return new Vector(this.x, this.y, rightMap.get(this.direction()));
    }

}
