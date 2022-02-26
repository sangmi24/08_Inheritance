package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
	
		//3명의 학생 정보를 기록할 수 있게 객체 배열 할당
		Student[] std = new Student[3];
		//3명의 학생 정보 초기화, 위의 학생 정보 모두 출력
		std[0] = new Student("지민",20,178.2,70.0,1,"정보시스템공학과");
		std[1] = new Student("정국",21,187.3,80.0,2,"경영학과");
		std[2] = new Student("뷔",23,175.0,71.2,4,"정보통신공학과");
		for(int i=0; i<std.length;i++) {
		   System.out.println(std[i]);
		}
		//최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
		Employee[] ep = new Employee[10];
		//사원들의 정보를 키보드로 계속 입력 받고  (while(true) 무한 반복문을 통해)
		//입력 받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
		//한 명씩 추가될 때 마다 카운트함
	    Scanner sc= new Scanner(System.in);
	    int num =0;
	    while(true) {
	    	System.out.print("직원 이름: ");
	    	String name=sc.nextLine();
	    	System.out.print("직원 나이: ");
	    	int age = sc.nextInt();
	        sc.nextLine();
	    	System.out.print("직원 키: ");
	    	double height=sc.nextDouble();
	    	 sc.nextLine();
	    	System.out.print("직원 몸무게: ");
	    	double weight = sc.nextDouble();
	    	 sc.nextLine();
	    	System.out.print("직원 급여: ");
	    	int salary = sc.nextInt();
	    	 sc.nextLine();
	    	System.out.print("직원 부서: ");
	    	String dept=sc.nextLine();
	    	
	    	ep[num]=new Employee(name,age,height,weight,salary,dept);
	    	num+=1;
	    	
	    	//계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면 계속 객체 추가
		    //'n'일 경우 더 이상 그만 입력 받도록
	    	System.out.print("계속 추가 입력하시겠습니까? (y/n): ");
	    	String answer=sc.nextLine();
	    	
	    	
	    	if(answer.equals("Y")|| answer.equals("y")) {
	    		continue;
	    	}else if(answer.equals("N")|| answer.equals("n")) {
	    		System.out.println("프로그램을 종료합니다.");
	    		break;
	    	}
	    } //배열에 담긴 사원들의 정보를 모두 출력
	    for(int i = 0; i<num; i++) {   //  num로 해야지 숫자가 초과되지 않는다. 
	    	System.out.println(ep[i].toString());
	    }
	    
	    
	
	    
	   
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
