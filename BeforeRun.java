package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		
		// Desktop ��ü
		//brand,pCode,pName,price,allInOne
		Desktop d = new Desktop("�Ｚ","d-01","¯¯����ũž",2000000,true);
		
		// Tv ��ü
		//brand,pCode,pName,price,inch
		Tv t = new Tv("����","t-01","����޺�����Ƽ��",3000000,60);
		
		// SmartPhone ��ü
		//brand,pCode,pName,price,mobileAgency
		SmartPhone s = new SmartPhone("����","s-01","������",1000000,"SKT");
		
		//���
//		System.out.println(d);  
//		System.out.println(t);
//		System.out.println(s);
		//������ �ּҰ��� ���
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		/*
		 *  �� Ŭ�������� �ߺ��� �ڵ���� �����ϴ� ��Ȳ
		 *  => �ڵ带 ������ ����ϴ� �������� �Ǽ��� �Ͼ�� ����
		 *  => ������ ���� �������� �� �Ź�  ������ ã�Ƽ� �����ؾ� �ϴ� ���ŷο��� ����
		 *  
		 *  ����̶�� ������ ������Ѽ�
		 *  �� Ŭ�������� �ߺ��� �ʵ�,�޼ҵ���� �� �ѹ� �� �ϳ��� Ŭ������ ��� ����(�θ�)�ص� �Ŀ�
		 *  �ش� Ŭ������ ������ ����(�ڽ�) ������� ����
		 *  
		 *  ���
		 *  �� Ŭ�������� �ߺ��� �ʵ�, �޼ҵ���� �ϳ��� Ŭ����(�θ�) �� �����ص� �Ŀ�
		 *  �ٸ� Ŭ����(�ڽ�)���� �ش� �θ� Ŭ������ ������� ������ ���� ����
		 *  
		 */
		

	}

}








