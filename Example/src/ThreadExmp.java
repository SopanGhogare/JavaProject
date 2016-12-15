public class ThreadExmp implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			/*synchronized (this) {
				System.out.print("A");	
				try {
					wait(1000);
					notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
			try {
				System.out.print("A");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
	}
	
	public static void main(String[] args) {
		
		Thread t1= new Thread(new ThreadExmp());
		t1.start();
		Thread t2= new Thread(new ThreadExmp1());
		t2.start();
		Thread t3= new Thread(new ThreadExmp2());
		t3.start();
	}
	
	

}
