package corejava;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(3);
		for (int index = 0; index < 3; index++) {
			new Thread(new WorkerThread(latch), "T" + index).start();
		}
		latch.await();
		System.out.println("Main is completed");
	}

}

class WorkerThread implements Runnable {

	private CountDownLatch latch;

	public WorkerThread(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running...");
		try {
			Thread.sleep(2 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		latch.countDown();
		System.out.println(Thread.currentThread().getName() + " is completed.");
	}

}
