//Kyle Whitaker's Code (with the help of Torin F)
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class ESP 
{	
	static int gradesMin(int [] grades)
	{
		return grades[0]; //reads the first array value
	}
	
	static int gradesMax(int [] grades, int n)
	{
		return grades[n]; //reads the greatest array value
	}
	
	static double gradesMean(int [] grades, Scanner fin, int n)
	{
		int avg = 0; 
				
		for( int i=0; i <n; i++) //adds all the values of the array together
		{
			avg += grades[i];
		}
		avg /=n ; //divides the collective added values by the number of values to get the average
		return avg;
	}
	
	static double gradesMedian(int [] grades, int n)
	{
		n /=2 ; //reads the number that is halfway to the max value
		return grades[n];
		
	}

	static int [] gradesDistribution(int [] grades, int n)
	{
		int [] gradeletters = new int [5];
        /*
            0 = F
            1 = D
            2 = C
            3 = B
            4 = A
        */
				
		for( int i=0; i < n; i++) // all of these set the values of "grades" to a corresponding value in the array "gradeletters"
		{
			if(grades[i] < 60)
			{
			gradeletters[0] +=1;
			}
			else if(grades[i] < 70)
			{
			gradeletters[1] +=1;
			}
			else if(grades[i] < 80)
			{
			gradeletters[2] +=1;
			}
			else if(grades[i] < 90)
			{
			gradeletters[3] +=1;
			}
			else if (grades[i] <= 100)
			{
			gradeletters[4] +=1;
			}
		}
		return gradeletters;
			
}
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the text file containing the scores please");
		Scanner cin = new Scanner(System.in);
		
		String file = cin.next();//reads in the file containing the grades
		Scanner fin = new Scanner(new FileReader(file));//reads the file lines
		
		int n = fin.nextInt();
		int [] grades = new int[n];//creates the array which the grades will go into
		
		System.out.println("The number of grades is " + n);
		
		for(int i = 0; i<n; i++) // sets all the numbers into the array
		{
			grades[i]= fin.nextInt();
		}
		
		Arrays.sort(grades); //sorts them from low to high
		
		System.out.println("These are the scores: ");
		
		for(int s = 0; s<n; s++)
		{
			System.out.println(grades[s]); //prints out the new sorted array
		}
		
		int[] gradeletters = gradesDistribution(grades, n); //brings forth the array that has corresponding letters 
		
		System.out.println("The lowest score is " + gradesMin(grades));//prints out the values as they work with gradesMin
		
		System.out.println("The highest score is " + gradesMax(grades, n-1));//prints out the values as they work with gradesMax
		
		System.out.println("The average of the scores is " + gradesMean(grades, fin, n)); // "
		
		System.out.println("The median if the scores is " + gradesMedian(grades, n));// "
		
		System.out.println("The number of letter grades are:");
		{
			System.out.println(gradeletters[0] + " F's");//prints out the number of letter grades that are corresponded with my the number grades
			System.out.println(gradeletters[1] + " D's");// "
			System.out.println(gradeletters[2] + " C's");// "
			System.out.println(gradeletters[3] + " B's");// "
			System.out.println(gradeletters[4] + " A's");// "
		}
		
		System.out.println("Thanks for using ESP!! :^)"); 
		
	}

}
