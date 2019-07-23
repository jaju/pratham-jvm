package com.tavisca.workshops.prathm;

public class Rover {
    private Vector position;
    //private int x;
    //private int y;
    //private char direction;

    public Rover(int x, int y, char direction) {
        //this.x = x;
        //this.y = y;
        //this.direction = direction;
        position = new Vector(x, y, direction);
    }
    public Rover(Vector position){
        this.position = position;
    }


    public Rover MoveForward() {
        switch (position.direction){
            case 'E':
                position = new Vector(position.x + 1, position.y, position.direction);
                break;
            case 'W':
                position = new Vector(position.x - 1, position.y, position.direction);
                break;
            case 'N':
                position = new Vector(position.x, position.y + 1, position.direction);
                break;
            case 'S':
                position = new Vector(position.x, position.y - 1, position.direction);
                break;
        }
        return new Rover(this.position);
    }

    public int getPositionOfX() {
        return position.x;
    }

    public int getPositionOfY() {
        return position.y;
    }

    public Rover turnLeft() {
        return new Rover(position.turnLeft());
    }

    public char direction() {
        return position.direction;
    }

    public Rover turnRight() {
        return new Rover(position.turnRight());
    }
}
