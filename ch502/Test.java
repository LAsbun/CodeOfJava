package ch502;

public class Test {
	public static void main(String[] args){
		Thread t1 = new Thread(new MyThread());
		for(int i = 0; i < 100; ++ i)
			System.out.println(Thread.currentThread().getName()+" is running..");
		t1.start();
		
	}
}

class MyThread implements Runnable{
	public void run(){
		for(int i = 0; i < 50; ++ i){
			System.out.println(Thread.currentThread().getName()+" is running..");
		}
	}
}
