package com.hw1.model.vo;

public class Person {

    //필드부
	//name값은 부모 필드 값에 직접 접근해서 초기화 
	//복잡하게 생각했는데 간단히.. 각각 이름은  run클래스에서  
    protected String name;  
    private int age;
    private double height;
    private double weight;
	
		
	//생성자부
    
    public Person() {
	}
	public Person( int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//메소드부

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Person [ 나이 :" + age + ",신장=" + height + ", 몸무게=" + weight + "]";
	}
    
	
	
	
	
	
}
