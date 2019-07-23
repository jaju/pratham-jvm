package com.tavisca.workshops.pratham.rover;

public class Rover {
    private int x;
    private int y;
    private String dir;

    public Rover(int x, int y, String dir){
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public String executeCommand(String command){

        for(char i : command.toCharArray()){
            this.rove(i);
        }

        return "newPosition..." + this.x + " " + this.y + " " + this.dir;
    }

    private void rove(char command) {
        if (dir.equalsIgnoreCase("N")) {
            switch (command) {
                case 'L':
                    this.dir = "W";
                    break;
                case 'R':
                    this.dir = "E";
                    break;
                case 'M':
                    this.y++;
                    break;
            }
        } else if (dir.equalsIgnoreCase("E")) {
            switch (command) {
                case 'L':
                    this.dir = "N";
                    break;
                case 'R':
                    this.dir = "S";
                    break;
                case 'M':
                    this.x++;
                    break;
            }
        } else if (dir.equalsIgnoreCase("S")) {
            switch (command) {
                case 'L':
                    this.dir = "E";
                    break;
                case 'R':
                    this.dir = "W";
                    break;
                case 'M':
                    this.y--;
                    break;
            }
        } else if (dir.equalsIgnoreCase("W")) {
            switch (command) {
                case 'L':
                    this.dir = "S";
                    break;
                case 'R':
                    this.dir = "N";
                    break;
                case 'M':
                    this.x--;
                    break;
            }
        }
    }

}
