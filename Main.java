package game;

import javaDay8.*;

public class Main {

	public static void main(String[] args) {
		// 가상 세계에 용사 생성
		Hero hero = new Hero();
		
		// 생성된 용사에게 최초의 HP와 이름을 설정
		hero.name = "주연";
		hero.hp = 100;
		System.out.println("용사 " + hero.name + "을 생성했습니다!");
		
		// 용사에게 5초 앉기, 넘어지기, 25초 않기, 도망등 지시 
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
