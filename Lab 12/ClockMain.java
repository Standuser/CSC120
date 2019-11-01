import java.util.*;
public class ClockMain{

  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner( System.in );
    int sign, day, hour, minute;
    Clock[] data = new Clock[ 4 ];
    System.out.println( "Enter sign, day, hour, minute for clock 1: " );
    sign = keyboard.nextInt();
    day = keyboard.nextInt();
    hour = keyboard.nextInt();
    minute = keyboard.nextInt();
   

    data[ 0 ] = new Clock( sign, day, hour, minute );  // o1  o1.compareTo(o2)

    System.out.println( "Enter sign, day, hour, minute for clock 2: " );
    sign = keyboard.nextInt();
    day = keyboard.nextInt();
    hour = keyboard.nextInt();
    minute = keyboard.nextInt();
    data[ 1 ] = new Clock( sign, day, hour, minute );   // o2

    data[ 2 ] = data[ 0 ].plus( data[ 1 ] );           //o3
    data[ 3 ] = data[ 0 ].minus( data[ 1 ] );          //o4  

    for ( int i = 0; i < data.length; i ++ )
    {
      System.out.println( data[ i ].toString() );
    }

    System.out.println( "Comparing the first and the second produces "
        + data[ 0 ].compareTo( data[ 1 ] ) );

  }
}