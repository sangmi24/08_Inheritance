package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
    //�ʵ��
	private String brand;  //�귣���
	private String pCode;  //��ǰ�ڵ�
	private String pName;  //��ǰ��
	private int price;    //��ǰ����
	private boolean allInOne;  //��ü����
	
    //�����ں�
	//�⺻
	public Desktop() {
		
	}
	//�Ϸ�
	public Desktop(String brand, String pCode,String pName
			        ,int price,boolean allInOne) {
		this.brand=brand; 
		this.pCode=pCode;
		this.pName=pName; 
		this.price=price;
		this.allInOne=allInOne; 
	}		
	//�޼ҵ��
	//setter
	public void setBrand(String brand) {
		this.brand=brand; 
	}
	public void setpCode(String pCode) {
		this.pCode=pCode; 
	}
	public void setpName(String pName) {
		this.pName=pName; 
	}
	public void setPrice(int price) {
		this.price=price; 
	}
	public void setAlllnOne(boolean allInOne) {
		this.allInOne=allInOne; 
	}

	//getter
	public String getBrand() {
		return brand; 
	}
	public String getpCode() {
		return pCode; 
	}
	public String getpName() {
		return pName; 
	}
	public int getPrice() {
		return price; 
	}
	public boolean getAlllnOne() {
		return allInOne; 
	}
	//information
	public String information() {
		return brand+", "+pCode+", "+pName
				+", "+price+", "+allInOne;
	}
	
	
	
	
}
