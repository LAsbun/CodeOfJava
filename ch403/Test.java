package ch403;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player();
		try{
			p1.play(11);
		}
		catch(NoThisSongException e){
			System.out.println(e.getMessage());
		}
	}

}
