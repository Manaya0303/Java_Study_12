package instance;

public abstract class Character {
	
	private String name;	
	private int hp;			
	private int at;			
	private int df;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if(name == null || name.length() < 3 || name.length() > 10) {
			throw new IllegalArgumentException("名前が不正です。");
		}
		this.name = name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		if(hp < 0) {
			hp = 0;
		}
		this.hp = hp;
	}
	
	public int getAt() {
		return this.at;
	}
	
	public void setAt(int at) {
		if(at < 0) {
			at = 0;
		}
		this.at = at;
	}
	
	public int getDf() {
		return this.df;
	}
	
	public void setDf(int df) {
		if(df < 0) {
			df = 0;
		}
		this.df = df;
	}
	
	public abstract void attack();
	
	public abstract void defence();
}
