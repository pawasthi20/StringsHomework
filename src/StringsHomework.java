/**
 * 
 * @author parth
 *
 */
import java.util.Scanner;

public class StringsHomework 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//Prompt Name
		System.out.printf("Enter your name: %20.1f");
		//Prompt Telephone Number
		System.out.printf("Enter your phone number: %10.1f");
		//Enter Telephone Number
		String str = "xxxxxxxxx";
		//Substrings of Telephone Number
		String str2 = str.substring(0, 2);
		String str3 = str.substring(3, 5);
		String str4 = str.substring(6, 9);

		//Compute Telephone Number
		String telephoneNumber = "(" + str2 + ")" + str3 + "-" + str4;
		System.out.print(telephoneNumber);
		
	}
}