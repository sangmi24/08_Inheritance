package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
	
		//3���� �л� ������ ����� �� �ְ� ��ü �迭 �Ҵ�
		Student[] std = new Student[3];
		//3���� �л� ���� �ʱ�ȭ, ���� �л� ���� ��� ���
		std[0] = new Student("����",20,178.2,70.0,1,"�����ý��۰��а�");
		std[1] = new Student("����",21,187.3,80.0,2,"�濵�а�");
		std[2] = new Student("��",23,175.0,71.2,4,"������Ű��а�");
		for(int i=0; i<std.length;i++) {
		   System.out.println(std[i]);
		}
		//�ִ� 10���� ��� ������ ����� �� �ְ� �迭�� �Ҵ�
		Employee[] ep = new Employee[10];
		//������� ������ Ű����� ��� �Է� �ް�  (while(true) ���� �ݺ����� ����)
		//�Է� ���� �������� ������ �Ű����� �����ڸ� �̿��Ͽ� ��ü�迭�� ��ü ����
		//�� �� �߰��� �� ���� ī��Ʈ��
	    Scanner sc= new Scanner(System.in);
	    int num =0;
	    while(true) {
	    	System.out.print("���� �̸�: ");
	    	String name=sc.nextLine();
	    	System.out.print("���� ����: ");
	    	int age = sc.nextInt();
	        sc.nextLine();
	    	System.out.print("���� Ű: ");
	    	double height=sc.nextDouble();
	    	 sc.nextLine();
	    	System.out.print("���� ������: ");
	    	double weight = sc.nextDouble();
	    	 sc.nextLine();
	    	System.out.print("���� �޿�: ");
	    	int salary = sc.nextInt();
	    	 sc.nextLine();
	    	System.out.print("���� �μ�: ");
	    	String dept=sc.nextLine();
	    	
	    	ep[num]=new Employee(name,age,height,weight,salary,dept);
	    	num+=1;
	    	
	    	//��� �߰��� ������ �����, ��ҹ��� ������� 'y'�̸� ��� ��ü �߰�
		    //'n'�� ��� �� �̻� �׸� �Է� �޵���
	    	System.out.print("��� �߰� �Է��Ͻðڽ��ϱ�? (y/n): ");
	    	String answer=sc.nextLine();
	    	
	    	
	    	if(answer.equals("Y")|| answer.equals("y")) {
	    		continue;
	    	}else if(answer.equals("N")|| answer.equals("n")) {
	    		System.out.println("���α׷��� �����մϴ�.");
	    		break;
	    	}
	    } //�迭�� ��� ������� ������ ��� ���
	    for(int i = 0; i<num; i++) {   //  num�� �ؾ��� ���ڰ� �ʰ����� �ʴ´�. 
	    	System.out.println(ep[i].toString());
	    }
	    
	    
	
	    
	   
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
