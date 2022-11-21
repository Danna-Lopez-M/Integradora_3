package model;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Consumer extends User {
	
	private int playedSongs;
	private int playedPodcasts;
	private ArrayList <Song> reprodSongs;
	private ArrayList <Podcast> reprodPodcasts;
	private int songsBuy;
	private double secReprod;
	
	public Consumer(String name, String id, LocalDate date){
		super(name, id, date);
		this.playedSongs = 0;
		this.playedPodcasts = 0;
		this.reprodSongs =  new ArrayList <Song>();
		this.reprodPodcasts = new ArrayList <Podcast>();
		this.songsBuy = 0;
		this.secReprod = 0;
	}
	
	public int getPlayedSongs() {
		return playedSongs;
	}

	public void setPlayedSongs(int playedSongs) {
		this.playedSongs = playedSongs;
	}

	public int getPlayedPodcasts() {
		return playedPodcasts;
	}

	public void setPlayedPodcasts(int playedPodcasts) {
		this.playedPodcasts = playedPodcasts;
	}

	public ArrayList<Song> getReprodSongs() {
		return reprodSongs;
	}

	public void setReprodSongs(ArrayList<Song> reprodSongs) {
		this.reprodSongs = reprodSongs;
	}

	public ArrayList<Podcast> getReprodPodcast() {
		return reprodPodcasts;
	}

	public void setReprodPodcast(ArrayList<Podcast> reprodPodcasts) {
		this.reprodPodcasts = reprodPodcasts;
	}

	public ArrayList<Podcast> getReprodPodcasts() {
		return reprodPodcasts;
	}

	public void setReprodPodcasts(ArrayList<Podcast> reprodPodcasts) {
		this.reprodPodcasts = reprodPodcasts;
	}

	public int getSongsSold() {
		return songsBuy;
	}

	public void setSongsSold(int songsBuy) {
		this.songsBuy = songsBuy;
	}

	public double getSecReprod() {
		return secReprod;
	}

	public void setSecReprod(double secReprod) {
		this.secReprod = secReprod;
	}
	
	public void addChangeReprodSongs(Song song) {
		playedSongs++;
		reprodSongs.add(song);
	}
	
	public void addChangeReprodPodcasts(Podcast pod) {
		playedPodcasts += 2;
		reprodPodcasts.add(pod);
	}
	
	public void changeSongsBuy() {
		songsBuy++;
	}
	
	public String mostListenGenre() {
		String msg = "";
		
		for (int i=0; i<reprodSongs.size(); i++) {
			for (int j=0; j<Genre.values().length; j++) {
				if (reprodSongs.get(i) instanceof Song) {
					
				}
			}
		}
		
		return msg;
	}

	@Override
	public String toString() {
		return "Consumer [getName()=" + getName() + ", getId()=" + getId() + ", getDate()=" + getDate()
				+ "]";
	}
	
	
	
}
