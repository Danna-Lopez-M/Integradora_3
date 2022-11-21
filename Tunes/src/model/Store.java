package model;

import java.time.LocalDate;

public class Store {
	
	private Song song;
    private LocalDate buyDate;
    
    public Store(Song song) {
    	this.song = song;
    	this.buyDate = LocalDate.now();
    }

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public LocalDate getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(LocalDate buyDate) {
		this.buyDate = buyDate;
	}
	
}
