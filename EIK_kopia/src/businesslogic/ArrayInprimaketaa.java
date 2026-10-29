package businesslogic;

import java.util.Random;

public class ArrayInprimaketaa {

	public ArrayInprimaketaa() {
		
	}
	
	public static void main(String[] args) {

		Random r = new Random();
		Integer[] zenbakiak = new Integer[100];
		
		for (Integer i = 0; i < zenbakiak.length; ++i)
			zenbakiak[i] = r.nextInt(10);
			
		IO.println(r.nextInt(10)+1);
		
		
		
	}

}
