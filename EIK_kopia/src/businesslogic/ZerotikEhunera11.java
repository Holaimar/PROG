package businesslogic;

import java.util.Random;

public class ZerotikEhunera11 {
	public ZerotikEhunera11() {
		int[] zenbakiak = new int[5];

		for (int i = 0; i < zenbakiak.length; i++) {
			zenbakiak[i] = new Random().nextInt(100) + 1;
		}

		IO.println("Zenbakiak 1-100");
		for (int i = 0; i < zenbakiak.length; i++) {
			IO.println(zenbakiak[i]);
			;
		}
	}

	public static void main(String[] args) {
		new ZerotikEhunera11();

	}
}
