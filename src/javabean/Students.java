package javabean;

import java.io.Serializable;

public class Students implements Serializable {
	private String vards, uzvards, perskods, talr, studProg, aplNr;
	private int kurss = 1;
	private boolean valstsFin = false, sanemStip = false;
	
	
	public Students () {}
	
	public String dabutVards() {
		return vards;
	}
	public String dabutUzvards() {
		return uzvards;
	}
	public String dabutPersKods() {
		return perskods;
	}
	public String dabutTalr() {
		return talr;
	}
	public String dabutStudProg() {
		return studProg;
	}
	public String dabutAplNr() {
		return aplNr;
	}
	public int dabutKurss() {
		return kurss;
	}
	public boolean irValstsFin() {
		return valstsFin;
	}
	public boolean irSanemStip() {
		return sanemStip;
	}
	
}
