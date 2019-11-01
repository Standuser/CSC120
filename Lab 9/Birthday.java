package jujjjj;
import java.util.*;
import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		StringBuilder myBuilder =new StringBuilder();
		System.out.println("Enter the no. of people:");
		int numppl = keyboard.nextInt();
		System.out.println("Enter the no. of repetitions:");
		int numrep= keyboard.nextInt();
		experiment1(numppl,numrep);
		
		
	}
	
	public static int[] oneTrial (int numppl){
		int [] theCounts = new int [365];
		for (int i= 1; i <= numppl ; i++) {
			int birthday  = (int) (Math.random () * 365);		
			theCounts[birthday]++;
		}
		
	return theCounts;
			/* Math.random()   birthday		Math.random（）*365   (int) Math.random() * 365
			 * 0.000           0             0.00012			     	0
			 * 0.99999		   364           364.99999 				364
			 */
	}
	
	public static boolean hasAHit (int [] theCounts) {
		for(int i=0; i < 364 ; i++ ){
			if (theCounts [i] >= 2) {
				return true;
			}
		}
		return false;
	}
	
	public static void experiment1(int numppl , int numrep) {
		double hitARate = 0.0 ;
		for (int i=0 ; i< numrep ; i++) {
			int [] theCounts = oneTrial (numppl) ;
			boolean answer = hasAHit (theCounts);
			if (answer) {
				hitARate++;
			}
			
		}
	    hitARate= hitARate / numrep;
	    System.out.println("Experiment 1");
	    System.out.printf("Probability Of Hits:%.3f%n", hitARate);
	}
	
	
}
