package model;

import java.time.LocalDate;

public abstract class Consumer extends User {
	
	public Consumer(String name, String id, LocalDate date){
		super(name, id, date);
	}

	@Override
	public String toString() {
		return "Consumer [getName()=" + getName() + ", getId()=" + getId() + ", getDate()=" + getDate()
				+ "]";
	}
	
	
	
}
