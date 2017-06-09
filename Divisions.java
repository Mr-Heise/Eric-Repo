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
		
		File textFile = new File("Track_Division_Input_File.csv");
		
		FileReader in;
		
		BufferedReader readFile;
		
		String lineOfText;
		
		String division;
		
		System.out.println("\n\t**** DIVSIONS ****");
		
		try {
		
			in = new FileReader(textFile);
			
			readFile = new BufferedReader(in);
			
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
		
				System.out.println("\n\t**** STUDENT ****");
		
				//Last Name
		
				coma = lineOfText.indexOf(",");
		
				last = lineOfText.substring(0, coma);
		
				System.out.println("\n\tLast Name = " + last);
		
		
				lineOfText =  lineOfText.substring(coma + 1);
		
				//System.out.println("\n\tlineOfText = " + lineOfText);
		
		
				//First Name
		
				coma = lineOfText.indexOf(",");
		
				first = lineOfText.substring(0, coma);
		
				System.out.println("\n\tFirst Name = " + first);
		
		
				lineOfText =  lineOfText.substring(coma + 1);
	
		
				//Birth Year
		
				coma = lineOfText.indexOf(",");
		
				birthYear = Integer.parseInt(lineOfText.substring(0,coma));
		
				System.out.println("\n\tBirth Year = " + birthYear);
		
		
	
				lineOfText = lineOfText.substring(coma + 1);
		
				//Birth Month
		
				coma = lineOfText.indexOf(",");
		
				birthMonth = Integer.parseInt(lineOfText.substring(0,coma));
		
				System.out.println("\n\tBirth Month = " + birthMonth);
		
		
	
				lineOfText = lineOfText.substring(coma + 1);
		
				
				// end Parse 
				
				//determine track division
				division = determineDivision(birthYear, birthMonth);
				
				System.out.println("\n\tDivision = " + division);
				//end it
				}
				
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
		
		} else if (birthMonth > 8 && age >= 16){
				
			result = "Senior";
		
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
