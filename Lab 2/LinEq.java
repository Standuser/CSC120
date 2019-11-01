import java.util.*;

public class LinEq
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		double a, b, c, d, e, f, x, y, h;
		
		
		System.out.print("Enter coefficients for the first equation: ");
		a = reader.nextDouble();
		b = reader.nextDouble();
		e = reader.nextDouble();
		//System.out.println(a + " " + b + " " + e);
		
		System.out.print("Enter coefficients for the second equation: ");
		c = reader.nextDouble();
		d = reader.nextDouble();
		f = reader.nextDouble();
		//System.out.println(c + " " + d + " " + f);
		
		h = a * d - b * c;
		
		x = (d * e - b * f) / h; 
		y = (a * f - c * e) / h;
		
		System.out.println("The solution is x = " + x + ", y = " + y);
	}//end main
}

