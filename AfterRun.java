package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		
		
		//상속이 잘 이루어졌나 테스트
		Desktop d = new Desktop("삼성","d-01","짱짱데스크탑",2000000,true);
		System.out.println(d.information());

		SmartPhone s = new SmartPhone();
		s.setBrand("애플");
		s.setpCode("s-01");
		s.setpName("아이폰");
		s.setPrice(1000000);
		s.setmobileAgency("SKT");
		System.out.println(s.information());
		
		Tv t = new Tv("엘지","t-01","고오급벽걸이TV",3000000,60);
		System.out.println(t.getBrand());
		System.out.println(t.getpCode());
		System.out.println(t.getpName());
		System.out.println(t.getPrice());
		System.out.println(t.getInch());
		System.out.println(t.information());
		// 실행하고자 하는 메소드가 자식클래스에 없다면 => 자동으로 부모클래스에 있는 메소드로 직행
		// 실행하고자 하는 메소드가 자식클래스에 있다면=> 자식클래스의 메소드로 직행
		//=> 동적바인딩 : 자식클래스에 있는 오버라이딩 된 메소드가 실행 우선권을 가진다. 
		
		
		
		/*
		 *  *상속의 장점
		 *  - 보다 적은 양의 코드로 새로운 클래스들을 관리 가능하다.
		 *  - 중복된 코드를 부모 클래스에서 공통적으로 관리하기 때문에
		 *    새로운 코드를 추가한다거나, 기존의 코드를 수정하는데에 용이
		 *  => 프로그램의 생산성을 높여준다. 유지보수에도 크게 기여한다.
		 *  
		 *  *상속의 특징
		 *  - 클래스간의 상속은 다중 상속이 불가능하다. (단일 상속만 가능)
		 *  - 명시되어있지는 않지만 자바에서 제공하는, 또는 내가 만든 모든 클래스는 Object 라는 클래스의 후손이다.
		 *    /*extends Object */  //이렇게 생략되어 있음 
		 /*  => Object 클래스에 있는 메소드를 그대로 가져다 쓸 수 있음.
		 *   => Object 클래스에 있는 메소드가 맘에 안들면 내 입맛대로 오버라이딩해서 쓸 수도 있음.
		 *  
		 *  
		 *  
		 */
		
		
	}

}






