package java_project;

import java.lang.Runnable;
import java.lang.Thread;

public class MulRunnable implements Runnable{
	private String message;
	public MulRunnable(String name){
		this.message = name;  
	}
	public void run(){
		while(true){
			System.out.println(message);
			try{
				Thread.sleep(5);
			} catch(InterruptedException e){
				System.out.println(this.message+" 被打断了");
			}
		}
	}
}
