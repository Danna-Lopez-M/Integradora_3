package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContentCreater extends Producer {
	
	private ArrayList<Podcast> podcast;
	
	public ContentCreater(String name, String id, LocalDate date, String url) {
		super(name, id, date, url);
	}
	
	public ContentCreater(String name, String id, LocalDate date, String url, Podcast podcast) {
		super(name, id, date, url);
		this.podcast = new ArrayList<Podcast>();
	}

	public ArrayList<Podcast> getPodcast() {
		return podcast;
	}

	public void setPodcast(ArrayList<Podcast> podcast) {
		this.podcast = podcast;
	}

	@Override
	public String toString() {
		return "Content Creater: \nName: " + getName() + ", Id:" + getId() + ", Date" + getDate();
	}

	
	
	
}
