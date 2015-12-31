package ch5p7SyncThread;

public class SaleByRunnable implements Runnable{
	private int tickets = 100;
	Object lock = new Object();//同步代码块的所对象可以是任意类型，但是不可以在
	//							run代码块内新建对象，这样每一个线程都会有一个锁，就起不到作用了
	/*public void run(){
		synchronized(lock){   //同步代码块
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
	}*/
	public void run(){
		while(true){
			syncTicket();
			if(this.tickets <=0) break;
		}
	}
	
	private synchronized void syncTicket(){
		try{
			Thread.sleep(200);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"---"+this.tickets--);
	}
}
