package com.thred.byimplementsRunnable;

class Runner implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class ByImplementingRunnable {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner());
		t1.start();

		Thread t2 = new Thread(new Runner());
		t2.start();

	}

}
