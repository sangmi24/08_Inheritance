package com.hw3.run;

import com.hw3.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
        //�ʱⰪ�� �ο��� �� ���� ��ü ����(��뵥���� ����)
		Product[] pro = new Product[3];
		pro[0]=new Product("Samsung","Galaxy S9","Blue",960000);
		pro[1]=new Product("LG","G6","Red",820000);
		
		//1.�� ���� ���� ��� ó�� : toString() ���
		System.out.println("������ ù ��° ��ü�� ��: "+ pro[0]);
		System.out.println("������ �� ��° ��ü�� ��: "+ pro[1]);
		System.out.println("========================================");		
		
		//2.�� ���� ���� ��ġ�ϴ��� ��� ��� ó�� :equals()���
		System.out.println("������ �� ��ü�� ���� ������: "+ pro[0].equals(pro[1]) );
		System.out.println("========================================");
		
		//3.�� ���� �ؽ��ڵ尪 ��� : hashCode() ���
		System.out.println("ù ��° ��ü�� �ؽ��ڵ尪: "+pro[0].hashCode());
		System.out.println("�� ��° ��ü�� �ؽ��ڵ尪: "+pro[1].hashCode());
		System.out.println("========================================");
		
		//ù��° ��ü�� �ʵ� ���� ������ �� ��° ��ü ����
		pro[2] = pro[0];
		
		//4.�� ��° ��ü ���� ��� ó�� :toString()���
		System.out.println("�� ��° ��ü�� ��ü�� ��: "+pro[2] );
		System.out.println("========================================");
		//5.ù ��° ��ü�� �� ��° ��ü�� ������ ��� ->1.hashCode()����ؼ� ���
        //                                 2.equals()����ؼ� ���
		System.out.println("ù ��° ��ü�� �� ��° ��ü�� �ʵ尪���� ��ġ�ϴ°�: "+pro[0].equals(pro[2]));
		System.out.println("ù ��° ��ü�� �� ��° ��ü�� �ؽ��ڵ尪�� ��ġ�ϴ°�: "
		                    +( ( (int) ( pro[0].hashCode() ) ) == ( (int) (  pro[2].hashCode() ) )     ));
		                
		
		
		
	}

}
