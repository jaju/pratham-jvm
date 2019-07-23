package com.tavisca.workshops.pratham.rover;

public class Vector {
    private final int x;
    private final int y;
    private final char direction;

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
        if(this.direction() == 'N')
            return new Vector(this.x, this.y, 'W');
        else if(this.direction() == 'W')
            return new Vector(this.x, this.y, 'S');
        else if(this.direction() == 'S')
            return new Vector(this.x, this.y, 'E');
        else
            return new Vector(this.x, this.y, 'N');
    }
}
