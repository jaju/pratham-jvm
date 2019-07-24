package com.tavisca.workshops.pratham.rover;

import java.util.HashMap;

public class Rover {

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
        switch (this.v.direction){
            case 'N' :
                this.v =  new Vector(this.v.x, this.v.y+1, this.v.direction);
                break;
            case 'S' :
                this.v = new Vector(this.v.x, this.v.y-1, this.v.direction);
                break;
            case 'E' :
                this.v = new Vector(this.v.x+1, this.v.y, this.v.direction);
                break;
            case 'W' :
                this.v = new Vector(this.v.x-1, this.v.y, this.v.direction);
                break;
        }
        return this.v;
    }

    public String Rove(String commands){
        for(char command : commands.toCharArray()){
            switch(command){
                case 'L':
                    this.turnLeft();
                    break;
                case 'R':
                    this.turnRight();
                    break;
                case 'M':
                    this.move();
                    break;
            }
        }
        return "newPosition..." + this.v.x + " " + this.v.y + " " + this.v.direction;
    }


}
