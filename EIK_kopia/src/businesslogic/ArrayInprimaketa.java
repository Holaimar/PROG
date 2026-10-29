package businesslogic;

public class ArrayInprimaketa {

	public ArrayInprimaketa() {

	}

	public void inprimatu(String[] datuak) {
		for (Integer i = 0; i < datuak.length; i += 2)
			IO.println(datuak[i]);
		
		for (Integer i = 0; i < datuak.length / 2; ++i)
			IO.println(datuak[i * 2]);
		
		Integer i = 0;
		for (String izena : datuak)
			if (i % 2 == 0)
				IO.println(izena);
		++i;
	}

	public static void main(String[] args) {
		ArrayInprimaketa ai = new ArrayInprimaketa();
		String[] izenak = { "Victor", "Irune", "Zunbeltz", "Eder" };
		ai.inprimatu(izenak);
	}

}
