package stav;
import java.util.*;

public class Pal 
{
	
	public static String Pal(String qPal)
	{
		String qPalBWards = "";
		String isPalTrue = "This is a Palindrome!";
		String isPalFalse = "NOT A PALINDROME!";
		int qPalLength = qPal.length();
		int j = 0;
		for (int i = qPalLength - 1; i >= 0; i--)
		{						
			j = qPalLength - i;
			qPalBWards =  qPalBWards + qPal.charAt(i);
					
		}
		
		if (qPal.equals(qPalBWards))
		{
			return isPalTrue;
		}
		else
		{
			return isPalFalse;
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the Palindrom");
		Scanner in = new Scanner(System.in);
		String answer = "";
	
		while(!answer.equals("exit"))
		{
			answer = in.next();
			System.out.println(Pal(answer));
			
		}
		
		

	}

}
