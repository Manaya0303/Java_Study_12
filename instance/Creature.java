package instance;

public abstract class Creature {

	private int hp;
	private String name;
	private int at;
	private int df;
	
	public abstract void attack();
	public abstract void defence();
}
