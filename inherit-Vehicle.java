package com.kh.chap02_inherit.model.vo;

public class Vehicle {
   
	//�ʵ��
	private String name;      //�̸�
	private double mileage;   //�̵��Ÿ�
	private String kind;     //����
		
	//�����ں�
	//�⺻
	public Vehicle() {
		
	}
	//�ϼ�
    public Vehicle(String name,double mileage,String kind) {
		 this.name= name;
		 this.mileage=mileage;
		 this.kind=kind;
	}
	
	//�޼ҵ��
	//setter
    public void setName(String name) {
    	this.name=name;
    }
    public void setMileage(double mileage) {
    	this.mileage=mileage;
    }
    public void setKind(String kind) {
    	this.kind=kind;
    }
   //getter
    public String getName() {
    	return name;
    }
    public double getMileage() {
    	return mileage;
    }
    public String getKind() {
    	return kind;
    }
    
	//information
    public String information() {
    	return name+", "+mileage+", "+kind;
    }
    
    public void howToMove() {
     System.out.println("�����δ�.");
    	
    	
    }
    
    
    
}





