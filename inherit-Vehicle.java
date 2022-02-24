package com.kh.chap02_inherit.model.vo;

public class Vehicle {
   
	//필드부
	private String name;      //이름
	private double mileage;   //이동거리
	private String kind;     //종류
		
	//생성자부
	//기본
	public Vehicle() {
		
	}
	//완성
    public Vehicle(String name,double mileage,String kind) {
		 this.name= name;
		 this.mileage=mileage;
		 this.kind=kind;
	}
	
	//메소드부
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
     System.out.println("움직인다.");
    	
    	
    }
    
    
    
}





