package instance;

public class Magician extends Character {
	
	private int mp;
	private int m_at;
	
	public void attack() {
		System.out.println(getName() + "の攻撃！");
		System.out.println(getAt() + "のダメージ");
	}
	
	public void defence() {
		System.out.println(getName() + "は防御の姿勢をとった");
		setDf(getDf() + 10);
		System.out.println("防御力が10upし、" + getDf() + "になった");
	}
	
	public void attack_magic() {
		System.out.println(getName() + "の魔法攻撃！");
		this.mp = this.mp - 5;
		System.out.println(this.m_at + "のダメージ");
	}
	
	public void heal_magic() {
		System.out.println(getName() + "は回復魔法を唱えた！");
		this.mp = this.mp -5;
		setHp(getHp() + 50);
		System.out.println(getName() + "の体力が50回復した");
	}
	
	public void rest() {
		System.out.println(getName() + "は休憩した");
		this.mp = this.mp + 10;
		System.out.println(getName() + "は休憩し、MPが" + this.mp + "に回復した！");
	}
	
	public int getMp() {
		return this.mp;
	}
	
	public void setMp(int mp) {
		if(mp < 0) {
			mp = 0;
		}
		this.mp = mp;
	}
	
	public int getM_at() {
		return this.m_at;
	}
	
	public void setM_at(int m_at) {
		if(m_at < 0) {
			m_at = 0;
		}
		this.m_at = m_at;
	}
}
