package ch5p3BackgroundThread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackgroundThrad temp = new BackgroundThrad();
		Thread t1 = new Thread(temp,"后台线程");
		System.out.println(t1.getName()+" is background thread ?"+t1.isDaemon());
		t1.setDaemon(true);  //将当前线程设置为后台线程
		t1.start();
		for(int i = 0; i < 10; ++ i){
			System.out.println(i+" ");
		}
		System.out.println(t1.getName()+" is background thread ?"+t1.isDaemon());
	}

}

class BackgroundThrad implements Runnable{
	public void run(){
		while(true){
			System.out.println("后台进程------");
		}
	}
}
