import java.util.*;
import java.lang.*;

public class LongestDuplicate
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String x = reader.nextLine();
		System.out.println();
		
		String input = simplify(x);
		System.out.println("Input = " + input);
		
		search(input);
	
	}//end main	
	
	
	public static void search(String x)
	{
		String duplicate = "";
		int maxI = 0, maxK = 0;
		for (int i = 0; i <= x.length()-2; i ++ )
		{
  			for (int j = i+1; j <= x.length()-2; j ++ )
 			{
    				String w = x.substring(i, j);
    				if (x.indexOf(w, j) >= 0)
    				{
    					if(w.length() > duplicate.length())
    					{
    						duplicate = w;
    						maxI = i;
    						maxK = x.indexOf(w, j);
    					}
    					else if (w.length() == duplicate.length())
    					{
    						if(w.compareTo(duplicate) > 0)
    						{
    							duplicate = w;
    							maxI = i;
    							maxK = x.indexOf(w, j);
    						}
    						
    						else
    						{
    							duplicate = duplicate;
    							maxI = i;
    							maxK = x.indexOf(w, j);
    						}
    					}
    				}
  			}
		}

		System.out.println("-----The longest duplicate is \"" + duplicate + "\" appearing at " + maxI + " and " + maxK + ".");	
	}//end search
	
	
	public static String simplify(String u)
	{
		StringBuilder builder = new StringBuilder();
		String lower = u.toLowerCase();
		
		for(int i = 0; i <= lower.length()-1; i++)
		{
			if (lower.charAt(i) >= 'a' && lower.charAt(i) <= 'z')
				builder.append(lower.charAt(i));
		}
		
		return builder.toString();
	}//end simplify
}//end class
