package java_project;

import java.lang.Thread.*;
import java.lang.Thread.State;

public class MulThread extends Thread{
	private int number;
	public MulThread(int number){
		this.number = number;
	}
	public void run(){
		int count = 0;
		int guess = 0;
		do{
			guess = (int)(Math.random()*100 +1);
			System.out.println(this.getName()
					+" guess "+ guess);
			count++;
			try{
				Thread.sleep(5);
			} catch(InterruptedException e){
				System.out.println(this.number+" 被打断了");
			}
			System.out.println(this.number+" 的状态");
			//System.out.println(Thread.State.getState());
		}while(guess != number);
		System.out.println("Correct!"+this.getName()+" "
				+count);
	}
}