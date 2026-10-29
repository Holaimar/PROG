package businesslogic;

public class ZenbakienBatura {
	
	public ZenbakienBatura() {
	}

	public void kalkulatu(Integer[] zenbakiak) {
		Integer batura = 0;

		for (Integer n = 0; zenbakiak.length; ++n)
			batura = batura + zenbakiak[n];
		IO.print(batura);

	}

	public static void main(String[] args) {
		Integer[] datuak = { 0, 1, 1, 2, 3, 5, 8, 13, 21 };

		ZenbakienBatura zb = new ZenbakienBatura();
		zb.kalkulatu(datuak);

	}
}
