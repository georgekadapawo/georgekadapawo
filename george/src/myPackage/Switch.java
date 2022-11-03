package myPackage;

import java.util.Scanner;

public class Switch {
	
	public static void main(String [] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("Enter a number from 0 - 6");
		int dayNum = keyboardInput.nextInt();
		
		System.out.println("The day that corresponds to the number you entered is  " + getDayName(dayNum));
		System.out.println("Thank you so much");
		
	}
	
	public static String getDayName(int dayNum) {
		
		
		String dayName = "";
		switch(dayNum) {
		case 0:	dayName = "Sunday";
		break;
		case 1:	dayName = "Monday";
		break;
		case 2:	dayName = "Tuesday";
		break;
		case 3:	dayName = "Wednesday";
		break;
		case 4:	dayName = "Thursday";
		break;
		case 5:	dayName = "Friday";
		break;
		case 6:	dayName = "Sarturday";
		break;
		default: dayName = "Invalid date";
		break;
		}
		return dayName;
	}
}
