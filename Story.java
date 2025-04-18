package instance;

public class Story {

	public static void main(String[] args) {
		
		Battle b = new Battle();
		
		Character[] c = new Character[3];
		c[0] = new Hero();
		c[1] = new SuperHero();
		c[2] = new SuperMagician();
		
		Creature[] m = new Creature[3];
		m[0] = new SuperMonster();
		m[1] = new Monster();
		m[2] = new Monster();
		
		for( Character ch : c) {
			ch.setHp(130);
			ch.setAt(30);
			ch.setDf(10);
		}
		
		c[0].setName("メルビン");
		c[1].setName("アルス");
		c[2].setName("マリベル");
		
		m[0].setName("オルゴデミーラ");
		m[1].setName("スライム");
		m[2].setName("ドラキー");
		
		m[0].setHp(150);
		m[1].setHp(50);
		m[1].setHp(40);
		
		for( Creature ch : m) {
			ch.setAt(40);
			ch.setDf(10);
		}
		
		b.battle(c, m);
		
	}
}
