package java_project;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable hello = new MulRunnable("Hello");
		Thread th1 = new Thread(hello);
		th1.setDaemon(true);
		th1.setName("Hello");
		System.out.println("Starting hello thread..");
		th1.start();
		
		Runnable bye = new MulRunnable("goodbye");
		Thread th2 = new Thread(bye);
		th2.setPriority(Thread.MIN_PRIORITY);
		th2.setDaemon(true);
		System.out.println("Starting goodbye thread..");
		th2.start();
		
		
		System.out.println("Starting thread 3...");
		Thread th3 = new MulThread(5);
		th3.start();
		try{
			th3.join();
		}catch(InterruptedException e){
			System.out.println("Thread interrupted");
			
		}
		System.out.println("Start th4 ...");
		Thread th4 = new MulThread(2);
		th4.start();
		System.out.println("main() is ending...");
	}
}
