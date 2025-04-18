package instance;

public class Battle {
	
	public void battle(Character c[],Creature m[]) {
	ChkHp chk = new ChkHp();
		
		if (m[0] instanceof SuperMonster) {
			SuperMonster bossm = (SuperMonster) m[0];
			bossm.setP_at(10);
			bossm.attack();
			c[0].setHp(c[0].getHp() - bossm.getAt() - bossm.getP_at());
			System.out.println(c[0].getName() + "のHPが" + c[0].getHp() + "になった");
			chk.chkhp(c[0].getHp(), c[0].getName());
			System.out.println();
		}else {
			throw new IllegalArgumentException("キャストに失敗しました");
		}
		
		if (c[1] instanceof SuperHero) {
			SuperHero als = (SuperHero) c[1];
			als.attack();
			m[1].setHp(m[1].getHp() - als.getAt() * 2);
			System.out.println(m[1].getName() + "のHPが" + m[1].getHp() + "になった");
			chk.chkhp(m[1].getHp(), m[1].getName());
			System.out.println();
		}else {
			throw new IllegalArgumentException("キャストに失敗しました");
		}
		
		if(c[2] instanceof SuperMagician) {
			SuperMagician w = (SuperMagician) c[2];
			w.setM_at(30);
			w.attack_magic();
			m[2].setHp(m[2].getHp() - w.getM_at() * 2);
			System.out.println(m[2].getName() + "のHPが" + m[2].getHp() + "になった");
			chk.chkhp(m[2].getHp(), m[2].getName());
			System.out.println();
		}else {
			throw new IllegalArgumentException("キャストに失敗しました");
		}
		
		if(c[0] instanceof Hero) {
			Hero mel = (Hero) c[0];
			mel.attack();
			m[0].setHp(m[0].getHp() - c[0].getAt());
			System.out.println(m[0].getName() + "のHPが" + m[0].getHp() + "になった");
			chk.chkhp(m[0].getHp(), m[0].getName());
			System.out.println();
		}else {
			throw new IllegalArgumentException("キャストに失敗しました");
		}
		
		if (m[0] instanceof SuperMonster) {
			SuperMonster bossm = (SuperMonster) m[0];
			bossm.setP_at(10);
			bossm.attack();
			c[0].setHp(c[0].getHp() - bossm.getAt() - bossm.getP_at());
			System.out.println(c[0].getName() + "のHPが" + c[0].getHp() + "になった");
			chk.chkhp(c[0].getHp(), c[0].getName());
			System.out.println();
		}else {
			throw new IllegalArgumentException("キャストに失敗しました");
		}
		
		if (c[1] instanceof SuperHero) {
			SuperHero als = (SuperHero) c[1];
			als.attack();
			m[0].setHp(m[0].getHp() - als.getAt() * 2);
			System.out.println(m[0].getName() + "のHPが" + m[0].getHp() + "になった");
			chk.chkhp(m[0].getHp(), m[0].getName());
			System.out.println();
		}else {
			throw new IllegalArgumentException("キャストに失敗しました");
		}
		
		if(c[2] instanceof SuperMagician) {
			SuperMagician w = (SuperMagician) c[2];
			w.setM_at(30);
			w.attack_magic();
			m[0].setHp(m[0].getHp() - w.getM_at() * 2);
			System.out.println(m[0].getName() + "のHPが" + m[0].getHp() + "になった");
			chk.chkhp(m[0].getHp(), m[0].getName());
			System.out.println();
		}else {
			throw new IllegalArgumentException("キャストに失敗しました");
		}
		
	}
}