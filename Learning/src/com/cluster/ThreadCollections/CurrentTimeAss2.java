package com.cluster.ThreadCollections;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class CurrentTimeAss2 extends Thread {
//	public void run() {
//		System.out.println("thread is running...");
	/*
	 * for(int i = 0; i< 10; i++) { try { //sending the actual Thread of execution
	 * to sleep X milliseconds Thread.sleep(3000); } catch(InterruptedException ie)
	 * {} System.out.println("Hello world!"); }
	 */
	/*
	 * Timer t = new Timer(); t.schedule(new TimerTask() {
	 * 
	 * @Override public void run() { Date d = new Date(); SimpleDateFormat simpDate;
	 * simpDate = new SimpleDateFormat("kk:mm:ss");
	 * System.out.println(simpDate.format(d)); } }, 0, 2000);
	 */

	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentTimeAss2 obj = new CurrentTimeAss2();
		obj.start();

		Timer t = new Timer();
		

		t.schedule(new TimerTask() {
			@Override
			public void run() {
				Date d = new Date();
				SimpleDateFormat simpDate;
				simpDate = new SimpleDateFormat("kk:mm:ss");
				System.out.println(simpDate.format(d));
			}
		}, 0, 2000);

	}

}
