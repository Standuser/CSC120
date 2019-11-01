public class Song implements SongInt
{
	private String artist, title;
    public Song(String title, String artist){
    	this.artist = artist;
    	this.title = title;
    }
    	public String getTitle() {
    		return title;
    	}
    	public String getArtist() {
    		return artist;
    	}
    

}