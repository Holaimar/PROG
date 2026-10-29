package businesslogic;

import java.util.Arrays;

public class HirugarrenArraya15 {

	public static int[] konbinatuArrayak(int[] zerrenda1, int[] zerrenda2) {

		int[] emaitza = new int[zerrenda1.length + zerrenda2.length];

		for (int i = 0; i < zerrenda1.length; i++) {
			emaitza[i] = zerrenda1[i];
		}

		for (int i = 0; i < zerrenda2.length; i++) {
			emaitza[zerrenda1.length + i] = zerrenda2[i];
		}

		return emaitza;
	}

	public static void main(String[] args) {
		int[] array1 = { 2, 5 };
		int[] array2 = { 1, 0, 1 };

		int[] hirugarrena = konbinatuArrayak(array1, array2);

		System.out.println(Arrays.toString(hirugarrena));
	}
}