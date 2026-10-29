package businesslogic;

public class Triangelua {
	public void marrazketa(Integer altuera, Integer aldea) {

		for (Integer n = 0; n < altuera; ++n) {
			for (Integer m = 0; m < n + 1; ++m) {
				IO.print(" *");
			}
			
			IO.println();
		}

	}
}