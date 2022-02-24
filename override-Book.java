package com.kh.chap03_override.model.vo;

// 생성자 자동완성: Source - Generate constructor using fields..
// 메소드 자동완성: Source - Generate getters and setters..

public class Book /*extends Object*/ {
  
	//필드부
	private String title; //제목
	private String author;//저자명
	private int price;    //가격
	
	//생성자부
	public Book() {
		super();  //얘는 없어도 되고 상관 없음
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//메소드부
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    
	//toString() 자동완성: Source - Generate toString()... = information 과 같다. 
	
	//Object(부모)로 부터 온 오버라이딩
	@Override   //= 오버라이딩 주석임 
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	/*
	 * * 오버라이딩
	 * - 상속받고 있는 부모클래스의 메소드를 자식클래스에서 재정의(재작성) 하는 것
	 * - 즉, 부모가 제공하고 있는 메소드를 자식이 일부 고쳐서 사용하겠다 라는 의미
	 * - 호출 시 자식메소드가 우선권을 가짐 (동적바인딩)
	 * 
	 * * 오버라이딩 성립 조건
	 * 1. 부모메소드의 메소드명과 동일
	 * 2. 매개변수의 자료형, 갯수, 순서가 동일 (단, 매개변수명은 무관)
	 *(비교..오버로딩은 매개변수의 자료형, 갯수, 순서가 달라야함)
	 * 3. 반환형이 같아야 함
	 * 4. 부모메소드의 접근제한자보다 범위가 같거나 공유 범위가 더 커야 함
	 * => 규약의 개념이 들어가 있음 (재정의 하려면 적어도 이정도의 규칙은 지켜야 한다.)
	 * 
	 * @Override : 어노테이션
	 * - 생략 가능 (명시하지 않아도 부모메소드와 형태가 같다면 오버라이딩이 잘 된것)
	 * - 붙이는 이유? 
	 * > 잘못 기술했을 경우 오류를 알려주기 때문에 다시 검토할 수 있게 유도한다.
	 * > 혹시라도 부모메소드가 후에 수정되었을 경우도 오류로 알려주기 때문에
	 *   다시한번 검토할 수 있게끔 유도해준다.
	 * > 이 메소드가 오버라이딩 된 메소드라는걸 알리고자 하는 목적!!
	 */
	
	
	
	
		
}




