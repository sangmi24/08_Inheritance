package com.kh.chap01_beforeVSafter.after.model.vo;

             //�ڽ�                     �θ�
             //����                     ����
             //����                     ����
             //�ļ�                     ����
public class Desktop extends Product {  //Ŭ���� ����� : ��𿡼� ����Ȱ͵��� �����ð��� �������� ��!extends-Ȯ���Ŵ
                                        // ������ �������� �ƴѵ� �� �����ü� �ִٴ� ���
	//�ʵ��
	//brand, pCode,pName,price, allInone
	//extends �� �����ν� �������� 4���� ���� �ڵ带 �ۼ����ص� �ȴ�. 
	private boolean allInOne;
	
	
	//�����ں�
	//�⺻
	public Desktop() {
		
	}
	//���
	public Desktop(String brand,String pCode, String pName,int price, boolean allInOne) {
		
		// brand, pCode,pName, price, allInOne �̶�� �ʵ忡 ���� �� �������ִ� ������
		// super. ��  �ش� �θ�Ŭ������ ��ü�� �ּҸ� ��� �ִ�. (��, �θ� ���� �����ϴ�)
		//��, private �� ��쿡�� ���� ���� �Ұ�!!
		
		// �ذ��� 1. private�� protected �� �ٲٱ� (������)		
		/*
		 super.brand=brand;
		 super.pCode=pCode;
		 super.pName=pName;
		 super.price=price;
	    */
		
		// �ذ��� 2.�θ� Ŭ������ �ִ� public ������������(����) setter �޼ҵ带 Ȱ��
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// �ذ���3. �θ� �����ڸ� ȣ�� (�Ű����� ������)
		//=> ��, �ݵ�� ù�ٿ� ����ؾ� �Ѵ�.(this ������ ��ó��)
		super(brand, pCode, pName, price);  //������ �߿���  this����
		
		this.allInOne = allInOne;  //�길 ��������
	}

	
	//�޼ҵ��-> ��� ������4�� ��޾��ص� extends�� �����ü� ����
	public boolean getAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne=allInOne;
	}
	
	// information
	// �������̵� : �θ�Ŭ������ �ִ� ���� �޼ҵ带 �� �Ը���� �����ؼ� ���Ӱ� ���� ��  (�����ε�:���� Ŭ���� �ȿ��� �Ű������� ������ �ȵǴ� ��..)��� ��..�������	
	// ���� ���ε� : �������̵� �� �� �޼ҵ尡 ȣ��� �켱������ ����
	// public String information() {  Ʋ�� ���ƾ� �Ѵ�
	
	
	public String information() {
		//return super.getBrand()+", "+super.getpCode()+", "+super.getpName()+", "+super.getPrice()+", "+allInOne;
		
		// protected ����� ������ �����! �ٵ� �����ұ�? no 
		//=> Product �� ���� ��Ű�� ���� ���� ������� �ٸ� Ŭ���������� �����Ӱ� ������ ������ �����ϱ� (ĸ��ȭ ���)
		//private ������ "���������� ���ڴ�." => "���������� �����ϰ� �ϰڴ�." 
		//this�� ������(���� Ŭ����..)�� ���ϴ°�, super�� �θ𿵿����� �������ڴ�.
		//�켱������ �θ𿵿����� �� �������� ȣ���� ���� �ȴ�. �������ε�
		
		// �θ�κ���
		// �ʵ忡 ���������� �ϰ� �ʹٸ�  super.�ʵ��
		// �޼ҵ带 ȣ���ϰ� �ʹٸ� super.�޼ҵ��()
		// �����ڸ� ȣ���ϰ� �ʹٸ� super()
		return super.information()+ ", "+allInOne;  //getter�� 4�� ȣ���� ȿ���� ����.  
	}
	
	
	
	
	
}
