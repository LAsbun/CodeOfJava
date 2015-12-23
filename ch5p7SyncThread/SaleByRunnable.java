package ch5p7SyncThread;

public class SaleByRunnable implements Runnable{
	private int tickets = 100;
	Object lock = new Object();
	public void run(){
		synchronized(lock){
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			while(tickets>0){
					Thread th = Thread.currentThread(); //获取当前进程
					String th_name = th.getName();
					System.out.println(th_name+" 正在售出第 "+this.tickets--+"票");
				}
		}
	}
}
