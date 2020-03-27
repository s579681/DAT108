package øving2;

public class NamePool {
	private StringBuffer[] tab;
	private int sisteNavnIndeks = 9;
	
	private static final int LENGTH = 10;
	
	public NamePool() {
		tab = new StringBuffer[LENGTH];
		StringBuffer n0 = new StringBuffer("Eirik");
		StringBuffer n1 = new StringBuffer("Stian");
		StringBuffer n2 = new StringBuffer("Miguel");
		StringBuffer n3 = new StringBuffer("Pablo");
		StringBuffer n4 = new StringBuffer("Doffer");
		StringBuffer n5 = new StringBuffer("Ole");
		StringBuffer n6 = new StringBuffer("Chris");
		StringBuffer n7 = new StringBuffer("Per");
		StringBuffer n8 = new StringBuffer("Hans");
		StringBuffer n9 = new StringBuffer("Martin");
		tab[0] = n0;
		tab[1] = n1;
		tab[2] = n2;
		tab[3] = n3;
		tab[4] = n4;
		tab[5] = n5;
		tab[6] = n6;
		tab[7] = n7;
		tab[8] = n8;
		tab[9] = n9;
	}
	
	public StringBuffer getNavn(int i) {
		return tab[i];
	}
	
	public int getLength() {
		return LENGTH;
	}
	
	public int getSisteNavnIndeks() {
		return sisteNavnIndeks;
	}

}
