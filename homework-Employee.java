package com.hw1.model.vo;

public class Employee extends Person {

	//필드부
	private int salary;    //급여
	private String dept;   //부서
	
	//생성자부
	public Employee() {
	}

	public Employee(String name,int age, double height, double weight,
			        int salary, String dept) {
		super(age,height,weight);
		super.name=name;
		this.salary = salary;
		this.dept = dept;
	}
	//메소드부
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
		return "직원 [이름: "+name+"나이: " + super.getAge() + ", 키: " + super.getHeight()+ 
				 ", 몸무게: " + super.getWeight()+", 급여: " + salary + ", 전공: " + dept + "]";
	}
	
	
	
	
	
	
}
