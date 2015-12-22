package ch5p1_createthread;

public class Test {
	public static void main(String[] args){
		CreateThreadByExtendsThread c1 = new CreateThreadByExtendsThread();
		CreateThreadByImplementsRunnable temp = new CreateThreadByImplementsRunnable();
		Thread c2 = new Thread(temp);
		c1.start();
		c2.start();
		while(true){
			System.out.println("Main is runnning");
		}
	}
}
