package businesslogic;

public class Karratua {
	public void marrazketa(Integer aldea, Integer altuera) {

		for (Integer n = 0; n < altuera; ++n) {
			for (Integer m = 0; m < aldea; ++m) {
				IO.print("* ");
			}
			
			IO.println();
		}

	}
}