package businesslogic;

import java.util.Arrays;

public class ArrayToArray14 {

	public static int[] konpiatuArraya(int[] zerrenda1) {

		int[] emaitza = new int[zerrenda1.length];

		for (int i = 0; i < zerrenda1.length; i++) {
			emaitza[i] = zerrenda1[i];
		}

		return emaitza;
	}

	public static void main(String[] args) {
		int[] array1 = { 2, 5, 7, 5 };

		int[] hirugarrena = konpiatuArraya(array1);

		System.out.println(Arrays.toString(hirugarrena));
	}

}
