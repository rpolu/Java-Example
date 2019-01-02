package com.thread.byextendsThread;
class Runner extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ExtendsThread {

	public static void main(String[] args) {
		Runner r1 = new Runner();
		r1.start();
		Runner r2 = new Runner();
		r2.start();
	}
}
