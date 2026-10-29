package businesslogic.array;

import java.util.Arrays;

public class Arrayak {

	public void main(String[] args) {
		// 10 elementuko array bat
		// Double
		// inprimatu kontrolagailu FOR
		// FOR-EACH
		Double[] dd;
		dd = new Double[10];
		dd[0] = 1.0;
		dd[1] = Math.PI;
		dd[2] = Math.E;
		dd[3] = -5.3;
		dd[4] = 5e6;

		for (Integer i = 0; i < dd.length; ++i)
			IO.println(dd[i]);

		dd[0] = -1.0;

		for (Double balioa : dd)
			IO.println(balioa);

//		Arrays.short(dd);
		String balioak = Arrays.toString(dd);
//		IO.println(balioa);

	}

//	public static void main(String[] args) {
//		Integer balioa1;
//		Integer balioa2;
//		Integer balioa3;
//		Integer balioa4;
//		Integer balioa5;
//
//		balioa1 = 0;
//		balioa2 = 1;
//		balioa3 = 1;
//		balioa4 = 2;
//		balioa5 = 3;

//		IO.println(balioa1);
//		IO.println(balioa2);
//		IO.println(balioa3);
//		IO.println(balioa4);
//		IO.println(balioa5);

//		Integer[] balioak;
//		balioak = new Integer[5];
//		balioak[0] = 0;
//		balioak[1] = 1;
//		balioak[2] = 1;
//		balioak[3] = 2;
//		balioak[4] = 3;

//		Integer[] balioak2 = { 0, 1, 1, 2, 3 };

//		IO.println(balioak[0]);
//		IO.println(balioak[1]);

//		for (Integer n = 0; n < balioak.length; ++n)
//			IO.println(balioak[n]);

//		for (Integer n : balioak)
//			IO.println(n);

}

//}
