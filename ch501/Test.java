package ch501;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MyThread("线程1");
		Thread t2 = new MyThread("线程2");
		t1.start(); 
		t2.start();
	}

}

class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	public void run(){
		for(int i = 0; i < 100; ++ i)
			System.out.println(Thread.currentThread().getName()+" is running...");
	}
}
