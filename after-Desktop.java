package com.kh.chap01_beforeVSafter.after.model.vo;

             //자식                     부모
             //서브                     슈퍼
             //하위                     상위
             //후손                     조상
public class Desktop extends Product {  //클래스 선언부 : 어디에서 공통된것들을 가져올건지 언급해줘야 함!extends-확장시킴
                                        // 실제로 적힌것은 아닌데 다 가져올수 있다는 얘기
	//필드부
	//brand, pCode,pName,price, allInone
	//extends 로 함으로써 공통적인 4개는 따로 코드를 작성안해도 된다. 
	private boolean allInOne;
	
	
	//생성자부
	//기본
	public Desktop() {
		
	}
	//모든
	public Desktop(String brand,String pCode, String pName,int price, boolean allInOne) {
		
		// brand, pCode,pName, price, allInOne 이라는 필드에 값을 다 대입해주는 생성자
		// super. 은  해당 부모클래스의 객체의 주소를 담고 있다. (즉, 부모에 접근 가능하다)
		//단, private 일 경우에는 직접 접근 불가!!
		
		// 해결방법 1. private을 protected 로 바꾸기 (부적합)		
		/*
		 super.brand=brand;
		 super.pCode=pCode;
		 super.pName=pName;
		 super.price=price;
	    */
		
		// 해결방법 2.부모 클래스에 있는 public 접근제한자인(간접) setter 메소드를 활용
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// 해결방법3. 부모 생성자를 호출 (매개변수 생성자)
		//=> 단, 반드시 첫줄에 기술해야 한다.(this 생성자 때처럼)
		super(brand, pCode, pName, price);  //순서도 중요함  this위에
		
		this.allInOne = allInOne;  //얘만 직접접근
	}

	
	//메소드부-> 얘는 나머지4개 언급안해도 extends로 가져올수 있음
	public boolean getAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne=allInOne;
	}
	
	// information
	// 오버라이딩 : 부모클래스에 있는 같은 메소드를 내 입맛대로 정의해서 새롭게 쓰는 것  (오버로딩:같은 클래스 안에서 매개변수가 같으면 안되는 것..)얘랑 비교..기술면접	
	// 동적 바인딩 : 오버라이딩 된 내 메소드가 호출시 우선순위를 가짐
	// public String information() {  틀이 같아야 한다
	
	
	public String information() {
		//return super.getBrand()+", "+super.getpCode()+", "+super.getpName()+", "+super.getPrice()+", "+allInOne;
		
		// protected 썼더니 오류는 사라짐! 근데 적합할까? no 
		//=> Product 와 같은 패키지 안의 나랑 상관없는 다른 클래스에서는 자유롭게 접근이 가능한 범위니까 (캡슐화 어김)
		//private 썼을때 "직접접근을 막겠다." => "간접접근은 가능하게 하겠다." 
		//this는 내영역(같은 클래스..)을 말하는거, super는 부모영역에서 가져오겠다.
		//우선순위는 부모영역말고 내 영역에서 호출이 먼저 된다. 동적바인딩
		
		// 부모로부터
		// 필드에 직접접근을 하고 싶다면  super.필드명
		// 메소드를 호출하고 싶다면 super.메소드명()
		// 생성자를 호출하고 싶다면 super()
		return super.information()+ ", "+allInOne;  //getter을 4번 호출한 효과를 낸다.  
	}
	
	
	
	
	
}
