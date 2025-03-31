package com.cms.threads;

public class PrintNumbers1To10UsingOddEvenPattern {

	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		Thread oddThread = new Thread(new OddEvenThread(lock, true), "OddThread");
		Thread evenThread = new Thread(new OddEvenThread(lock, false), "EvenThread");

		oddThread.start();
		evenThread.start();

		oddThread.join();
		evenThread.join();

		System.out.println("PrintNumbers1To10UsingOddEvenPattern.main()...main completed!");
	}

}

class OddEvenThread implements Runnable {
	private Object lock;
	private static int number = 1;
	private boolean isOdd = false;

	public OddEvenThread(Object lock, boolean isOdd) {
		this.lock = lock;
		this.isOdd = isOdd;
	}

	@Override
	public void run() {
		while (number <= 10) {
			synchronized (lock) {
				if ((isOdd && number % 2 == 1) || (!isOdd && number % 2 == 0)) {
					System.out.println(Thread.currentThread().getName() + " printing number:" + number);
					number++;
					lock.notifyAll();
				} else {
					System.out.println(Thread.currentThread().getName() + " is waiting for lock...");
					try {
						lock.wait();
						System.out.println(Thread.currentThread().getName() + " got lock.");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
