package java_project;

import java.lang.Thread;
import java.lang.Runnable;
/**
 * 这是第一种创建多线程的方法　通过实现Runnable接口中的run函数
 * @author sws
 *
 */
/*
class NewThread implements Runnable{
	Thread t;
	NewThread(){
		//创建第二个新线程
		t = new Thread(this, "Demo THread");
		System.out.println("Child threaf: "+ t);
		t.start();
	}
	//第二个线程入口
	public void run(){
		try{
			for(int i = 5; i > 0; i --){
				System.out.println("Child THread: "+ i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e){
			System.out.println("child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}

public class Test{
	public static void main(String[] args){
		new NewThread();
		try{
			for(int i = 5; i > 0; i --){
				System.out.println("Main thread:" +i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e){
			System.out.println("Main interrupted.");
		}
		System.out.println("Main exist thread.");
	}
}*/

/*
*通过继承Thread类来创建多线程的方法
*/

class NewThread extends Thread{
	
	NewThread(){
		super("Demo THread");
	System.out.println("Child thread:" +this);
	start(); //开始线程
	}
	//第二个线程入口
	public void run(){
		try{
			for(int i = 5; i > 0; -- i){
				System.out.println("Child THread: "+ i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e){
			System.out.println("child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
public class Test{
	public static void main(String[] args){
		new NewThread();
		try{
			for(int i = 5; i > 0; -- i){
				System.out.println("Main thread:" +i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e){
			System.out.println("Main interrupted.");
		}
		System.out.println("Main exist thread.");
	}
}