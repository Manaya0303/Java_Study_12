package instance;

public class Monster extends Creature{
	
	public void attack() {
		System.out.println(getName() + "の攻撃！");
		System.out.println(getAt() + "のダメージ");
	}
	
	public void defence() {
		System.out.println(getName() + "は守りを固めた！");
		setDf(getDf() + 10);
		System.out.println("防御力が10上がった");

	}
	
	
}
