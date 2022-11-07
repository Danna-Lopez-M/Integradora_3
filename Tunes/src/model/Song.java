package model;

import java.time.LocalDate;


public abstract class Song extends Audio{
	
	private String album;
	private Genre genre;
	private double price;
	private int timesSold;
	private LocalDate dateBuy;
	
	public Song(String name, String url, double duration, int numReprod, String album, int genre, double price, int timesSold, LocalDate dateBuy){
		super(name, url, duration, numReprod);
		this.album = album;
		this.genre = Genre.values()[genre];
		this.price =price;
		this.timesSold = timesSold;
		this.dateBuy = dateBuy;
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

	public int getTimesSold() {
		return timesSold;
	}

	public void setTimesSold(int timesSold) {
		this.timesSold = timesSold;
	}

	public LocalDate getDateBuy() {
		return dateBuy;
	}

	public void setDateBuy(LocalDate dateBuy) {
		this.dateBuy = dateBuy;
	}

	public Song(String name, String url, double duration, int numReprod, String album, Genre genre, double price,
			int timesSold, LocalDate dateBuy) {
		super(name, url, duration, numReprod);
		this.album = album;
		this.genre = genre;
		this.price = price;
		this.timesSold = timesSold;
		this.dateBuy = dateBuy;
	}
	
}
