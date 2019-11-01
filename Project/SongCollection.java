import java.io.*;
import java.util.*;

public class SongCollection implements SongCollectionInt
{
	private Song [] theSongs;
	
	public SongCollection(Song [] theSongs)
	{
		this.theSongs = theSongs;
	}
	
	//methods
	public int size() {return theSongs.length;}
	
	public void addFromFile(File f)
	{
		try{
			Scanner fileReader = new Scanner(f);
			int count = Integer.parseInt(fileReader.nextLine());
		
			Song [] merged = Arrays.copyOf(theSongs, this.size() + count);
			while(fileReader.hasNextLine() == true)
			{
				for(int i = 0; i < merged.length; i++)
				{
					Song s = new Song(fileReader.nextLine(), fileReader.nextLine());
					merged[i] = s;
				}
			}	
			theSongs = merged;
		}
		catch(FileNotFoundException e){
			System.out.println("***File Not Found***");
		}
	}//end addfromfile
	
	public void writeToFile(File f)
	{
		try{
			PrintStream write = new PrintStream(f);
			for(int i = 0; i < theSongs.length; i++)
			{
				write.println(theSongs[i].getTitle());
				write.println(theSongs[i].getArtist());
			}	
		}
		catch(FileNotFoundException e){
			System.out.println("***File Not Found***");
		}
	}//end write to file
	
	public void addOneSong(String t, String a)
	{
		Song [] nList = Arrays.copyOf(theSongs, size()+1);
		nList[nList.length -1] = new Song(t, a);
		theSongs = nList;	
	}//end add one song
	
	public void delete(int pos)
	{
		int p = 0;
		Song [] nDelArr = Arrays.copyOf(theSongs, theSongs.length-1);
		for(int i = pos; i < theSongs.length-1; i++)
		{
			p = i+1;
			nDelArr[i] = theSongs[p];	
		}
		
		theSongs = nDelArr;
	}//end delete
	
	public void searchByTitle(String key)
	{
		for(int i = 0; i < theSongs.length; i++)
		{
			//System.out.println(theSongs[i].getTitle());
			if ((theSongs[i].getTitle()).indexOf(key) >=0)
				System.out.printf("%03d: %s, %s\n", i, theSongs[i].getTitle(), theSongs[i].getArtist());
		}
	}//end search by title
	
	public void searchByArtist(String key)
	{
		for(int i = 0; i < theSongs.length; i++)
		{
			if (theSongs[i].getArtist().indexOf(key) >= 0)
				System.out.printf("%03d: %s, %s\n", i, theSongs[i].getTitle(), theSongs[i].getArtist());
		}
	}//end search by artist
	
	public void show(int start, int end)
	{
		for(int i = start; i < end; i++)
			System.out.printf("%03d: %s, %s\n", i, theSongs[i].getTitle(), theSongs[i].getArtist());
	}//end show
}//end SongCollection Class
