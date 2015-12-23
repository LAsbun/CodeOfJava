package ch5p2Runnable_differ_Thread;

public class SaleByRunnable implements Runnable{
	private int tickets = 100;
	public void run(){
		while(tickets>0){
				Thread th = Thread.currentThread(); //获取当前进程
				String th_name = th.getName();
				System.out.println(th_name+" 正在售出第 "+this.tickets--+"票");
			}
	}
}
