package ch5p1Createthread;

/*
 * 创建线程的第一种方式，继承Thread类，重写Thread类的run函数　调用的时候用.start()就可以了
 */

public class CreateThreadByExtendsThread extends Thread{ 
	public void run(){
		while(true)
		System.out.println("CreateThreadByExtendsThread is running.");
	}
}

