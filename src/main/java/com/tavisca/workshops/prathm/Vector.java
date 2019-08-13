package com.tavisca.workshops.prathm;

import java.util.HashMap;

public class Vector {

    public final int x;
    public final int y;
    public final char direction;

    public Vector(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    /*public Vector turnLeft() {
        if(direction == 'N')
            return new Vector(this.x, this.y, 'W');
        if(direction == 'W')
            return new Vector(this.x, this.y, 'S');
        if(direction == 'S')
            return new Vector(this.x, this.y, 'E');
        if(direction == 'E')
            return new Vector(this.x, this.y, 'N');
        return null;
    }*/

    private static HashMap<Character, Character> leftMap
            = new HashMap<Character, Character>(){{
                put('N', 'W');
                put('W', 'S');
                put('S', 'E');
                put('E', 'N');
    }};

    private static HashMap<Character, Character> rightMap
            = new HashMap<Character, Character>(){{
                put('N', 'E');
                put('W', 'N');
                put('S', 'W');
                put('E', 'S');
    }};

    public Vector turnRight() {
        return new Vector(this.x, this.y, rightMap.get(this.direction));
    }

    public Vector turnLeft() {
        return new Vector(this.x, this.y, leftMap.get(this.direction));
    }

    //complete the moving part of the rover.
}
