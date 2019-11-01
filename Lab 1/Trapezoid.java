import java.util.Scanner;


public class Trapezoid{
  public static void main ( String [] args )
  {
    Scanner reader = new Scanner (System.in);
    String repeat = "y";
    while(repeat.equals("y"))   
    {	    
      System.out.print( "Top: " );
      double top = reader.nextDouble();

      System.out.print( "Bottom: " );
      double bottom = reader.nextDouble();

      System.out.print( "Height: " );
      double height = reader.nextDouble();

      double area = (bottom + top) * height / 2;
   
      System.out.println( "Area: " + area );
      System.out.print( "Play again y/n: " );
      repeat = reader.next();
    } 

  }
}
