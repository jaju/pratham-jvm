package com.tavisca.workshops.pratham.rover;

public class MarsRoboRover
{
	private static int y = 0;
	private static int x = 0;
	private static String dir = "";

	public static void main(String[] args) {

		String currentPosition = "3 3 E";
		String commands = "MMRMMRMRRM";

		String[] positions = currentPosition.split(" ");
		x = Integer.valueOf(positions[0]);
		y = Integer.valueOf(positions[1]);
		dir = positions[2];

		for (char command : commands.toCharArray()) {
			rove(command);
		}

		System.out.println("currentPosition..." + currentPosition);
		System.out.println("commands..." + commands);
		System.out.println("newPosition..." + x + " " + y + " " + dir);
	}

	private static void rove(char command) {
		if (dir.equalsIgnoreCase("N")) {
			switch (command) {
			case 'L':
				dir = "W";
				break;
			case 'R':
				dir = "E";
				break;
			case 'M':
				y++;
				break;
			}
		} else if (dir.equalsIgnoreCase("E")) {
			switch (command) {
			case 'L':
				dir = "N";
				break;
			case 'R':
				dir = "S";
				break;
			case 'M':
				x++;
				break;
			}
		} else if (dir.equalsIgnoreCase("S")) {
			switch (command) {
			case 'L':
				dir = "E";
				break;
			case 'R':
				dir = "W";
				break;
			case 'M':
				y--;
				break;
			}
		} else if (dir.equalsIgnoreCase("W")) {
			switch (command) {
			case 'L':
				dir = "S";
				break;
			case 'R':
				dir = "N";
				break;
			case 'M':
				x--;
				break;
			}
		}
	}

}
