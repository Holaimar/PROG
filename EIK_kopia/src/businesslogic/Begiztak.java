package businesslogic;

public class Begiztak {

	public void egikaritu() {

		for (Integer n = 0; n < 10; ++n)
			for (Integer m = 0; m < 10; ++m)
				IO.println(n + " x " + m + " = " + n * m);

		IO.println("---");

	}

	public void bitartean() {
		// 0..n egitura
		Integer i = 0;
		while (i < 10)
			IO.print(i++);

		// 1..n egitura
		i = 0;
		do {
			IO.print(i++);
		} while (1 < 10);

	}

	public static void main(String[] args) {
		new Begiztak().bitartean();
	}

}
