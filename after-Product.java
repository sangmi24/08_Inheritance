package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product /*extends Object */{

	
	/*
	 * TV �� SmartPhone �̵� Desktop �̵� ���� "��ǰ"�̶�� �������� Ư¡�� �̾Ƴ��� ����!
	 * �׷��� "��ǰ" �̶�� �翬�� �������ϴ� �Ӽ����� �ֱ� ����
	 * => brand,pCode,PName,price
	 * 
	 * �� Ŭ���� ��� ���������� ����ߴ� ��ҵ鸸 �����ؼ� �� �ѹ� �����ϰڴ�.
	 * => �� Ŭ������ "�θ�Ŭ���� "��� �θ���. (==����Ŭ���� =����Ŭ����)
	 * 
	 */
	//�ʵ��
	private String brand;
	private String pCode;
	private String pName;
	private int price;

//	protected String brand;
//	protected String pCode;
//	protected String pName;
//	protected int price;
		
	//�����ں�
    public Product() {
    	
    }
    //�Ű����� ������ 
    public Product(String brand,String pCode,String pName,int price) {
    	
    	this.brand=brand;
    	this.pCode=pCode;
    	this.pName=pName;
    	this.price=price;

    }

	
	//�޼ҵ��
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public String getpCode() {
	  return pCode;	
	}
	public void setpCode(String pCode) {
		this.pCode=pCode;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName=pName;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	//information
	public String information() {
		return brand+", "+pCode+", "+pName+", "+price;
	}
	
	
	
	
	
	
}
