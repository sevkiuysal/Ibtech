package com.godoro.thread;

public class MyLambdaTest {
	
	public static void main(String[] args) {
		Runnable runnable=new Runnable() {
			public void run()
			{
				walk();
			}
		};
		Thread thread=new Thread(runnable);
		thread.start();
		process();
	}

	private static void process() {
		while(true)
		{
			try {
				System.out.println("S�r�yor...");
				Thread.sleep(750);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void walk() {
		while(true)
		{
			try {
				System.out.println("Ko�uyor...");
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
