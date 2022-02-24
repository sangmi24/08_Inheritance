package com.kh.chap03_override.model.vo;

// ������ �ڵ��ϼ�: Source - Generate constructor using fields..
// �޼ҵ� �ڵ��ϼ�: Source - Generate getters and setters..

public class Book /*extends Object*/ {
  
	//�ʵ��
	private String title; //����
	private String author;//���ڸ�
	private int price;    //����
	
	//�����ں�
	public Book() {
		super();  //��� ��� �ǰ� ��� ����
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//�޼ҵ��
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
    
	//toString() �ڵ��ϼ�: Source - Generate toString()... = information �� ����. 
	
	//Object(�θ�)�� ���� �� �������̵�
	@Override   //= �������̵� �ּ��� 
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	/*
	 * * �������̵�
	 * - ��ӹް� �ִ� �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� ������(���ۼ�) �ϴ� ��
	 * - ��, �θ� �����ϰ� �ִ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴ� ��� �ǹ�
	 * - ȣ�� �� �ڽĸ޼ҵ尡 �켱���� ���� (�������ε�)
	 * 
	 * * �������̵� ���� ����
	 * 1. �θ�޼ҵ��� �޼ҵ��� ����
	 * 2. �Ű������� �ڷ���, ����, ������ ���� (��, �Ű��������� ����)
	 *(��..�����ε��� �Ű������� �ڷ���, ����, ������ �޶����)
	 * 3. ��ȯ���� ���ƾ� ��
	 * 4. �θ�޼ҵ��� ���������ں��� ������ ���ų� ���� ������ �� Ŀ�� ��
	 * => �Ծ��� ������ �� ���� (������ �Ϸ��� ��� �������� ��Ģ�� ���Ѿ� �Ѵ�.)
	 * 
	 * @Override : ������̼�
	 * - ���� ���� (������� �ʾƵ� �θ�޼ҵ�� ���°� ���ٸ� �������̵��� �� �Ȱ�)
	 * - ���̴� ����? 
	 * > �߸� ������� ��� ������ �˷��ֱ� ������ �ٽ� ������ �� �ְ� �����Ѵ�.
	 * > Ȥ�ö� �θ�޼ҵ尡 �Ŀ� �����Ǿ��� ��쵵 ������ �˷��ֱ� ������
	 *   �ٽ��ѹ� ������ �� �ְԲ� �������ش�.
	 * > �� �޼ҵ尡 �������̵� �� �޼ҵ��°� �˸����� �ϴ� ����!!
	 */
	
	
	
	
		
}




