package model;


public class Song extends Audio implements Sellable{
	
	private String album;
	private Genre genre;
	private double price;
	private String nameArtist;
	private int timesSold;
	
	public Song(String name, String url, double duration, String album, int genre, double price, String nameArtist){
		super(name, url, duration);
		this.album = album;
		this.genre = Genre.values()[genre];
		this.price =price;
		this.nameArtist = nameArtist;
		this.timesSold = 0;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNameArtist() {
		return nameArtist;
	}

	public void setNameArtist(String nameArtist) {
		this.nameArtist = nameArtist;
	}

	public int getTimesSold() {
		return timesSold;
	}

	public void setTimesSold(int timesSold) {
		this.timesSold = timesSold;
	}
	
	public String reproduce() {
		String msg = "";
		
		msg = "Reproducing the song ";
		
		return msg;
	}
	
	public String sell() {
		timesSold++;
		String msg = "";
		
		msg = "The song " + getName() + " has been sold.";
		return msg;
	}
	
}
