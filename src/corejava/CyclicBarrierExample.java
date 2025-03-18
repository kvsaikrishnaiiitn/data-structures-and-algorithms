package corejava;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(3, () -> {
			System.out.println("Barrier reached.");
		});
		for (int index = 0; index < 3; index++) {
			new Thread(new WorkerThreadCB(barrier), "T" + index).start();
		}
		System.out.println("Main is completed.");
	}
}

class WorkerThreadCB implements Runnable {
	private CyclicBarrier barrier;

	public WorkerThreadCB(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running...");
		try {
			Thread.sleep(2 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " is completed.");
	}

}
