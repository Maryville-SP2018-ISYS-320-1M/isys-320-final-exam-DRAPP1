package edu.maryville.isys320;
import java.util.Scanner;
public class Problem_11 {
	public static void main(String[] args) {

		float x1,y1,x2,y2; //x1,y1 are coordinates of first point and x2,y2 are coordinates of second point

		double distance=0; //distance between x1,y1 and x2,y2

		Scanner s= new Scanner(System.in);

		System.out.println("Enter x1 and y1 for point1 :"); //Taking coordinates of first point from user

		x1=s.nextFloat();

		y1=s.nextFloat();

		System.out.println("Enter x2 and y2 for point2 :"); //Taking coordinates of second point from user

		x2=s.nextFloat();

		y2=s.nextFloat();

		distance= Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))); //computing distance

		System.out.printf(String.format("The distance between ("+x1+","+y1+") and ("+x2+","+y2+") is %.1f\n",(double)distance)); //printing the distance

		}

		}

