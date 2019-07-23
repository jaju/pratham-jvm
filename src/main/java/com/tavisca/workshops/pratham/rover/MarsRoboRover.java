package com.tavisca.workshops.pratham.rover;

public class MarsRoboRover {
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

		Rover rover = new Rover(x,y,dir);
		String output = rover.executeCommand(commands);

		System.out.println("currentPosition..." + currentPosition);
		System.out.println("commands..." + commands);
		System.out.println(output);
	}



}

