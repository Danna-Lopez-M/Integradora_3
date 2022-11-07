package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;

public class Standard extends Consumer {
	
	private PlayList[] playlists;
	private Song[] songs;
	private ArrayList<Podcast> podcasts;
	private int playedAudio;
	private double minReprod;
	
	public Standard(String name, String id, LocalDate date){
		super(name, id, date);
	}
	
	public Standard(String name, String id, LocalDate date, PlayList[] playlists, Song[] songs, Podcast  podcasts, int playedAudio){
		super(name, id, date);
		
		this.playlists = new PlayList[20];
		this.songs = new Song[100];
		this.podcasts = new ArrayList<Podcast>();
		this.playedAudio = playedAudio;
		
	}

	public PlayList[] getPlaylists() {
		return playlists;
	}

	public void setPlaylists(PlayList[] playlists) {
		this.playlists = playlists;
	}

	public Song[] getSongs() {
		return songs;
	}

	public void setSongs(Song[] songs) {
		this.songs = songs;
	}

	public ArrayList<Podcast> getPodcasts() {
		return podcasts;
	}

	public void setPodcasts(ArrayList<Podcast> podcasts) {
		this.podcasts = podcasts;
	}

	public int getPlayedAudio() {
		return playedAudio;
	}

	public void setPlayedAudio(int playedAudio) {
		this.playedAudio = playedAudio;
	}

	@Override
	public String toString() {
		return "Standard [name=" + getName() + ", id=" + getId() + ", date=" + getDate() + ", playlists=" + Arrays.toString(playlists)
				+ ", songs=" + Arrays.toString(songs) + ", podcasts=" + podcasts + ", playedAudio=" + playedAudio
				+ ", minReprod=" + minReprod + "]";
	}
	
	
}
