package com.cms.threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(3);
		Worker worker1 = new Worker(countDownLatch);
		Worker worker2 = new Worker(countDownLatch);
		Worker worker3 = new Worker(countDownLatch);

		worker1.start();
		worker2.start();
		worker3.start();

		// Waiting for all the workers to be completed
		countDownLatch.await();

		System.out.println("CountDownLatchExample.main()...is completed.");
	}
	
	static class Worker extends Thread {
		private CountDownLatch countDownLatch;

		public Worker(CountDownLatch countDownLatch) {
			super();
			this.countDownLatch = countDownLatch;
		}

		@Override
		public void run() {
			try {
				System.out.println(Thread.currentThread().getName() + " execution started...");
				// Some work
				Thread.sleep(1 * 1000);
				countDownLatch.countDown();
				System.out.println(Thread.currentThread().getName() + " execution is completed.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


