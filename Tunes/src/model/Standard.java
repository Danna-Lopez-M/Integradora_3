package model;

import java.util.Arrays;
import java.time.LocalDate;

public class Standard extends Consumer {
	
	private PlayList[] playlists;
	private Store[] buySongs;
	
	public Standard(String name, String id, LocalDate date){
		super(name, id, date);
		
		this.playlists = new PlayList[20];
		this.buySongs = new Store[100];
	}

	public PlayList[] getPlaylists() {
		return playlists;
	}

	public void setPlaylists(PlayList[] playlists) {
		this.playlists = playlists;
	}

	public Store[] getBuySongs() {
		return buySongs;
	}

	public void setBuySongs(Store[] buySongs) {
		this.buySongs = buySongs;
	}

	public void createdPlayList(String name) {
		for (int i=0; i<playlists.length; i++) {
			if (playlists[i] == null) {
				playlists[i] = new PlayList(name);
			}
		}
	}
	
	public String showPlaylist() {
		String msg = "";
		
		for (int i=0; i<playlists.length; i++) {
			msg += (i+1) + ". " + playlists[i].getName();
		}
		
		if(msg == "") {
			msg = "The user don't have any playlist created yet";
		}
		
		return msg;
	}
	
	public boolean addAudioPlaylist (int posP, Audio aud) {
		return playlists[posP].addAudio(aud);	
	}
	
	public boolean removeAudioPlaylist (int posP, Audio aud) {
		return playlists[posP].removeAudio(aud);
	}
	
	public boolean addBuyedSong(Song song) {
		boolean control = false;
		
		for (int i=0; i<buySongs.length; i++) {
			if(buySongs[i]==null) {
				buySongs[i] = new Store(song);
				control = true;
			}
		}
		
		return control;
	}
	
	@Override
	public String toString() {
		return "Standard [name=" + getName() + ", id=" + getId() + ", date=" + getDate() + ", Buyed songs=" + Arrays.toString(buySongs) 
			+ ", playedAudio=" + getReprodSongs() + getReprodPodcast() + ", minReprod=" + getSecReprod() + "]";
	}
	
	
}
