package probak;

import businesslogic.ZenbakiOsoenZerrenda;

public class Erronka {
	
	public static void main(String[] args) {
		
		ZenbakiOsoenZerrenda zoz = new ZenbakiOsoenZerrenda();
		Integer[] jasotakoZerrenda = zoz.getZerrenda();
		
		jasotakoZerrenda[0] = 9;
		
		for (Integer i = 0; i < jasotakoZerrenda.length; ++i) {
			IO.println(jasotakoZerrenda);
		}
		
	}
	
}
