package javabean;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Metodes {
	

	static String virknesParbaude(String zinojums, String noklusejums) {
		String virkne;
		do {
			virkne = JOptionPane.showInputDialog(zinojums, noklusejums);
			if(virkne == null)
				return null;
			
			virkne = virkne.trim();			
		} while(!Pattern.matches("^[\\p{L} ]+$", virkne));
		
		return virkne;
	}
	
	
	static int skaitlaParbaude(String zinojums, int min, int max) {
		String ievade;
		int skaitlis;
		
		while(true) {
			ievade = JOptionPane.showInputDialog(zinojums, min);
			if(ievade == null)
				return -1;
			
			try {
				skaitlis = Integer.parseInt(ievade);
				if(skaitlis < min || skaitlis > max) {
					JOptionPane.showMessageDialog(null, 
					"Norādītais skaitlis ir ārpus pieļaujamā intervāla", 
					"Brīdinājums", JOptionPane.WARNING_MESSAGE);
					continue;
				}
				
				return skaitlis;
				
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
				"Netika ievadīts vesels skaitlis!", "Kļūda", 
				JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	static String burtciparuParbaude(String zinojums, String persK) {
		
		String virkne;
		
		do {
			virkne = JOptionPane.showInputDialog(zinojums, persK);
			if(virkne == null)
				return null;
			
			virkne = virkne.trim();			
		} while(!Pattern.matches("\\d{6}-\\d{5}", virkne)); // vai "^[0-9]{6}-[0-9]{5}$"
		
		return virkne;
		
	}
	static String talrunaParbaude(String zinojums, String noklusejums) {
		
		String virkne;
		
		do {
			virkne = JOptionPane.showInputDialog(zinojums, noklusejums);
			if(virkne == null)
				return null;
			
			virkne = virkne.trim();			
		} while(!Pattern.matches("^[2, 6]{1}\\d{7}", virkne)); // vai "^[2, 6]{1}[0-9]{7}$"
		
		return virkne;
		
}
	static String generetNr() {
		String AplNR = "";
		for(int i = 0; i<7 ; i++) {
			
			int Cipars = (int)(Math.random() * 10);
			int Burts = (int)(Math.random()*25)+65;
			
			if(Cipars % 2 == 0) {
				AplNR += (char) Burts;
			} else {
				AplNR += Cipars;
			}			
		}
		System.out.println(AplNR);
	return AplNR;
}
	
}
