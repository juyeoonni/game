package game;

public class Hero {
	// field variable 
	// global variable
	// member variable (멤버변수)
	// property
	String name;
	int hp;
	
	void attack() {}
	void run() {}
	void sit() {}
	void slip() {}
	void sleep() {
		hp = 100;
		System.out.println(name + "는 잠을 자고 회복했다!");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}
