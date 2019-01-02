package com.thread.joining;

class Thread1 extends Thread {
	public void run() {
		for (int i = 1; i <= 30; i++) {
			System.out.println(i);
		}
	}

}

class Thread2 extends Thread {
	public void run() {
		for (int i = 30; i <= 60; i++) {
			System.out.println(i);
		}
	}

}

class Thread3 extends Thread {
	public void run() {
		for (int i = 60; i <= 90; i++) {
			System.out.println(i);
		}
	}

}

public class JoinThreadExample {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
