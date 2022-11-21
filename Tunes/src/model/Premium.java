package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Premium extends Consumer {
	
	private ArrayList<PlayList> playlists;
	private ArrayList<Store> songs;

	public Premium (String name, String id, LocalDate date){
		super(name, id, date);
		
		this.playlists = new ArrayList<PlayList>();
		this.songs = new ArrayList<Store>();
	}

	public ArrayList<PlayList> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(ArrayList<PlayList> playlists) {
		this.playlists = playlists;
	}

	public ArrayList<Store> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Store> songs) {
		this.songs = songs;
	}
	
	public boolean createdPlayList(String name) {
		return playlists.add(new PlayList(name));
	}
	
	public String showPlaylist() {
		String msg = "";
		
		for (int i=0; i<playlists.size(); i++) {
			msg += (i+1) + ". " + playlists.get(i).getName();
		}
		
		if(msg == "") {
			msg = "The usre don't have any playlist created yet";
		}
		
		return msg;
	}
	
	public boolean addAudioPlaylist (int posP, Audio aud) {
		return playlists.get(posP).addAudio(aud);
 	}
	
	public boolean removeAudioPlaylist (int posP, Audio aud) {
		return playlists.get(posP).addAudio(aud);
	}
	
	public boolean addBuyedSong(Song song) {
		return songs.add(new Store(song));
	}
	
	@Override
	public String toString() {
		return "Standard [name=" + getName() + ", id=" + getId() + ", date=" + getDate() + ", playlists=" + playlists
				+ ", songs=" + songs + "]";
	}
}
