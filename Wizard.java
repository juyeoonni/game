package game;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("마법사의 MP는 0 이상이어야 한다. ");
		}
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.length() > 3) {
			throw new IllegalArgumentException("마법사나 지팡이의 이름은 null 일 수 없고, 반드시 3문자 이상이어야 한다");
		}
		this.name = name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		if (wand != null) {
			throw new IllegalArgumentException("마법사의 지팡이는 null 일 수 없다.");
		}
		this.wand = wand;
	}

	void heal(Hero hero) {
		int basePoint = 10; // 기본 회복 포인트
		int recovPoint = (int) (basePoint * wand.getPower()); // 지팡이에 의한 증폭
		hero.setHp(hero.getHp() + recovPoint); // 용사의 HP를 회복
	}

}
