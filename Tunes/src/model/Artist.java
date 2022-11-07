package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Artist extends Producer{
	
	private ArrayList<Song> songs;
	
	public Artist (String name, String id, LocalDate date, String url) {
		super(name, id, date, url);
	}
	
	public Artist (String name, String id, LocalDate date, String url, Song songs) {
		super(name, id, date, url);
		this.songs = new ArrayList<Song>();
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
	
	


}
