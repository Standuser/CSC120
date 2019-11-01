import java.util.*;

public class TaxCalc
{
	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		String houseName;
		int  income, familySize, eduExpense, jobExpense;
		
		System.out.print("Enter household name: ");
		houseName = reader.nextLine();
		
		System.out.print("Enter household income: ");
		income = reader.nextInt();
		
		System.out.print("Enter number of people in the household: ");
		familySize = reader.nextInt();
		
		System.out.print("Enter educational expenses: ");
		eduExpense = reader.nextInt();
		
		System.out.print("Enter job-related expenses: ");
		jobExpense = reader.nextInt();
		
		int dA = deductionA(familySize);
		int dB = deductionB(eduExpense);
		int dC = deductionC(jobExpense);
		int taxable = taxableIncome(income, dA, dB, dC);
		int taxFinal = tax(taxable);
		
		taxInfo(houseName, dA, dB, dC, taxable, taxFinal);
	}//end main
	
	
	
	public static int deductionA (int familySize) //household deduct
	{
		int amountA = (int) familySize * 3000;
		return amountA;
	}//end deductionA
	
	
	
	public static int deductionB (int eduExpense) //edu deduct
	{
		int amountB = (int) (eduExpense * 0.90);
		return amountB;
	}//end deductionB
	
	
	
	public static int deductionC (int jobExpense) //job deduct
	{
		int amountC = (int) (jobExpense * 0.80);
		return amountC;
	}//end deductionC
	
	
	
	public static int taxableIncome(int income, int dA, int dB, int dC)
	{
		int taxable = income - dA - dB - dC;
		return taxable;
	}//end taxIncome
	
	
	
	public static int tax(int taxable)
	{
		int taxFinal = (int) (taxable * 0.20);
		return taxFinal;
	}//end tax
	
	
	
	public static void taxInfo (String houseName, int dA, int dB, int dC, int taxable, 						int taxFinal)
	{
		System.out.println("Deduction A = " + dA);
		System.out.println("Deduction B = " + dB);
		System.out.println("Deduction C = " + dC);
		System.out.println("Taxable income = " + taxable);
		System.out.println("For " + houseName + ", the tax = " + taxFinal);
	}//tax info
	
}//end class
