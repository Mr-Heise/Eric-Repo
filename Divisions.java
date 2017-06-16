/*
 *Divisions.java
 *Eric
 *CSC 30
 *started june 8 
 *Use a file to get the division for track students
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
		
		System.out.println("\n\t**** DIVSIONS ****");
		
		try {
		
			in = new FileReader(textFile);
			
			readFile = new BufferedReader(in);
			
			
			out = new FileWriter(outputFile);
			
			writeFile = new BufferedWriter(out);
			
			writeFile.write("\n\tTRACK AND FIELD DIVISIONS FOR THE 2016/17 YEAR\n");
			
			while ((lineOfText = readFile.readLine()) != null) {
			
				//System.out.println(lineOfText);
				
				//Parse string
				
				String last;
				String first;
				String year;
				String month;
				int birthYear = 0;
				int birthMonth = 0;
				int coma;
				
				
				counter++;
				//System.out.println("\n\t**** STUDENT ****");
		
				//Last Name
		
				coma = lineOfText.indexOf(",");
		
				last = lineOfText.substring(0, coma);
		
				//System.out.println("\n\tLast Name = " + last);
		
		
				lineOfText =  lineOfText.substring(coma + 1);
		
				//System.out.println("\n\tlineOfText = " + lineOfText);
		
		
				//First Name
		
				coma = lineOfText.indexOf(",");
		
				first = lineOfText.substring(0, coma);
		
				//System.out.println("\n\tFirst Name = " + first);
		
		
				lineOfText =  lineOfText.substring(coma + 1);
	
		
				//Birth Year
		
				coma = lineOfText.indexOf(",");
		
				birthYear = Integer.parseInt(lineOfText.substring(0,coma));
		
				//System.out.println("\n\tBirth Year = " + birthYear);
		
		
	
				lineOfText = lineOfText.substring(coma + 1);
		
				//Birth Month
		
				coma = lineOfText.indexOf(",");
		
				birthMonth = Integer.parseInt(lineOfText.substring(0,coma));
		
				//System.out.println("\n\tBirth Month = " + birthMonth);
		
		
	
				lineOfText = lineOfText.substring(coma + 1);
		
				
				// end Parse 
				
				//determine track division
				division = determineDivision(birthYear, birthMonth);
				
				outputText = "\n\t" + first + " " + last + " is a " + division;
				
				
				
				writeFile.write(outputText + "\n");
				//writeFile.newLine();
				
				//System.out.println("\n\tDivision = " + division);
				//end it
				}
				
				writeFile.close();
				
				System.out.println("\n\tProgram Complete: " + counter + " results were written to the output file.");
				
		} catch (FileNotFoundException e) {
		
		System.out.println("File is wrong");
		System.err.println("FileNotFoundException: " + e.getMessage());
		 
		
		} catch (IOException e) {
		
			System.out.println("File has a problem");
			System.err.println("IOException: " + e.getMessage());
		}
	}
	
	public static String determineDivision(int birthYear, int birthMonth) {
		
		final int SHSAA_YEAR = 2016;
		final int SHSAA_MONTH = 8;
		
		String result = "";
		
		int age;
		
		age = SHSAA_YEAR - birthYear;
		
		if (birthMonth <= 8 && age >= 16){
		
			result = "Senior";
		
		} else if (age >= 17){
				
			result = "Senior";
		
		} else if (birthMonth > 8 && age == 16){
				
			result = "Junior";
		
		}
		
		else if (birthMonth <= 8 && age == 15){
				
			result = "Junior";
		
		} else if (birthMonth > 8 && age == 15){
		
			result = "Midget";
		
		}
		
		
		else if (birthMonth <= 8 && age == 14){
		
			result = "Midget";
		
		}else if (birthMonth > 8 && age == 14){
		
			result = "Bantam";
		
		}
		
		else if (birthMonth <= 8 && age == 13){
		
			result = "Bantam";
		
		} else if (birthMonth > 8 && age == 13){
		
			result = "Pee Wee";
		
		}
		
		 else if (birthMonth <= 8 && age == 12){
		
			result = "Pee Wee";
		
		} else if (birthMonth > 8 && age == 12){
		
			result = "Wee Pee";
		
		} 
		
		else if (birthMonth <= 8 && age == 11){
		
			result = "Wee Pee";
		
		} else if (birthMonth > 8 && age == 11){
		
			result = "Wee Pee";
			
		}
		
		return (result);
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
