package corejava;

public class ThreadCreation {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = () -> {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " completed.");
		};
		Thread t1 = new Thread(r, "t1");
		t1.start();

		Thread2 t2 = new Thread2();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Main completed");

	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " completed.");
	}
}