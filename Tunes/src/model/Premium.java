package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Premium extends Consumer {
	
	private ArrayList<PlayList> playlists;
	private ArrayList<Song> songs;
	private ArrayList<Podcast> podcasts;

	public Premium (String name, String id, LocalDate date){
		super(name, id, date);
	}
	
	public Premium (String name, String id, LocalDate date, PlayList playlists, Song songs, Podcast podcasts){
		super(name, id, date);
		
		this.playlists = new ArrayList<PlayList>();
		this.songs = new ArrayList<Song>();
		this.podcasts = new ArrayList<Podcast>();
	}

	public ArrayList<PlayList> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(ArrayList<PlayList> playlists) {
		this.playlists = playlists;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}

	public ArrayList<Podcast> getPodcasts() {
		return podcasts;
	}

	public void setPodcasts(ArrayList<Podcast> podcasts) {
		this.podcasts = podcasts;
	}
	
	@Override
	public String toString() {
		return "Standard [name=" + getName() + ", id=" + getId() + ", date=" + getDate() + ", playlists=" + playlists
				+ ", songs=" + songs + ", podcasts=" + podcasts + "]";
	}
}
