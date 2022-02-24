package com.kh.chap01_beforeVSafter.after.model.vo;


                      //확장시키겠다.
public class SmartPhone extends Product {
    
	// brand, pCode, pName, price  필드가 추가된 효과
	// 이 필드들에 딸린 getter,setter 도 다 추가된 효과
	// information 메소드도 딸려온 효과
	
	//필드부
	private String mobileAgency;
	
	//생성자부
	public SmartPhone() {
		
	}
	public SmartPhone(String brand, String pCode, String pName,int price,String mobileAgency) {
		
		super(brand,pCode,pName,price);
		
		this.mobileAgency=mobileAgency;
	}
	
	//메소드부
	public String getMobileAgency() {
		return mobileAgency;
	}
	public void setmobileAgency(String mobileAgency) {
		this.mobileAgency=mobileAgency;
	}
	//information
	// 오버라이딩 : 부모님의 메소드를 물려받아 내 입맛대로 재정의
    // 동적바인딩 : 오버라이딩 된 내 메소드가 호출시 자식에게 우선순위를 가짐
	public String information() {
		//통신사도 찍고싶음
		//내 입맛대로 통신사 정보도 추가
		return super.information()+ ", "+mobileAgency;
	}
	
	
	
	
	
	
	
}
