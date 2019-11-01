import java.util.*;
import java.io.*;

public class wishListMaster{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner keyboard = new Scanner(System.in);
		File readInFile = new File(args[0]);
		File writeOutFile = new File(args[1]);
		
		int choice ;
		String[][] data = read(readInFile);
		
		System.out.println("You can add, remove, or view");
		System.out.println("Which action should I perform?");
		System.out.println("1. Add");
		System.out.println("2. Remove");
		System.out.println("3. View the items");
		System.out.println("4. Quiz");
		System.out.print("Enter your choice: ");
		choice = Integer.parseInt(keyboard.nextLine());
		
		while(choice != 4){
			switch(choice){
				case 1: System.out.println("Enter type, name, price: ");
						String[] row = keyboard.nextLine().split("\t");
						data = add(data,row);
						break;
				case 2:System.out.print("Enter index: ");
						int index = Integer.parseInt(keyboard.nextLine());
						data = remove(data,index);
						break;
				case 3:view(data);
						break;
			}
		System.out.println(" ");
		System.out.println("You can add, remove, or view");
		System.out.println("Which action should I perform?");
		System.out.println("1. Add");
		System.out.println("2. Remove");
		System.out.println("3. View the items");
		System.out.println("4. Quiz");
		System.out.print("Enter your choice: ");
		
		choice = Integer.parseInt(keyboard.nextLine());
	}
	write(writeOutFile,data);
}

public static String[][] read(File f) throws FileNotFoundException{
	System.out.println("...reading from file: " + f.getName());
	Scanner scanner = new Scanner(f);
	int size = Integer.parseInt(scanner.nextLine());
	String [][] data = new String[size][];
	for(int i =0; i<size;i++){
		data[i] = scanner.nextLine().split("\t");
	}
	scanner.close();
	return data;
}

public static void write(File f, String[][] data) throws FileNotFoundException{
	System.out.println("...writing to file: " + f.getName());
	PrintStream stream = new PrintStream(f);
	stream.println("total= " + data.length);
	for(int i = 0; i < data.length; i++)
	{
		stream.printf("%s\t%s\n",data[i][0],data[i][1],data[i][2]);
	}
	stream.close();
}      
public static String[][] add(String[][]data,String[]item){
	String newData[][];
	newData = new String[(data.length)+1][];
	for(int t=0;t<data.length;t++)
	{
		newData[t]=data[t];
	}
	newData[data.length] = item;
	return newData;
}
	
public static String[][] remove(String[][] data, int index){
	String[][] newData;
	newData = new String[(data.length) - 1][];
	for (int o = 0; o < index; o++) {
		newData[o] = data[o];
	}
	for (int o  = index + 1; o < newData.length; o++) {
		newData[o-1]=data[o];
	}
	return newData;
}	
	
public static void view(String[][]data){
	System.out.println("total="+data.length);
	for(int i= 0;i<data.length;i++){
	 	System.out.printf("%03d:%s\t%s\t%s%n",i,data[i][0],data[i][1],data[i][2]);
	}
}
}


