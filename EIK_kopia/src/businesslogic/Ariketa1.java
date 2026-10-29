package businesslogic;

import kontrolagailua.Teklatua;

public class Ariketa1 {

	public static void main(String[] args) {

		Integer[] balioak;
		balioak = new Integer[5];

		for (Integer i = 0; i < 5; ++i)
			balioak[i] = Integer.valueOf(Teklatua.irakurri());

		for (Integer datua : balioak)
			IO.println(datua);

		
		int gehiketa = 0;
		for (Integer datua : balioak) {
			gehiketa += datua;
		}

		double batazbestekoa = (double) gehiketa / balioak.length;

		IO.println("Batez bestekoa: " + batazbestekoa);

		
		// Otra manera de array
		Integer[] balioak2 = { 3, 11, 15, 10000, -5 };

	}

}

//	-------------

//		int balioa1;
//		int balioa2;
//		int balioa3;
//		int balioa4;
//		int balioa5;
//		
//		balioa1 = 1;
//		balioa2 = 6;
//		balioa3 = 7;
//		balioa4 = 3;
//		balioa5 = 100;
//		
//		IO.println(balioa1);
//		IO.println(balioa2);
//		IO.println(balioa3);
//		IO.println(balioa4);
//		IO.println(balioa5);
