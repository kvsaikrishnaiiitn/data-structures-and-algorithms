package com.cms.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

	public static void main(String[] args) {

		// CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

		CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> {
			System.out.println("Barrier is completed and running the required task...");
		});

		Worker worker1 = new Worker(cyclicBarrier);
		Worker worker2 = new Worker(cyclicBarrier);
		Worker worker3 = new Worker(cyclicBarrier);

		worker1.start();
		worker2.start();
		worker3.start();

		System.out.println("CyclicBarrierExample.main()...is completed!");

	}

	static class Worker extends Thread {
		private CyclicBarrier cyclicBarrier;

		public Worker(CyclicBarrier cyclicBarrier) {
			super();
			this.cyclicBarrier = cyclicBarrier;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is started...");
			// Some work
			try {
				Thread.sleep(1 * 1000);
				// Waiting for all other workers to come till the barrier
				cyclicBarrier.await();
				System.out.println(Thread.currentThread().getName() + " is completed.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}

		}
	}

}
