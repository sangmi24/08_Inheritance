package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {
		
		//��ü ���� �׽�Ʈ
		Car c = new Car("��Ʋ��", 12.5 ,"����",4 );
		Ship s = new Ship("�������̹�",3,"�",1 );
		Airplane a = new Airplane("����774",0.02, "������",16 ,5 );
        
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		c.howToMove();  // ������ ������ �����δ�.
		s.howToMove();  // �����緯�� �������鼭 �����δ�.
		a.howToMove();  // ������ ���� �޸��ٰ� ������ �������鼭 �����δ�.
		
		
		
	}

}
