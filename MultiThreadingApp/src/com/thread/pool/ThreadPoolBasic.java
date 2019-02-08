package com.thread.pool;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class Runner extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + " " + i);
		}
	}
}
class CallableRunner implements Callable<Integer> {
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
public class ThreadPoolBasic {
	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(3);
		Runner r1 = new Runner();
		r1.setName("First Thread");
		Runner r2 = new Runner();
		r2.setName("Second Thread");
		Runner r3 = new Runner();
		r3.setName("Third Thread");
		es.execute(r1);
		es.execute(r2);
		es.execute(r3);
		CallableRunner cr = new CallableRunner();
		Future<Integer> future = es.submit(cr);
		System.out.println(future.get());
		es.shutdown();
	}

}
