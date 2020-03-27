package øving2;

public class Lagtråder {

	public static void main(String[] args) throws InterruptedException {

		NamePool navn = new NamePool();
		Person p = new Person();
		
		Skriver S1 = new Skriver(p, navn);
		Skriver S2 = new Skriver(p, navn);
		Skriver S3 = new Skriver(p, navn);
		Thread ST1 = new Thread(S1);
		Thread ST2 = new Thread(S2);
		Thread ST3 = new Thread(S3);
				
		Leser L1 = new Leser(p, navn);
		Leser L2 = new Leser(p, navn);
		Leser L3 = new Leser(p, navn);
		Thread LT1 = new Thread(L1);
		Thread LT2 = new Thread(L1);
		Thread LT3 = new Thread(L1);
		
		ST1.start();
		ST2.start();
		ST3.start();
		
		LT1.start();
		LT2.start();
		LT3.start();
		
		
		
	}

}
