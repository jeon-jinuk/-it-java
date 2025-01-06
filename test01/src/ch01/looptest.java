package ch01;

import java.util.Scanner;

public class looptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			System.out.println("대문자 변환,소문자 입력, 종료조건 :quit 입력");
			String s=sc.next();
			if(s.equals("quit"))
				break;
			char ch=s.charAt(0); 
			System.out.println((char)(ch-32));
		}
		sc.close();
		

	}

}
