package businesslogic;

import java.util.Scanner;

public class BatazBestekoa {
	
	public Integer[] zerrenda;
	
	public BatazBestekoa() {
		
	}
	
	private void SortuZerrenda() {
		zerrenda = new Integer[5];
	}
	
	private void zenbakiakIrakurri() {
		Scanner sc = new Scanner(System.in);
		for (Integer i = 0; i < zerrenda.length; ++i) {
			IO.println(zerrenda[i]);
		}
	}
		

	public static void main(String[] args) {
		new BatazBestekoa();

	}

}
