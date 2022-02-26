package com.hw1.model.vo;

public class Employee extends Person {

	//�ʵ��
	private int salary;    //�޿�
	private String dept;   //�μ�
	
	//�����ں�
	public Employee() {
	}

	public Employee(String name,int age, double height, double weight,
			        int salary, String dept) {
		super(age,height,weight);
		super.name=name;
		this.salary = salary;
		this.dept = dept;
	}
	//�޼ҵ��
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "���� [�̸�: "+name+"����: " + super.getAge() + ", Ű: " + super.getHeight()+ 
				 ", ������: " + super.getWeight()+", �޿�: " + salary + ", ����: " + dept + "]";
	}
	
	
	
	
	
	
}