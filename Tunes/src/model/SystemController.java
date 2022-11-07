package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class SystemController {
	
	private ArrayList<User> users;
	
	public SystemController() {
		this.users = new ArrayList<User>();
	}
	
	public boolean registerUserArtist(String name, String id, LocalDate date, String url) {
		return users.add(new Artist(name, id, date, url));
	}
	
	public boolean registerUserCCreator(String name, String id, LocalDate date, String url) {
		return users.add(new ContentCreater(name, id, date, url));
	}
	
	public boolean registerUserStandard(String name, String id, LocalDate date) {
		return users.add(new Standard(name, id, date));
	}
	
	public boolean registerUserPremium(String name, String id, LocalDate date) {
		return users.add(new Premium(name, id, date));
	}
}
