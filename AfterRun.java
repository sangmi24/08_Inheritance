package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		
		
		//����� �� �̷������ �׽�Ʈ
		Desktop d = new Desktop("�Ｚ","d-01","¯¯����ũž",2000000,true);
		System.out.println(d.information());

		SmartPhone s = new SmartPhone();
		s.setBrand("����");
		s.setpCode("s-01");
		s.setpName("������");
		s.setPrice(1000000);
		s.setmobileAgency("SKT");
		System.out.println(s.information());
		
		Tv t = new Tv("����","t-01","����޺�����TV",3000000,60);
		System.out.println(t.getBrand());
		System.out.println(t.getpCode());
		System.out.println(t.getpName());
		System.out.println(t.getPrice());
		System.out.println(t.getInch());
		System.out.println(t.information());
		// �����ϰ��� �ϴ� �޼ҵ尡 �ڽ�Ŭ������ ���ٸ� => �ڵ����� �θ�Ŭ������ �ִ� �޼ҵ�� ����
		// �����ϰ��� �ϴ� �޼ҵ尡 �ڽ�Ŭ������ �ִٸ�=> �ڽ�Ŭ������ �޼ҵ�� ����
		//=> �������ε� : �ڽ�Ŭ������ �ִ� �������̵� �� �޼ҵ尡 ���� �켱���� ������. 
		
		
		
		/*
		 *  *����� ����
		 *  - ���� ���� ���� �ڵ�� ���ο� Ŭ�������� ���� �����ϴ�.
		 *  - �ߺ��� �ڵ带 �θ� Ŭ�������� ���������� �����ϱ� ������
		 *    ���ο� �ڵ带 �߰��Ѵٰų�, ������ �ڵ带 �����ϴµ��� ����
		 *  => ���α׷��� ���꼺�� �����ش�. ������������ ũ�� �⿩�Ѵ�.
		 *  
		 *  *����� Ư¡
		 *  - Ŭ�������� ����� ���� ����� �Ұ����ϴ�. (���� ��Ӹ� ����)
		 *  - ��õǾ������� ������ �ڹٿ��� �����ϴ�, �Ǵ� ���� ���� ��� Ŭ������ Object ��� Ŭ������ �ļ��̴�.
		 *    /*extends Object */  //�̷��� �����Ǿ� ���� 
		 /*  => Object Ŭ������ �ִ� �޼ҵ带 �״�� ������ �� �� ����.
		 *   => Object Ŭ������ �ִ� �޼ҵ尡 ���� �ȵ�� �� �Ը���� �������̵��ؼ� �� ���� ����.
		 *  
		 *  
		 *  
		 */
		
		
	}

}






