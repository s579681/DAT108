package inkrement;

public class Inkrementer implements Runnable {
	private Tall teller;
	
	public Inkrementer(Tall teller) {
		this.teller = teller;
	}

	@Override
	public void run() {
		int i = 0;
		while (i < 5) {
			System.out.println(teller.inkrement());
			i++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
