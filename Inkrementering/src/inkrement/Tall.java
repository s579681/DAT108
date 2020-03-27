package inkrement;

import java.util.concurrent.Semaphore;

public class Tall {
	private Semaphore sem;
	private int verdi;
	
	public Tall(int verdi) {
		this.verdi = verdi;
		sem = new Semaphore(1); 
		
	}

	//Synchronized her
	public int inkrement() {
		try {
			sem.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		verdi++;
		sem.release();
		return verdi;
	}
	
	public String toString() {
		return "" + verdi; 
	}
	
}
