package model;

import java.time.LocalDate;

public abstract class User {
	
	private String name;
	private String id;
	private LocalDate date;
	
	User(String name, String id, LocalDate date){
		this.name = name;
		this.id = id;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", date=" + date + "]";
	}
	
}
