/*
 *ParseString.java
 *Eric
 *CSC 30
 *Start date june 7 2017
 *This program gets stuff
 */
 
public class ParseString 
{
	public static void main(String[] args)
	{
		
		String lineOfText = "Babyak,Akilah,2000,6,June";
		
		String last;
		String first;
		String year;
		String month;
		int birthYear = 0;
		int birthMonth = 0;
		int coma;
		
		System.out.println("\n\t**** Word stuff ****");
		
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
		
		//System.out.println("\n\tlineOfText = " + lineOfText);
		
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
		
		
		
		
		
		
	}
}
