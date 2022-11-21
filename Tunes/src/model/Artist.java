package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Artist extends Producer{
	
	private ArrayList<Song> songs;
	
	public Artist (String name, String id, LocalDate date, String url) {
		super(name, id, date, url);
		this.songs = new ArrayList<Song>();
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
	
	public boolean addSong(Song sg) {
		return songs.add(sg);
	}
	
	public String toString() {
		return "Artist: \nName: " + getName() + ", Id: " + getId() + ", Date: " + getDate();
	}
}
