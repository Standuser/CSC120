import java.util.*;

public class MathInteraction
{
	public static void main(String [] args)
	{
		triangleAreaInteractive();
		quadraticEqInteractive();
		triangleAnglesInteractive();
		triangleAnglesInteractiveFancy();
	}//end main
	

//INTERACTION METHODS	
	public static void triangleAreaInteractive()
	{
		Scanner sideLengths = new Scanner(System.in);
		
		System.out.println("******Computing the area of a triangle******");
		System.out.print("Enter the three lengths of a triangle: ");
		
		double a = sideLengths.nextDouble();
		double b = sideLengths.nextDouble();
		double c = sideLengths.nextDouble();
		
		System.out.println("The area is: " + triangleArea(a, b, c));	
		System.out.println();
	}//end triarea
	
		
	public static void quadraticEqInteractive()
	{
		Scanner coefficient = new Scanner(System.in);
		
		System.out.println("******Computing the roots of a quadratic equation******");
		System.out.print("Enter the coefficients a, b, c of ax^2+bx+y: ");
		
		double a = coefficient.nextDouble();
		double b = coefficient.nextDouble();
		double c = coefficient.nextDouble();
		
		System.out.println("The roots are: " + quadraticEqPlus(a, b, c) + " and " + quadraticEqMinus(a, b, c));
		System.out.println();
	}//end quad
	
	
	public static void triangleAnglesInteractive()
	{
		Scanner sideLength = new Scanner(System.in);
		
		System.out.println("******Computing the angles of a triangle******");
		System.out.print("Enter the three lengths of a triangle: ");
		
		double a = sideLength.nextDouble();
		double b = sideLength.nextDouble();
		double c = sideLength.nextDouble();
		
		double angleAC = triangleAngle(a, b, c);
		double angleBC = triangleAngle(b, a, c);
		double angleAB = 180 - (angleAC + angleBC);
		
		System.out.println("The angles at ac, bc, and ab are: \n" 
				+ angleAC + ", " + angleBC + ", and " + angleAB);
		
		System.out.println();
	}//end triangle angle
	
	
	public static void triangleAnglesInteractiveFancy()
	{
		Scanner sideLength = new Scanner(System.in);
		
		System.out.println("******Computing the angles of a triangle******");
		System.out.print("Enter the three lengths of a triangle: ");
		
		double a = sideLength.nextDouble();
		double b = sideLength.nextDouble();
		double c = sideLength.nextDouble();
		
		//reorders the values from smalles to biggest
		double newA = Math.min( a, Math.min( b, c ) );
		double newB = Math.max( Math.min( a, b ), Math.max( Math.min( a, c ), Math.min( b, c ) ) );
		double newC = Math.max( a, Math.max( b, c ) );
		
		System.out.println("new A = " + newA);
		System.out.println("new B = " + newB);
		System.out.println("new C = " + newC);
		
		double angleAC = triangleAngle(newA, newB, newC);
		double angleBC = triangleAngle(newB, newA, newC);
		double angleAB = 180 - (angleAC + angleBC);
		
		System.out.println("The angles at ac, bc, and ab are: \n" 
				+ angleAC + ", " + angleBC + ", and " + angleAB);

	}//end fancy
	
	
//CALCULATION METHODS
	public static double triangleArea(double a, double b, double c)
	{
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}// end triangle return area
	
	
	public static double quadraticEqPlus(double a, double b, double c)
	{
		double d = Math.sqrt((Math.pow(b, 2)) - (4 * a * c));
		double pRoot = (-b + d) / (2 * a);
		return pRoot;
	}//end quadplus
	
	
	public static double quadraticEqMinus(double a, double b, double c)
	{
		double d = Math.sqrt((Math.pow(b, 2)) - (4 * a * c));
		double mRoot = (-b - d) / (2 * a);
		return mRoot;
	}//end quad minus
	
	public static double triangleAngle(double a, double b, double c)
	{
		double area = triangleArea(a, b, c);
		double height = area * 2 / c;
		
		double sin = height / a;
		
		double aSin = Math.asin(sin);
		double angle = aSin * 180 / Math.PI;
		
		return angle;
		
	}//end triAngleAngle
		
}//end MathInteraction Class
