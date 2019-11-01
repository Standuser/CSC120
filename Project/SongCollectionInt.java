import java.io.*;
import java.util.*;
public interface SongCollectionInt
{
  

	
  public int size();

  public void addFromFile( File f );

  
  public void writeToFile( File f );

  
  public void addOneSong( String t, String a );

  
  public void delete( int pos );

  public void searchByTitle( String key );

 
  public void searchByArtist( String key );

  public void show( int start, int end );

}
