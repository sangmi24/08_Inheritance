package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle {
	
	        //�ʵ��
			private int tire;  //��������
			private int wing;  //��������
				
			//�����ں�
		    public Airplane() {
				
			}
		    
		    public Airplane(String name,double mileage,String kind,int tire,int wing) {
			    super(name,mileage,kind);
			    this.tire=tire;
			    this.wing=wing;
			}
			
			
			//�޼ҵ��
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
		    //information �������̵�
		    @Override
		    public String information() {
		    	return super.information()+", "+tire+", "+wing;
		    }
		  //howToMove �������̵�
		    @Override
		    public void howToMove() {
		    	System.out.println("������ ���� �޸��ٰ� ������ �������鼭 �����δ�.");
		    
		    }
		    
		    
		
}
