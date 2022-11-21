package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContentCreator extends Producer {
	
	private ArrayList<Podcast> podcast;
	
	public ContentCreator(String name, String id, LocalDate date, String url) {
		super(name, id, date, url);
		this.podcast = new ArrayList<Podcast>();
	}
	
	public ArrayList<Podcast> getPodcast() {
		return podcast;
	}

	public void setPodcast(ArrayList<Podcast> podcast) {
		this.podcast = podcast;
	}
	
	public boolean addPodcast(Podcast pod) {
		return podcast.add(pod);
	}

	@Override
	public String toString() {
		return "Content Creator: \nName: " + getName() + ", Id: " + getId() + ", Date: " + getDate();
	}

	
	
	
}
