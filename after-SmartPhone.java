package com.kh.chap01_beforeVSafter.after.model.vo;


                      //Ȯ���Ű�ڴ�.
public class SmartPhone extends Product {
    
	// brand, pCode, pName, price  �ʵ尡 �߰��� ȿ��
	// �� �ʵ�鿡 ���� getter,setter �� �� �߰��� ȿ��
	// information �޼ҵ嵵 ������ ȿ��
	
	//�ʵ��
	private String mobileAgency;
	
	//�����ں�
	public SmartPhone() {
		
	}
	public SmartPhone(String brand, String pCode, String pName,int price,String mobileAgency) {
		
		super(brand,pCode,pName,price);
		
		this.mobileAgency=mobileAgency;
	}
	
	//�޼ҵ��
	public String getMobileAgency() {
		return mobileAgency;
	}
	public void setmobileAgency(String mobileAgency) {
		this.mobileAgency=mobileAgency;
	}
	//information
	// �������̵� : �θ���� �޼ҵ带 �����޾� �� �Ը���� ������
    // �������ε� : �������̵� �� �� �޼ҵ尡 ȣ��� �ڽĿ��� �켱������ ����
	public String information() {
		//��Ż絵 ������
		//�� �Ը���� ��Ż� ������ �߰�
		return super.information()+ ", "+mobileAgency;
	}
	
	
	
	
	
	
	
}
