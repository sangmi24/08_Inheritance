package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle{
	//필드부
	private int tire;  //바퀴의 갯수
		
	//생성자부
    public Car() {
		
	}
    
    public Car(String name,double mileage,String kind,int tire) {
    	//매개변수 이용 
	    super(name,mileage,kind);
	    this.tire=tire;
	}
	
	
	//메소드부
    public void setTire(int tire) {
    	this.tire=tire;
    }
    public int getTire() {
    	return tire;
    }
    
    //information 오버라이딩
    @Override
    public String information() {
    	return super.information()+", "+tire;
    }
    
    //howToMove 오버라이딩
    @Override
    public void howToMove() {
    	System.out.println("바퀴를 굴려서 움직인다.");
    
    }
    
    

}
