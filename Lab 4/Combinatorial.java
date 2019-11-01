import java.util.*;

public class Combinatorial
{
  public static void main(String [] args)
  {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter n and k: ");
    int n = reader.nextInt();
    int k = reader.nextInt();

    System.out.println("With method 1, C(" + n + ", " + k + ")= " + combinatorial1(n, k));
    System.out.println("With method 2, C(" + n + ", " + k + ")= " + combinatorial2(n, k));
    System.out.println("With method 3, C(" + n + ", " + k + ")= " + combinatorial3(n, k));
  }//end main

//APPROACH 1: working for all numbers do not edit
  public static long factorial(int m)
  {
    long x = 1;

    for(long p = 1;  m!= 0 && p <= m; p++)
    {
      x = x*p;
    }
    return x;
  }//end factorial

  public static long combinatorial1(int n, int k)
  {
    long answer = 1;
    long numerator = factorial(n);
    long denominatorK = factorial(k);
    long denominatorNK = factorial(n-k);

    answer = (numerator / denominatorK) / denominatorNK;
    return answer;
  }//end combinatorial1

//APPROACH 2:w working for all number do NOT edit
  public static long product(int start, int end)
  {
    long x = 1;

    for(long m = start;  m!= 0 && m >= end; m--)
    //for(long m = end; m > start; m--)
    {
      x = x*m;
    }
    return x;

  }//end product

  public static long combinatorial2(int n, int k)
  {
    int q = Math.min(k, n-k);
    long answer = 1;
    long numerator2 = product(n, q + 1);
    long denominator2 = product(q, 1);

    answer = numerator2 / denominator2;
    return answer;
  }//end combinatorial2

//APPROACH 3: woeking for all number DO NOT edit
  public static long combinatorial3 (int n, int k)
  {
    long x = 1;

    for(int i = 1; i <= k; i++)
    {
      x = x *(n - i + 1) / i;
    }
    return x;

  }//end method3

}//end combinatorial class
