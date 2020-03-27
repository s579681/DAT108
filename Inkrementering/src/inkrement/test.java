package inkrement;

public class test {

	public static void main(String[] args) {
		Tall t = new Tall(0);
		
		Thread t1 = new Thread(new Inkrementer(t));
		Thread t2 = new Thread(new Inkrementer(t));
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
