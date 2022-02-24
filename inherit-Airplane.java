package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle {
	
	        //필드부
			private int tire;  //바퀴갯수
			private int wing;  //날개갯수
				
			//생성자부
		    public Airplane() {
				
			}
		    
		    public Airplane(String name,double mileage,String kind,int tire,int wing) {
			    super(name,mileage,kind);
			    this.tire=tire;
			    this.wing=wing;
			}
			
			
			//메소드부
		    public void setTire(int tire) {
		    	this.tire=tire;
		    }
		    public void setWing(int wing) {
		    	this.wing=wing;
		    }
		    public int getTire(int tire) {
		    	return tire;
		    }
		    public int getWing(int wing) {
		    	return wing;
		    }
		    //information 오버라이딩
		    @Override
		    public String information() {
		    	return super.information()+", "+tire+", "+wing;
		    }
		  //howToMove 오버라이딩
		    @Override
		    public void howToMove() {
		    	System.out.println("바퀴를 굴려 달리다가 날개를 휘저으면서 움직인다.");
		    
		    }
		    
		    
		
}
