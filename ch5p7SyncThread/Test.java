package ch5p7SyncThread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*new SaleByThread().start();
		new SaleByThread().start();
		new SaleByThread().start();
		new SaleByThread().start();*/
		SaleByRunnable temp = new SaleByRunnable();
		Thread t1 = new Thread(temp, "窗口１");
		
		t1.setPriority(1);
		t1.start();
		Thread t2 = new Thread(temp, "窗口2");t2.setPriority(10);
		Thread t3 = new Thread(temp, "窗口3");
		t2.start();
		t3.start();
		new Thread(temp, "窗口4").start();
		
	}

}
