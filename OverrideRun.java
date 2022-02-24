package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		/*
		 * 모든 클래스는 Object 클래스의 후손이다. 
		 * 즉, 자바에서 최상위클래스는 항상 Object
		 * => Object 에 있는 메소드들은 어느 클래스를 만들던간에 다 가져다 쓸 수 있음
		 *    혹시 맘에 안들면 오버라이딩을 통해서 재정의도 가능!!
		 */
		
		Book bk = new Book("자바의 정석","김자바",23000);
		
		System.out.println(bk.toString()); //필드의 내용물이 문자열로 연이어져서 
		System.out.println(bk/* .toString() */);  //주소값
		
		/*
		 * Object 클래스에서 제공하는 toString() 메소드의 원래 역할
		 * => 주소값 찍어주기
		 *    (해당 참조형변수의풀클래스명@해당객체의주소값의16진수형태) 
		 *    
		 * => 주소값을 찍는 대신에 각 필드의 값을 문자열로 이어서 리턴하게끔 오버라이딩 한 꼴
		 */
		
		
		
		

	}

}
