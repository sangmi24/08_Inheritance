package com.kh.chap01_beforeVSafter.before.model.vo;

public class Tv {

	//�ʵ��
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private int inch;
	
	//�����ں�
	//�⺻
	public Tv() {
		
	}
	//�Ϸ�
	public Tv(String brand,String pCode,String pName
			,int price,int inch) {
		this.brand=brand;
		this.pCode=pCode;
		this.pName=pName;
		this.price=price;
		this.inch=inch;
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
	public void setInch(int inch) {
		this.inch=inch;
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
	public int getInch() {
		return inch;
	}
		
	//information
	public String information() {
		return brand+", "+pCode+", "+pName
				+", "+price+", "+inch;
	}
	
	
	
	
	
	
	
	
	
}
