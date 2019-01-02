package com.thread.volatiletest;

import java.util.Scanner;

class Runner extends Thread {
	private volatile boolean running = true;

	public void run() {
		while (running) {
			System.out.println(" Running ");
		}
	}

	public void stopRun() {
		System.out.println();
		running = false;
	}
}

public class VolatileTest {

	public static void main(String[] args) {
		System.out.println("Please eneter return to stop");
		Runner r1 = new Runner();
		r1.start();

		Scanner s = new Scanner(System.in);
		s.nextLine();
		r1.stopRun();
		s.close();

	}

}
