package instance;

public class Hero extends Character {
	
	public void attack() {
		System.out.println(getName() + "の攻撃！");
		System.out.println(getAt() + "のダメージ");
	}
	
	public void defence() {
		System.out.println("勇者は防御の姿勢をとった");
		setDf(getDf() + 10);
		System.out.println("防御力が10upし、" + getDf() + "になった");
	}
	
	public void heal() {
		System.out.println("勇者は休憩した");
		setHp(getHp() + 10);
		System.out.println(getName() + "はHPが10回復し、" + getHp() + "になった");
	}
	

}
