package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		/*
		 * ��� Ŭ������ Object Ŭ������ �ļ��̴�. 
		 * ��, �ڹٿ��� �ֻ���Ŭ������ �׻� Object
		 * => Object �� �ִ� �޼ҵ���� ��� Ŭ������ ��������� �� ������ �� �� ����
		 *    Ȥ�� ���� �ȵ�� �������̵��� ���ؼ� �����ǵ� ����!!
		 */
		
		Book bk = new Book("�ڹ��� ����","���ڹ�",23000);
		
		System.out.println(bk.toString()); //�ʵ��� ���빰�� ���ڿ��� ���̾����� 
		System.out.println(bk/* .toString() */);  //�ּҰ�
		
		/*
		 * Object Ŭ�������� �����ϴ� toString() �޼ҵ��� ���� ����
		 * => �ּҰ� ����ֱ�
		 *    (�ش� ������������ǮŬ������@�ش簴ü���ּҰ���16��������) 
		 *    
		 * => �ּҰ��� ��� ��ſ� �� �ʵ��� ���� ���ڿ��� �̾ �����ϰԲ� �������̵� �� ��
		 */
		
		
		
		

	}

}
