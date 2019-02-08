package com.server.interthred.communication;

class PrintNumbers {
	int num;
	boolean isOdd = true;
	public PrintNumbers(int num) {
		this.num = num;
	}
	void printOdds() {
		synchronized (this) {
			for (int i = 1; i <= 30; i = i + 2) {
				if (!isOdd) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(i);
				isOdd = false;
				notify();
			}
		}
	}
	void printEvens() {
		synchronized (this) {
			for (int i = 2; i <= 30; i = i + 2) {
				if (isOdd) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(i);
				isOdd = true;
				notify();
			}
		}
	}
}

class FirstThread extends Thread {
	PrintNumbers pn;

	FirstThread(PrintNumbers pn) {
		this.pn = pn;
	}

	public void run() {
		pn.printOdds();
	}

}

class SecondThread extends Thread {
	PrintNumbers pn;

	SecondThread(PrintNumbers pn) {
		this.pn = pn;
	}

	public void run() {
		pn.printEvens();
	}

}

public class InterThreadCommunication {
	public static void main(String[] args) {
		PrintNumbers r = new PrintNumbers(30);
		FirstThread t1 = new FirstThread(r);
		SecondThread t2 = new SecondThread(r);
		t1.start();
		t2.start();

	}
}
