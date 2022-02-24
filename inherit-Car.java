package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle{
	//�ʵ��
	private int tire;  //������ ����
		
	//�����ں�
    public Car() {
		
	}
    
    public Car(String name,double mileage,String kind,int tire) {
    	//�Ű����� �̿� 
	    super(name,mileage,kind);
	    this.tire=tire;
	}
	
	
	//�޼ҵ��
    public void setTire(int tire) {
    	this.tire=tire;
    }
    public int getTire() {
    	return tire;
    }
    
    //information �������̵�
    @Override
    public String information() {
    	return super.information()+", "+tire;
    }
    
    //howToMove �������̵�
    @Override
    public void howToMove() {
    	System.out.println("������ ������ �����δ�.");
    
    }
    
    

}
