package com.hw3.run;

import com.hw3.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
        //초기값을 부여한 두 개의 객체 생성(사용데이터 참고)
		Product[] pro = new Product[3];
		pro[0]=new Product("Samsung","Galaxy S9","Blue",960000);
		pro[1]=new Product("LG","G6","Red",820000);
		
		//1.두 개의 정보 출력 처리 : toString() 사용
		System.out.println("생성한 첫 번째 객체의 값: "+ pro[0]);
		System.out.println("생성한 두 번째 객체의 값: "+ pro[1]);
		System.out.println("========================================");		
		
		//2.두 개의 값이 일치하는지 결과 출력 처리 :equals()사용
		System.out.println("생성한 두 객체의 값이 같은가: "+ pro[0].equals(pro[1]) );
		System.out.println("========================================");
		
		//3.두 개의 해쉬코드값 출력 : hashCode() 사용
		System.out.println("첫 번째 객체의 해쉬코드값: "+pro[0].hashCode());
		System.out.println("두 번째 객체의 해쉬코드값: "+pro[1].hashCode());
		System.out.println("========================================");
		
		//첫번째 객체의 필드 값과 동일한 세 번째 객체 생성
		pro[2] = pro[0];
		
		//4.세 번째 객체 정보 출력 처리 :toString()사용
		System.out.println("세 번째 객체의 객체의 값: "+pro[2] );
		System.out.println("========================================");
		//5.첫 번째 객체와 세 번째 객체가 같은지 출력 ->1.hashCode()사용해서 출력
        //                                 2.equals()사용해서 출력
		System.out.println("첫 번째 객체와 세 번째 객체의 필드값들이 일치하는가: "+pro[0].equals(pro[2]));
		System.out.println("첫 번째 객체와 세 번째 객체의 해쉬코드값이 일치하는가: "
		                    +( ( (int) ( pro[0].hashCode() ) ) == ( (int) (  pro[2].hashCode() ) )     ));
		                
		
		
		
	}

}
