package com.hw1.model.vo;

public class Person {

    //�ʵ��
	//name���� �θ� �ʵ� ���� ���� �����ؼ� �ʱ�ȭ 
	//�����ϰ� �����ߴµ� ������.. ���� �̸���  runŬ��������  
    protected String name;  
    private int age;
    private double height;
    private double weight;
	
		
	//�����ں�
    
    public Person() {
	}
	public Person( int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//�޼ҵ��

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
		return "Person [ ���� :" + age + ",����=" + height + ", ������=" + weight + "]";
	}
    
	
	
	
	
	
}
