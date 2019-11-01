import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class SongMain
{
  public static void main(String[] args) {
      SongCollection data=new SongCollection();
      Scanner keyboard=new Scanner(System.in);
      int input=4;
      while(input!=0) {
    	  System.out.println("========Select action========");
    	  System.out.println("0. Quit");
    	  System.out.println("1. Get collection size");
    	  System.out.println("2. Search for title");
    	  System.out.println("3. Search for artist");
    	  System.out.println("4. Add from file");
    	  System.out.println("5. Save to file");
    	  System.out.print("6. Add one song\n" + 
    	  		"7. Remove one song\n" + 
    	  		"8. Show\n" + 
    	  		"Enter choice:");
    	  input=keyboard.nextInt();
    	  switch(input) {
    	  case 1:
    		  System.out.println(data.size());
    		  break;
    	  case 2:
    		  System.out.print("Enter title search key: ");
    		  String titkey= keyboard.next();
    		  data.searchByTitle(titkey);break;
    	  case 3:
    		  System.out.print("Enter artist search key: ");
    		  String artkey=keyboard.next();
    		  data.searchByArtist(artkey);break;
    	  case 4:
    		  System.out.print("Enter file name: ");
    		  data.addFromFile(new File(keyboard.next()));
    		  break;
    	  case 5:
    		  System.out.print("Enter file name: ");
    		  data.writeToFile(new File(keyboard.next()));
    		  break;
    	  case 6:
    		  Scanner keyboard1=new Scanner(System.in);
    		  System.out.print("Enter title: ");
    		  String title = keyboard1.nextLine();
    		  System.out.print("Enter artist: ");
    		  String artist = keyboard1.nextLine();
    		  data.addOneSong(artist,title);break;
    	  case 7:
    		  System.out.print("Enter position: ");
    		  data.delete(keyboard.nextInt());break;
    	  case 8:
    		  System.out.print("Enter start position: ");
    		  int start=keyboard.nextInt();
    		  System.out.print("Enter end position: ");
    		  int end=keyboard.nextInt();
    		  data.show(start, end);
    		  break;
    	  }
      }
  }
}
