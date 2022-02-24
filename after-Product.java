package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product /*extends Object */{

	
	/*
	 * TV 든 SmartPhone 이든 Desktop 이든 간에 "상품"이라는 공통적인 특징을 뽑아낼수 있음!
	 * 그러면 "상품" 이라면 당연히 가져야하는 속성들이 있기 마련
	 * => brand,pCode,PName,price
	 * 
	 * 세 클래스 모두 공통적으로 기술했던 요소들만 추출해서 단 한번 정의하겠다.
	 * => 그 클래스를 "부모클래스 "라고 부른다. (==슈퍼클래스 =상위클래스)
	 * 
	 */
	//필드부
	private String brand;
	private String pCode;
	private String pName;
	private int price;

//	protected String brand;
//	protected String pCode;
//	protected String pName;
//	protected int price;
		
	//생성자부
    public Product() {
    	
    }
    //매개변수 생성자 
    public Product(String brand,String pCode,String pName,int price) {
    	
    	this.brand=brand;
    	this.pCode=pCode;
    	this.pName=pName;
    	this.price=price;

    }

	
	//메소드부
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
