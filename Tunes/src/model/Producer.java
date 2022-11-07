package model;

import java.time.LocalDate;

public abstract class Producer extends User {
	
	private String url;

	public Producer(String name, String id, LocalDate date,String url) {
		super(name, id, date);
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "Producer [url=" + url + ", getName()=" + getName() + ", getId()=" + getId() + ", getDate()=" + getDate() + "]";
	}
	
}
