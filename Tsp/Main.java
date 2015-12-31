package Tsp;

import java.util.Calendar;

public class Main{
	
	public static void main(String[] args){
		Calendar a = Calendar.getInstance();
		Test tsp = new Test();
		tsp.run();
		Calendar b = Calendar.getInstance();
		tsp.CalTime(a, b);
	}
	/**
	 * 程序入口
	 */
	
}
