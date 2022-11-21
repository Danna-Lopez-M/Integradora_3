package model;

import java.util.ArrayList;
import java.util.Random;

public class PlayList {
	
	private String name;
	private ArrayList <Audio> audios;
	private int[][] matrixCode;
	private int code;
	private int amountS;
	private int amountP;
	
	public PlayList(String name) {
		super();
		this.name = name;
		this.audios = new ArrayList<Audio>();
		this.matrixCode = new int[6][6];
		fillMatrix();
		this.code = 0;
		this.amountS = 0;
		this.amountP = 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Audio> getAudios() {
		return audios;
	}

	public void setAudios(ArrayList<Audio> audios) {
		this.audios = audios;
	}

	public int[][] getMatrixCode() {
		return matrixCode;
	}

	public void setMatrixCode(int[][] matrixCode) {
		this.matrixCode = matrixCode;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public int getAmountS() {
		return amountS;
	}

	public void setAmountS(int amountS) {
		this.amountS = amountS;
	}

	public int getAmountP() {
		return amountP;
	}

	public void setAmountP(int amountP) {
		this.amountP = amountP;
	}

	public boolean addAudio(Audio aud) {
		if (aud instanceof Song) {
			amountS++;
		}
		else if (aud instanceof Podcast){
			amountP++;
		}
		return audios.add(aud);	
	}
	
	public boolean removeAudio(Audio aud) {
		return audios.remove(aud);
	}
	
	public void fillMatrix() {
		for (int i=0; i<matrixCode.length; i++) {
			for (int j=0; j<matrixCode.length; j++) {
				Random rd = new Random();
				matrixCode[i][j] = rd.nextInt(10); 
			}
		}
	}
	
	public String showMatrixPlaylist(int[][] matrixCode) {
		String msg ="";
		
		for (int i=0; i<matrixCode.length; i++){
			for (int j=0; j<matrixCode.length; j++) {
				msg += "" + matrixCode[i][j];
			}
			msg += "\n";
		}
		return msg;
	}
	
}
