package ch5p4YieldThread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new YieldThread("线程１");
		Thread t2 = new YieldThread("线程２");
		t1.start();
		t2.start();
	}

}

class YieldThread extends Thread{
	public YieldThread(String name){
		super(name);
	}
	public void run(){
		for(int i = 0; i < 6; ++ i){
			System.out.println(Thread.currentThread().getName()+"----"+i);
			if(i == 3){
				System.out.println("线程让步.");
				Thread.yield();  //线程让步
			}
		}
	}
}