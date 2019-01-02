package com.thread.synchronization;

class Theater {
	private String thName = "Vinayaka Theater";
	private String movieName = "Simha Balayya";
	private int totalTicket = 5;

	public void bookTickets(int reqTickets, String name) {
		System.out.println(name + " Welcome to Book my shhow .");
		System.out.println(name + " Your are booking the tickets for :" + movieName + " in " + thName + " thater");
		synchronized (this) {

			if (totalTicket >= reqTickets) {
				System.out.println(reqTickets + " Tickets booked success and Enjoy the movie.");
				totalTicket = totalTicket - reqTickets;
			} else {
				System.out.println(name + " House fulll. Please try in next show.");
			}
		}
	}
}

class ThreadOne implements Runnable {
	private Theater th;
	private String personName;

	public ThreadOne(Theater th, String personName) {
		this.th = th;
		this.personName = personName;
	}

	public void run() {
		System.out.println(personName + " Came Booking the Tockets");
		th.bookTickets(5, personName);
	}
}

class ThreadTwo implements Runnable {
	private Theater th;
	private String personName;

	public ThreadTwo(Theater th, String personName) {
		this.th = th;
		this.personName = personName;
	}

	public void run() {
		System.out.println(personName + " Came Booking the Tockets");
		th.bookTickets(5, personName);
	}
}

public class SynchronizationBlockApp {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Theater th = new Theater();
		ThreadOne t1 = new ThreadOne(th, "Ramu");
		ThreadTwo t2 = new ThreadTwo(th, "Bramha");
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken : " + (end - start));
	}

}
