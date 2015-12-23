package ch5p6JoinThread;

public class Test {
	
	public static void main(String[] args){
		Thread t = new Thread(new JoinThread(),"线程1");
		t.start();
		for(int i = 0; i < 10; ++ i){
			System.out.println(Thread.currentThread().getName()+" is runnning "+ i);
			if(i == 5){
				try{
					t.join();
				}
				catch (InterruptedException e){
					e.printStackTrace();
					//System.out.println(e.printStackTrace());
				}
			}
			try{
				t.join();
			}
			catch (InterruptedException e){
				e.printStackTrace();
				//System.out.println(e.printStackTrace());
			}
		}
	}
}

class JoinThread implements Runnable{
	public void run(){
		for(int i = 0; i < 10; ++ i){
			System.out.println(Thread.currentThread().getName()+"----"+i);
			if(i == 4){
				try{
					System.out.println("线程让步");
					Thread.sleep(2000);
				}
				catch (InterruptedException e){
					e.printStackTrace();
					//System.out.println(e.printStackTrace());
				}
			}
		}
	}
}
