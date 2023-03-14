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
			throw new IllegalArgumentException("�������� MP�� 0 �̻��̾�� �Ѵ�. ");
		}
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.length() > 3) {
			throw new IllegalArgumentException("�����糪 �������� �̸��� null �� �� ����, �ݵ�� 3���� �̻��̾�� �Ѵ�");
		}
		this.name = name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		if (wand != null) {
			throw new IllegalArgumentException("�������� �����̴� null �� �� ����.");
		}
		this.wand = wand;
	}

	void heal(Hero hero) {
		int basePoint = 10; // �⺻ ȸ�� ����Ʈ
		int recovPoint = (int) (basePoint * wand.getPower()); // �����̿� ���� ����
		hero.setHp(hero.getHp() + recovPoint); // ����� HP�� ȸ��
	}

}
