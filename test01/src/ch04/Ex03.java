package ch04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("월을 입력해주세요");
		int n1=sc.nextInt();
		if(n1 <1 || n1>12) {
			System.out.println("월을 잘못 입력했습니다");
		}
		
		if(n1 >=3 && n1<=5 ) 
        	System.out.println("봄");
        else if(n1 >=6 && n1<=8 ) 
        	System.out.println("여름");
        else if(n1 >=9 && n1<=10 ) 
        	System.out.println("가을");
        else
        	System.out.println("겨울");
       
		

	}

}
