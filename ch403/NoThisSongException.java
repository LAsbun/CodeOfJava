package ch403;

public class NoThisSongException extends Exception{
	public NoThisSongException(){ //调用父类的无参数构造函数
		super();
	}
	
	public NoThisSongException(String e){ //调用父类的有一个字符串参数的构造函数
		super(e);
	}
}
