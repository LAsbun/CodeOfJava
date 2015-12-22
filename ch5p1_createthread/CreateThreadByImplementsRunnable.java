package ch5p1_createthread;

/*
 * 这是利用实现接口Runnable里面的run函数　
 * 调用：在主函数中创建一个对应的类temp　然后再创建一个Thread类将temp作为函数传进去
 CreateThreadByImplementsRunnable temp = new CreateThreadByImplementsRunnable();
		Thread c2 = new Thread(temp);
 */

class CreateThreadByImplementsRunnable implements Runnable{
	
	public void run(){
		while(true){
			System.out.println("CreateThreadByImplementsRunnable in runnning.");
		}
	}
}
