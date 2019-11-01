import java.util.Scanner;

public class lab10{

	public static void main(String[] args){

		Scanner keyboard=new Scanner(System.in);
		String[] names = new String[0];
		int[] counts = new int[0];
		System.out.print(
		   "###########################################\n"
	  	  +"# Enter the votes, one vote per line.     #\n"
		  +"# End with either CTRL-D or an empty line.#\n"
		  +"###########################################\n");
		String name= "";
		while(!name.equals(".")){
		   	name = keyboard.nextLine();
		   	if(name.equals(".")){
				break;
  		   	}
		 	int position = find(names,name);
				if(position>=0){
				counts[position]++;
			}
			else{
				names = addName(names,name);
				counts = addNewCount(counts);
			}
		}
		findWinner(names,counts);
	}

	public static int find(String[] names, String name){
	    for(int i = 0; i<names.length-1;i++){
		if(names[names.length-1].equals(name)){
			return i;
		    }
	    }
		return -1;
	}

	public static String[] addName(String[] names, String name){
	    String[] newNames = new String[names.length+1];
	    for(int i =0;i<names.length;i++){
		newNames[i] = names[i];
	    }
	    newNames[names.length] = name;
	    return newNames;
	}

	public static int[] addNewCount(int[] counts){
	    int[] newCounts = new int[counts.length+1];
	    for(int i =0;i<counts.length;i++){
		newCounts[i] = counts[i];
	    }
	    newCounts[counts.length]=1;
	    return newCounts;
	}

	public static void findWinner(String[] names, int[] counts){
	    int max = 0;
	    int winner = 0;
	    for(int i = 0; i<names.length;i++){
		if(counts[i]>max){
		    max = counts[i];
		    winner = i;
		}
		
	       System.out.printf("%s received %d votes.\n",names[i],counts[i]);
		
	    }
 		System.out.printf("The winner is %s.\n",names[winner]);
	}

}
