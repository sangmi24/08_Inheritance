package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle {

	    //�ʵ��
		private int propeller;  //�����緯�� ���� ����
			
		//�����ں�
	    public Ship() {
			
		}
	    
	    public Ship(String name,double mileage,String kind,int propeller) {
		    super(name,mileage,kind);
		    this.propeller=propeller;
		}
		
		
		//�޼ҵ��
	    public void setPropeller(int propeller) {
	    	this.propeller=propeller;
	    }
	    public int getPropeller() {
	    	return propeller;
	    }
	    
	    //information �������̵�
	    @Override
	    public String information() {
	    	return super.information()+", "+propeller;
	    }
	  //howToMove �������̵�
	    @Override
	    public void howToMove() {
	    	System.out.println("�����緯�� �������鼭 �����δ�.");
	    
	    }
	
	
	
	
}
