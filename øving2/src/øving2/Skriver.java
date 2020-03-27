package øving2;

import java.util.concurrent.Semaphore;

//Klasse som henter neste navn fra tabellen og skriver det til Person
public class Skriver implements Runnable {
	private Semaphore sem;
	private Person p;
	private NamePool navn;
	
	public Skriver(Person p, NamePool navn) {
		sem = new Semaphore(3, true);
		this.p = p;
		this.navn = navn;
	}

	@Override
	//synchronized 
	public void run() {
		try {
			sem.acquire();
			for (int i = 0; i < navn.getLength(); i++) {
 				p.setNavn(navn.getNavn(i));
				System.out.println("Skriver " + p.getNavn() + " til person");
				if (i == navn.getSisteNavnIndeks() ) {
					i = -1;
				}
				Thread.sleep(1000);
			}
			sem.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}
