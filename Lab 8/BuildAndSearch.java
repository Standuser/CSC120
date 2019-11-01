import java.util.*;


public class BuildAndSearch
{
	public static void main(String [] args)
	{
		StringBuilder myBuilder = new StringBuilder();
		Scanner reader = new Scanner(System.in);
		while (true)
		{
			System.out.println("******** Choose Action ********");
			System.out.println("(A)dd more text\n"	+
						"(V)iew text\n"	+
						"(S)earch\n"	+
						"(Q)uit");
			String choice = reader.next();

			switch (choice.charAt(0))
			{
				case 'A':
					add(myBuilder);			break;
				case 'V':
					System.out.println(myBuilder.toString());break;
				case 'S':
					search(myBuilder);			break;
				case 'Q':
					return ;
				default:
					System.out.println("Unsupported Selection!");
			}
		}
	}//end main



	public static void add(StringBuilder builder)
	{
		Scanner addReader = new Scanner(System.in);
		System.out.println("Enter texts line by line. Enter '.' to finish.");

		String newText="";

		while(!newText.equals("."))
		{
			newText = addReader.nextLine();
			if(newText.equals("."))
				break;
			builder.append(newText + "\n");
		}
	}//end add



	public static void search(StringBuilder builder)
	{
		Scanner searchReader = new Scanner(System.in);
		int pos = 0;
		int result = 0;
		int match = 0;

		System.out.print("Enter search key: ");
		String key = searchReader.nextLine();

		while(pos < builder.length())
		{
			result = builder.indexOf(key, pos);
			if (result < 0)
				break;
			else
			{
				match++;
				System.out.println("Match no. " + match + " is found at " + result);
				pos = result + 1;
			}
		}



	}//end search


}//end class
