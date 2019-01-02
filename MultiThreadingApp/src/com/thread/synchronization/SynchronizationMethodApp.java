package com.thread.synchronization;

class SatyamTheater {
	private String thName = "Satyam";
	private String movieName = "Jai Balayya";
	private int totalTicket = 5;

	public synchronized void bookTickets(int reqTickets, String name) {
		System.out.println(name + " Welcome to Book my shhow .");
		System.out.println(name + " Your are booking the tickets for :" + movieName + " in " + thName + " thater");
		if (totalTicket >= reqTickets) {
			System.out.println(reqTickets + " Tickets booked success and Enjoy the movie.");
			totalTicket = totalTicket - reqTickets;
		} else {
			System.out.println(name + " House fulll. Please try in next show.");
		}
	}
}

class LokendraThread implements Runnable {
	private SatyamTheater th;
	private String personName;

	public LokendraThread(SatyamTheater th, String personName) {
		this.th = th;
		this.personName = personName;
	}

	public void run() {
		System.out.println(personName + " Came Booking the Tockets");
		th.bookTickets(5, personName);
	}
}

class RahmathThread implements Runnable {
	private SatyamTheater th;
	private String personName;

	public RahmathThread(SatyamTheater th, String personName) {
		this.th = th;
		this.personName = personName;
	}

	public void run() {
		System.out.println(personName + " Came Booking the Tockets");
		th.bookTickets(5, personName);
	}
}

public class SynchronizationMethodApp {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		SatyamTheater th = new SatyamTheater();
		LokendraThread t1 = new LokendraThread(th, "Lokendra");
		RahmathThread t2 = new RahmathThread(th, "Rahmath");
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
