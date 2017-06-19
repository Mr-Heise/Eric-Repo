/*
 *Divisions.java
 *Eric
 *CSC 30
 *started june 8 
 *Use a file to get the division for track students using the following format: 
 */
 
import java.io.*;


public class Divisions 
{
	public static void main(String[] args)
	{
		//Read the Track Divisions file to get the information to read
		File textFile = new File("Track_Division_Input_File.csv");
		
		FileReader in;
		
		BufferedReader readFile;
		
		//Declare Strings to store the output
		
		String lineOfText;
		
		String division;
		
		String outputText;
		
		//After the Program goes through the Input file it outputs a new file
		
		File outputFile = new File("Track_Divisions.txt");
		
		FileWriter out;
		
		BufferedWriter writeFile;
		
		//declare and initilize an integer to count the amount of students
		
		int counter = 0;
		
		//Output a title
		
		System.out.println("\n\t**** DIVSIONS ****");
		
		//if you have the correct txt then you can run the program
		
		try {
			
			//read and get the information from the txt file
			
			in = new FileReader(textFile);
			
			readFile = new BufferedReader(in);
			
			//Output/create a new file telling the division the student is in
			
			out = new FileWriter(outputFile);
			
			writeFile = new BufferedWriter(out);
			
			//output a header onto the new document
			
			writeFile.write("\n\tTRACK AND FIELD DIVISIONS FOR THE 2016/17 YEAR\n");
			
			//If there is the correct inforation the the right format then read it
			
			while ((lineOfText = readFile.readLine()) != null) {
			
				//System.out.println(lineOfText);
				
				//Parse string
				
				//declare strings to store the students first and last name along with the year and month
				
				String last;
				String first;
				String year;
				String month;
				
				//declare the integers to store the information from the txt file
				
				int birthYear = 0;
				int birthMonth = 0;
				
				//Look for a comma to seperate the line of text
				
				int coma;
				
				//increase the counter by one every time the loop iterates
				
				counter++;
				//System.out.println("\n\t**** STUDENT ****");
		
				//Last Name
				
				//look for the comma in the line of text
				
				coma = lineOfText.indexOf(",");
			
				//aquire the last name from the line of text
			
				last = lineOfText.substring(0, coma);
		
				//System.out.println("\n\tLast Name = " + last);
		
		
				lineOfText =  lineOfText.substring(coma + 1);
		
				//System.out.println("\n\tlineOfText = " + lineOfText);
		
		
				//First Name
		
				coma = lineOfText.indexOf(",");
				
				//aquire the first name from the line of text
				
				first = lineOfText.substring(0, coma);
		
				//System.out.println("\n\tFirst Name = " + first);
		
		
				lineOfText =  lineOfText.substring(coma + 1);
	
		
				//Birth Year
		
				coma = lineOfText.indexOf(",");
				
				//aquire the birth year from the line of text
				
				birthYear = Integer.parseInt(lineOfText.substring(0,coma));
		
				//System.out.println("\n\tBirth Year = " + birthYear);
		
		
	
				lineOfText = lineOfText.substring(coma + 1);
		
				//Birth Month
		
				coma = lineOfText.indexOf(",");
				
				//aquire the birth month from the line of text
				
				birthMonth = Integer.parseInt(lineOfText.substring(0,coma));
		
				//System.out.println("\n\tBirth Month = " + birthMonth);
		
		
	
				lineOfText = lineOfText.substring(coma + 1);
		
				
				// end Parse 
				
				//determine track division
				division = determineDivision(birthYear, birthMonth);
				
				//output the text to the new file
				
				outputText = "\n\t" + first + " " + last + " is a " + division;
				
				//output a blank line
				
				writeFile.write(outputText + "\n");
				//writeFile.newLine();
				
				//System.out.println("\n\tDivision = " + division);
				//end it
				}
				
				writeFile.close();
				
				//output a line onto the terminal
				
				System.out.println("\n\tProgram Complete: " + counter + " results were written to the output file.");
				
		//catch errors and output a message based on what it is
				
		} catch (FileNotFoundException e) {
		
		System.out.println("File is wrong");
		System.err.println("FileNotFoundException: " + e.getMessage());
		 
		
		} catch (IOException e) {
		
			System.out.println("File has a problem");
			System.err.println("IOException: " + e.getMessage());
		}
	}
	
	public static String determineDivision(int birthYear, int birthMonth) {
		
		//initialize a constant for the current SHSAA year and SHSAA month
		
		final int SHSAA_YEAR = 2016;
		final int SHSAA_MONTH = 8;
		
		String result = "";
		
		//declare a integer to store the students age
		
		int age;
		
		//figure out the students age
		
		age = SHSAA_YEAR - birthYear;
		
		//Test to see what division the student falls under based on the month they were born and their age
		
		if (birthMonth <= SHSAA_MONTH && age >= 16){
		
			result = "Senior";
		
		} else if (age >= 17){
				
			result = "Senior";
		
		} else if (birthMonth > SHSAA_MONTH && age == 16){
				
			result = "Junior";
		
		}
		
		else if (birthMonth <= SHSAA_MONTH && age == 15){
				
			result = "Junior";
		
		} else if (birthMonth > SHSAA_MONTH && age == 15){
		
			result = "Midget";
		
		}
		
		
		else if (birthMonth <= SHSAA_MONTH && age == 14){
		
			result = "Midget";
		
		}else if (birthMonth > SHSAA_MONTH && age == 14){
		
			result = "Bantam";
		
		}
		
		else if (birthMonth <= SHSAA_MONTH && age == 13){
		
			result = "Bantam";
		
		} else if (birthMonth > SHSAA_MONTH && age == 13){
		
			result = "Pee Wee";
		
		}
		
		 else if (birthMonth <= SHSAA_MONTH && age == 12){
		
			result = "Pee Wee";
		
		} else if (birthMonth > SHSAA_MONTH && age == 12){
		
			result = "Wee Pee";
		
		} 
		
		else if (birthMonth <= SHSAA_MONTH && age == 11){
		
			result = "Wee Pee";
		
		} else if (birthMonth > SHSAA_MONTH && age == 11){
		
			result = "Wee Pee";
			
		}
		
		return (result);
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
