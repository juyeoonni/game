package game;

import javaDay8.*;

public class Main {

	public static void main(String[] args) {
		// ���� ���迡 ��� ����
		Hero hero = new Hero();
		
		// ������ ��翡�� ������ HP�� �̸��� ����
		hero.name = "�ֿ�";
		hero.hp = 100;
		System.out.println("��� " + hero.name + "�� �����߽��ϴ�!");
		
		// ��翡�� 5�� �ɱ�, �Ѿ�����, 25�� �ʱ�, ������ ���� 
		hero.sit();		
		hero.slip();		
		hero.sit();		
		hero.run();		
		
		
		Kinoko kinoko1 = new Kinoko();
		kinoko1.hp = 50;
		kinoko1.suffix = 'A';
		
		Kinoko kinoko2 = new Kinoko();
		kinoko2.hp = 48;
		kinoko2.suffix = 'B';
		
		hero.slip();
		kinoko1.run();
		kinoko2.run();
		hero.run();
		
			
		
	}

}
