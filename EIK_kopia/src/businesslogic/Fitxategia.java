/*
package businesslogic;

import java.io.*;

import java.util.*;

import eredua.*;

public class Fitxategia {

	private String izena;

	private ArrayList zerrenda;

	public Fitxategia() {

	}

	public Fitxategia(String izena) {

		this.izena = izena;

	}

	public void setIzena(String izena) {

		this.izena = izena;

	}

	public void inprimatu() {

		for (Integer i = 0; i < zerrenda.size(); ++i) {

			Langilea2 l = (Langilea2) zerrenda.get(i);

			IO.println(l.getId() + " " + l.getIzena());

		}

	}

	public void irakurri() {

		try {

			FileReader fr = new FileReader("./src/businesslogic/" + izena);

			BufferedReader br = new BufferedReader(fr);

			zerrenda = new ArrayList();

			br.readLine();

			do {

				String lerroa = br.readLine();

				if (lerroa == null)

					break;

				// IO.println(lerroa);

				String[] tokenak = lerroa.split("\t");

				Langilea2 l = new Langilea2();

				l.setId(tokenak[0]);

				l.setIzena(tokenak[1]);

				zerrenda.add(l);
				
				

			} while (true);

			br.close();

			fr.close();

		} catch (Exception e) {

			IO.println(e.toString());

		}

	}

	private Langilea2 KapsulatuDatuak (String[] tokenak){
		Langilea2 l = new langilea2();
		l.setId(izena);
	}
	
	
	public static void main(String[] args) {

		Fitxategia f = new Fitxategia();

		f.setIzena("langileak.txt");

		f.irakurri();

		f.inprimatu();

	}

}
*/