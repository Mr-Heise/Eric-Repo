/*
 *TrackDivisions.java
 *Eric
 *CSC 30
 *Started: June 2 2017
 *Completed:
 *Crate a progra, that determines the track and field divisions the student is in
 */
 
//import the scanner class to get input

import java.util.Scanner;

public class TrackDivisions 
{

	public static void main(String[] args)
	{
		
		final int SHSAA_YEAR = 2016;
		final int SHSAA_MONTH = 8;
		
		int birthYear;
		int birthMonth;
		
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\t**** The division Program ****");
		
		System.out.print("\n\tPlease enter the Year you were born: ");
		birthYear = input.nextInt();
		
		System.out.print("\n\tPlease enter the Month you were born: ");
		birthMonth = input.nextInt();
		
		age = SHSAA_YEAR - birthYear;
		
		System.out.println("\n\tDuring the 2016-17 school year, the student turned " + age + " years old");
		
		if (birthMonth <= 8 && age >= 16){
		
		System.out.println("\n\tYou are a Senior");
		
		} else if (birthMonth > 8 && age >= 16){
				
		System.out.println("\n\tYou are a Senior");
		
		}
		
		else if (birthMonth <= 8 && age == 15){
				
		System.out.println("\n\tYou are a Junior");
		
		} else if (birthMonth > 8 && age == 15){
		
		System.out.println("\n\tYou are a Midget");
		
		}
		
		
		else if (birthMonth <= 8 && age == 14){
		
		System.out.println("\n\tYou are a Midget");
		
		}else if (birthMonth > 8 && age == 14){
		
		System.out.println("\n\tYou are a Bantam");
		
		}
		
		else if (birthMonth <= 8 && age == 13){
		
		System.out.println("\n\tYou are a Bantam");
		
		} else if (birthMonth > 8 && age == 13){
		
		System.out.println("\n\tYou are a Pee Wee");
		
		}
		
		 else if (birthMonth <= 8 && age == 12){
		
		System.out.println("\n\tYou are a Pee Wee");
		
		} else if (birthMonth > 8 && age == 12){
		
		System.out.println("\n\tYou are a Wee Pee");
		
		} 
		
		else if (birthMonth <= 8 && age == 11){
		
		System.out.println("\n\tYou are a Wee Pee");
		
		} else if (birthMonth > 8 && age == 11){
		
		System.out.println("\n\tYou are a Wee Pee");
		
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
	
