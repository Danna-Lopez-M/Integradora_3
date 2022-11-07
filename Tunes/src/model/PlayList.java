package model;

import java.util.ArrayList;

public class PlayList {
	
	private String name;
	private Audio[] audios;
	private int code;
	
	public PlayList(String name, Audio[] audios, int code) {
		super();
		this.name = name;
		this.audios = new Audio[30];
		this.code = code;
	}

}
