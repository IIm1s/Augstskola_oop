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
	
	//----------------------------------------------\\
	
	public void iestatitVards(String vards) {
		this.vards = vards;
	}
	public void iestatitUzvards(String uzvards) {
		this.uzvards = uzvards;
	}
	public void iestatitPersKods(String persKods) {
		this.perskods =  persKods;
	}
	public void iestatitTalr(String talr) {
		this.talr = talr;
	}
	public void iestatitStudProg(String studProg) {
		this.studProg = studProg;
	}
	public void iestatitAplNr(String aplNr) {
		 this.aplNr = aplNr;
	}
	public void iestatitKurss(int kurss) {
		this.kurss = kurss;
	}
	public void iestatitValstsFin(boolean valstsFin) {
		this.valstsFin = valstsFin;
	}
	public void iestatitSanemStip(boolean sanemStip) {
		this.sanemStip = sanemStip;
	}
	
	
	
}
