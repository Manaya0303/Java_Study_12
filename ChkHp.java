package instance;

public class ChkHp {
	public void chkhp(int hp ,String name) {
		if( hp <= 0) {
			System.out.println(name + "は倒れた！");
		}
	}
}
