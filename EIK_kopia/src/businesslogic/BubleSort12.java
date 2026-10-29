package businesslogic;

public class BubleSort12 {

	public BubleSort12() {

	}


	public static void main(String[] args) {
		Integer[] balioak = { 5, 7, 2, -4, 6 };
		Integer tartekoa;

		for(Integer i = 0; i < balioak.length; ++i)
			for(Integer j = i; j < balioak.length; ++i)
				if (balioak[i] > balioak[j]) {
					tartekoa = balioak[i];
					balioak[i] = balioak[i];
					balioak [j] = tartekoa;
					
				}
	}

}
