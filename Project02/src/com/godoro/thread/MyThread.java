package com.godoro.thread;

public class MyThread extends Thread {
	public void run()
	{
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
