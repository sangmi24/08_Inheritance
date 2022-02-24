package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
    //필드부
	private String brand;  //브랜드명
	private String pCode;  //상품코드
	private String pName;  //상품명
	private int price;    //상품가격
	private boolean allInOne;  //일체여부
	
    //생성자부
	//기본
	public Desktop() {
		
	}
	//완료
	public Desktop(String brand, String pCode,String pName
			        ,int price,boolean allInOne) {
		this.brand=brand; 
		this.pCode=pCode;
		this.pName=pName; 
		this.price=price;
		this.allInOne=allInOne; 
	}		
	//메소드부
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
