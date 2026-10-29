package businesslogic;

import kontrolagailua.Teklatua;

public class Ariketa11 {

	public static void main(String[] args) {
		
		Integer[] balioak = {1, 3, 10, 25000, -2000, 4, 2};
		
		Integer handiena = balioak[0]; 
		Integer txikiena = balioak[0];

		for (int i = 0; i < balioak.length; ++i) {
			
			if (balioak[i] > handiena) 
				handiena = balioak[i];
			
			
			if (balioak[i] < txikiena) 
				txikiena = balioak[i];
			
			
		}
		
		
		IO.println("Zenbaki handiena: " + handiena);
		IO.println("Zenbaki txikiena: " + txikiena);
	}
}