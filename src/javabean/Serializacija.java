package javabean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class Serializacija {
	static void Serializet(Students[] studentuMasivs, String fNosaukums) {
		try {
			FileOutputStream fos  = new FileOutputStream(fNosaukums);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(studentuMasivs);
			oos.close();
			
		}catch (FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "Netika atrasts fails! "+e, "Kļūda",
					JOptionPane.ERROR_MESSAGE);
		} catch (IOException io){
			JOptionPane.showMessageDialog(null, "Kļūda ierakstot datus! "+ io, "Kļūda",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}


	static Students[] Deserializet(String fNosaukums) {
		Students[] studentuMasivs = new Students[100];
		try {
			FileInputStream fis = new FileInputStream(fNosaukums);
			ObjectInputStream ois = new ObjectInputStream(fis);
			studentuMasivs = (Students[]) ois.readObject();
			ois.close();
			
		}catch (IOException io){
				JOptionPane.showMessageDialog(null, "Kļūda nolasot datus! "+ io, "Kļūda",
						JOptionPane.ERROR_MESSAGE);
		} catch(ClassNotFoundException c){
			JOptionPane.showMessageDialog(null, "Netika atrasts klase! "+c, "Kļūda",
					JOptionPane.ERROR_MESSAGE);
		}
		return studentuMasivs;
		}
	}

