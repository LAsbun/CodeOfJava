package ch5p2Runnable_differ_Thread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*new SaleByThread().start();
		new SaleByThread().start();
		new SaleByThread().start();
		new SaleByThread().start();*/
		SaleByRunnable temp = new SaleByRunnable();
		new Thread(temp, "窗口１").start();
		new Thread(temp, "窗口2").start();
		new Thread(temp, "窗口3").start();
		new Thread(temp, "窗口4").start();
	}

}
