import java.util.*;

public class Factoring2
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		int n = 0;
		
		boolean correct = true;
		do
		{
			System.out.print("Enter a number >=2: ");
			n = reader.nextInt();
			
			if(n <= 2)
				correct = false;
			else
			{
				//factor(n);
				//System.out.println();
				
				factor2(n);
				System.out.println();
				//System.out.println();
			}
		}
		while(correct);
	}//end main
	
	
	
	
	public static void factor(int n)
	{
		long theQuotient = n;
		long theDivisor =2;
		int divCount = 0;
		
		System.out.print(n + "= ");
		
		while(theQuotient > 1)
		{
			while((theQuotient % theDivisor) != 0)
				theDivisor++;
		
			theQuotient /= theDivisor;
			divCount++;
			
			if(divCount <= 1)
				System.out.print(theDivisor);
			else
				System.out.print(" * " + theDivisor);
		}
		
	}//end factor
	
	public static void factor2(int n)
	{
		long theQuotient = n;
		long theDivisor = 2;
		int count = 0;
		System.out.print(n + "= ");
		
		while(theQuotient > 1)
		{
		        count = 0;
			while((theQuotient % theDivisor) == 0){
			   theQuotient /= theDivisor;
			   count++;
			}
			
			if(count>= 1){
			   System.out.print(theDivisor);
			   if(count>=2){
			      System.out.print("^" + count);
			   }
			   if (theQuotient!=1)
			   	System.out.print(" * ");
			}
		      theDivisor++;
		}	
	}//end factor2
	
	
	
/*	//factor 2 old version
	public static void factor2(int n)
	{
		long theQuotient = n;
		long theDivisor = 2;
		int divCount = 0;
		int count = 0;
		long div2 = 0;
		System.out.print(n + "= ");
		
		while(theQuotient > 1)
		{
		        //count = 0;
			while((theQuotient % theDivisor) != 0){
			   theDivisor++;
			   count = 0;
			}
			
			theQuotient /= theDivisor;
			count++;
			/*if(count>= 1){
			   System.out.print(theDivisor);
			   if(count>=2){
			      System.out.print("^" + count);
			   }
			   if (theQuotient!=1)
			   	System.out.print(" * ");
			}
			
			

			div2 = theDivisor;

			//divCount++;

			
			/*if(div2 == theDivisor)
			{
				count++;
				System.out.println(count);
				
			//}
			else
			{
				System.out.print(theDivisor + " change ");
				count = 0;
				System.out.print(div2 + "^" + count);
			}
			
			if(theQuotient == 1 || count)
				System.out.print(theDivisor + "^" +count);
			//div2 = theDivisor;
			//else if
			/*if(divCount <= 1)
				System.out.print(theDivisor);
			else
				System.out.print(" * " + theDivisor);
		      theDivisor++;
		}	
	}//end factor2
*/
} //end class
