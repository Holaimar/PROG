package kontrolagailua;

import businesslogic.Karratua;
import businesslogic.Progresioa;
import businesslogic.Triangelua;
import businesslogic.Triangelua2;
import ikuspegia.Kontsola;

public class Kontrolagailua {

	public Kontrolagailua() {
		begiztaNagusia();
	}

	private void bostMultiploak() {
		Progresioa p;
		p = new Progresioa();
		p.bostMultiploakKalkulatu();
	}

	private void marraztuKarratua() {
		Karratua k = new Karratua();
		k.marrazketa(5, 5);
	}

	private void marraztuTriangelua() {
		Triangelua t = new Triangelua();
		t.marrazketa(4, 1);
	}

	private void marraztuTriangelua2() {
		Triangelua2 t2 = new Triangelua2();
		t2.marrazketa(4, 1);

	}

	private void begiztaNagusia() {
		String a = "";
		while (!a.equals("3")) {

			Menua m = new Menua();
			m.inprimatu();

			a = m.getAukera();

			if (a.equals("1")) {
				new Karratua().marrazketa(4, 4);
			} else if (a.equals("2")) {
				new Triangelua().marrazketa(5, 5);

			} else {
				IO.println("Zuzeneko zenbakia aukeratu");
			}

		}

	}

	public static void main(String[] args) {
		new Kontrolagailua();
	}
}
