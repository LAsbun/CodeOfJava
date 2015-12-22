package ch403;

public class Player {
	
	public void play(int index) throws NoThisSongException{  //抛出自定义异常
		if(index > 10){
			throw new NoThisSongException("您播放的歌曲不存在");
		}
	}
}
