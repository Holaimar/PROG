package businesslogic;

public class BakoitiBikoiti {

	private Integer[] zerrenda;

	public BakoitiBikoiti() {
		sortuZerrenda();
		zerrendaBete();
	}

	public Integer[] getZerrenda() {
		return zerrenda;
	}

	private void sortuZerrenda() {
		zerrenda = new Integer[10];
	}

	private void zerrendaBete() {
		zerrenda[0] = 1;
		zerrenda[1] = 3;
		zerrenda[2] = 50;
		zerrenda[3] = 5;
		zerrenda[4] = 0;
		zerrenda[5] = 4;
		zerrenda[6] = 33;
		zerrenda[7] = 25;
		zerrenda[8] = 34;
		zerrenda[9] = 2;
	}

	public void erakutsiBakoitiBikoiti() {
		for (Integer zenbakia : zerrenda) {
			if (zenbakia % 2 == 0) {
				System.out.println(zenbakia + " -> bikoiti");
			} else {
				System.out.println(zenbakia + " -> bakoit");
			}
		}
	}

	public static void main(String[] args) {
		BakoitiBikoiti objeto = new BakoitiBikoiti();
		objeto.erakutsiBakoitiBikoiti();
	}
}
