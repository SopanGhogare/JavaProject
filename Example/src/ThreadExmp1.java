
public class ThreadExmp1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			/*synchronized (this) {
		System.out.print("B");
		try {
			wait(1000);
			notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}*/
			
			try {
				System.out.print("B");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
