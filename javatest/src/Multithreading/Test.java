package Multithreading;

import java.util.concurrent.CountDownLatch;

public class Test {
	private static class MyThread implements Runnable {

		private CountDownLatch latch;
		private int id;
		
		public MyThread(CountDownLatch latch, int id) {
			this.latch = latch;
			this.id = id;
		}
		
		@Override
		public void run() {
			try {
				for (int i = 0; i < 10; i++ ) {
					System.out.println("id: " + id + " print " + i);
				}
				latch.countDown();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(10);
		
		for (int i = 1; i <= 10; i++) {
			new Thread(new MyThread(latch, i)).start();
		}
		
		latch.await();
		
		System.out.println("end");
		
	}
}
