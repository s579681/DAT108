package øving2;

import java.util.concurrent.Semaphore;

//Klasse som leser fra Person og printer til System.out
public class Leser implements Runnable{
	private Semaphore sem;
	private Person p;
	private NamePool navn;

	public Leser(Person p, NamePool navn) {
		sem = new Semaphore(3, true);
		this.p = p;
		this.navn = navn;
	}

	@Override
	//Synchronized
	public void run() {
		try {
			sem.acquire();
			for (int i = 0; i < navn.getLength(); i++) {
				System.out.println("Leser " + p.getNavn() + " fra Person");
				if (i == navn.getLength()) {
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