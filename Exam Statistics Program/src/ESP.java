import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class ESP 
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the text file containing the scores please");
	
		Scanner cin = new Scanner(System.in);
		
		String file = cin.next();
		
		Scanner fin = new Scanner(new FileReader(file));
		
		System.out.println("The scores are");
		
		do
		{
			System.out.println(fin.nextLine());
		}
		while(fin.hasNextLine());
		
		fin.close();
			
	}

}
