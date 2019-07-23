package com.tavisca.workshops.pratham.rover;

import java.util.HashMap;

public class Rover {

//    private int x;
//    private int y;
//    private char direction;
    private Vector v;
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

    public Rover(Vector v){
        this.v = v;
    }

    public Vector turnLeft() {
        this.v = new Vector(this.v.x, this.v.y, leftMap.get(this.v.direction));
        return this.v;
    }

    public Vector turnRight() {

        this.v = new Vector(this.v.x, this.v.y, rightMap.get(this.v.direction));
        return this.v;
    }

    public Vector move() {
        Vector v;
        switch (this.v.direction){
            case 'N' :
                v =  new Vector(this.v.x, this.v.y+1, this.v.direction);
                break;
            case 'S' :
                v = new Vector(this.v.x, this.v.y-1, this.v.direction);
                break;
            case 'E' :
                v = new Vector(this.v.x+1, this.v.y, this.v.direction);
                break;
            default :
                v = new Vector(this.v.x-1, this.v.y, this.v.direction);
                break;
        }
        this.v = v;
        return v;
    }


}
