package ch503;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1 = new MyThread();
		new Thread(m1, "老师1").start();
		new Thread(m1, "老师2").start();
		new Thread(m1, "老师3").start();
		
	}

}

class MyThread implements Runnable{
	private int ticket = 80;
	
	public synchronized void run(){
		while(true){
			//this.ticket--;
			//if(this.ticket <= 0) break;
			distribute();
			
		}
	}
	
	public synchronized void distribute(){
		try{
			Thread.sleep(0);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" is distributing No."+this.ticket--);
	}
}
