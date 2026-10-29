package businesslogic;

public class Flag {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		Integer[] balioak = { 0, 1, 2, 3, 5, 7, 10, 80, 2, 2 };
		IO.println("Bilatzeko balioa: ");
		Integer balioa = sc.nextInt();

		Boolean aurkitua = false;
		int posizioa = 0;

		for (Integer i = 0; i < balioak.length; ++i) {

			if (balioak[i].equals(balioa)) {
				aurkitua = true;
				posizioa = i;
				break;
			}
		}

		if (aurkitua)
			IO.println("Elementua aurkitu da " + (posizioa + 1) + ". posizioan");
		else
			IO.println("Elementua ez da aurkitua izan")

		sc.close();
	}

}
