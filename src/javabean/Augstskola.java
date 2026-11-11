package javabean;

import javax.swing.JOptionPane;

public class Augstskola {

	public static void main(String[] args) {
		String izvelne, fNosaukums = "studenti.ser"; //serelaizets fails
		
		String[] darbibas = {"Jauns students", "Noņemt studentu",
				"Meklēt studentu", "Studentu saraksts", "Kārtot",
				"Budžeta vietas", "Stipendijas", "Aizvert programmu" };
		
		String[] programmas = {"Uzņēmējdarbība un vadīšana", "Datorsistēmas",
				"Mehatronika", "Elektrotehnologiju datorvadiba"};
		//ja ir ar lieliem burtiem tad tas ir objekta tips
		Integer[] kurss = {1, 2, 3, 4, 5};
		String[] atbilde = {"Jā", "Nē"};
		
		
		//velak pieliksiet ievades datu parbaude veseliem sk
		int studSk = Metodes.skaitlaParbaude("Cik studentus uzglabāsi?", 1, 40);
		
		
		Students[] studentuMasivs = new Students[studSk];
		Students persona = null;
		
		//Velak
		int indekss = 0;
		
		do {
			izvelne = (String) JOptionPane.showInputDialog(null, "izvēlies darbību",
					"izvēlne", JOptionPane.QUESTION_MESSAGE, null, darbibas, darbibas[0]);
			
			if(izvelne == null)
				izvelne = darbibas[darbibas.length-1];
			
			switch(izvelne) {
			
			case "Jauns students":
				persona = new Students();
				String vards = Metodes.virknesParbaude("Ievadi studenta vārdu", "Pēteris");
				if(vards == null)
					break;
				persona.iestatitVards(vards);
				
				String uzvards = Metodes.virknesParbaude("Ievadi stundenta vardu", "Ozols");
				if(uzvards == null)
					break;
				persona.iestatitUzvards(uzvards);
				
				String pk = Metodes.burtciparuParbaude("Ievadi studenta personas kodu", "000000-00000");
				if(pk == null)
					break;
				persona.iestatitPersKods(pk);
				
				String talr = Metodes.talrunaParbaude("Ievadi tālruna numuru", "23345319");
				if (talr == null)
					break;
				persona.iestatitTalr(talr);
				
				String studProg = (String) JOptionPane.showInputDialog(null,
						"Izvelies studiju programmu", "izvēlne", JOptionPane.QUESTION_MESSAGE, null,
						programmas, programmas[0]);
				if(studProg  == null)
					break;
				persona.iestatitStudProg(studProg);
				
				persona.iestatitAplNr(Metodes.generetNr());
				
				Integer cipars = (Integer) JOptionPane.showInputDialog(null, "Izvēlies kursu", "Izvelne",
						JOptionPane.QUESTION_MESSAGE, null, kurss, kurss[0]);
				if(cipars == null)
					break;
				persona.iestatitKurss(cipars);
				
				if(JOptionPane.showInputDialog(null, "vai jāmaksā par studijām?", "Valsts finansējums",
						JOptionPane.QUESTION_MESSAGE, null, atbilde, atbilde[0]).equals("Jā")){
					persona.iestatitValstsFin(false);
				} else {
					persona.iestatitValstsFin(true);
				}
				
				if(JOptionPane.showInputDialog(null, "vai saņem stipendiju?", "Stipendija",
						JOptionPane.QUESTION_MESSAGE, null, atbilde, atbilde[0]).equals("Jā")){
					persona.iestatitSanemStip(false);
				} else {
					persona.iestatitSanemStip(true);
				}
				
				if(indekss < studentuMasivs.length) {
					studentuMasivs[indekss] = persona;
					indekss++;
					
				} else {
					JOptionPane.showMessageDialog(null, "Masīva nav brīvu vietu!", "Brīdinājums",
							JOptionPane.ERROR_MESSAGE);
					break;
				}
				
				break;
				
			case "Noņemt studentu":
				
				break;
			}
			
		}while(!izvelne.equals(darbibas[darbibas.length-1]));
		
	}

}
