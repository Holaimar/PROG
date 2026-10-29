package businesslogic;

public class Ariketa3 {

	private Integer[] zerrenda;

	public void ZenbakiOsoenZerrenda() {
		sortuZerrenda();
		zerrendaBete();
		inprimatuZerrenda();
	}

	public Integer[] getZerrenda() {
		return zerrenda;
	}

	private void sortuZerrenda() {
		zerrenda = new Integer[5];
	}

	private void zerrendaBete() {
		zerrenda[0] = -4;
		zerrenda[1] = 7;
		zerrenda[2] = 108;
		zerrenda[3] = 5;
		zerrenda[4] = 0;
	}

	private void inprimatuZerrenda() {
		for (Integer i = 4; i < zerrenda.length; i--) {
			IO.println(zerrenda[i]);
		}
	}

	public static void main(String[] args) {
		Ariketa3 ej = new Ariketa3();
		ej.ZenbakiOsoenZerrenda();
	}
}
