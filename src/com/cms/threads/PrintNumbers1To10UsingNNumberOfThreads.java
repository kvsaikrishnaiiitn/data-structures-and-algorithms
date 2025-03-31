package com.cms.threads;

public class PrintNumbers1To10UsingNNumberOfThreads {

	public static void main(String[] args) {
		Object lock = new Object();
		int totalNumberOfThreads = 3;
		Thread[] threads = new Thread[totalNumberOfThreads];
		for (int threadId = 0; threadId < totalNumberOfThreads; threadId++) {
			threads[threadId] = new Thread(new PrintNumberThread(lock, threadId, totalNumberOfThreads),
					"Thread" + threadId);
			threads[threadId].start();
		}

		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main completed.");
	}

}

class PrintNumberThread implements Runnable {

	private Object lock;
	private int threadId;
	private int totalNumberOfThreads;
	private static int number = 1;

	public PrintNumberThread(Object lock, int threadId, int totalNumberOfThreads) {
		this.lock = lock;
		this.threadId = threadId;
		this.totalNumberOfThreads = totalNumberOfThreads;
	}

	@Override
	public void run() {
		while (number <= 10) {
			synchronized (lock) {
				if (number % totalNumberOfThreads == threadId) {
					System.out.println(Thread.currentThread().getName() + " printing number:" + number);
					number++;
					lock.notifyAll();
				} else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}