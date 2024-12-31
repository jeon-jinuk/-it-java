package ch04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("음료의 종류를 알려주세요(1:에스프레소,2.아메리카노,3.카푸치노,4.카페라떼");
		int n1=sc.nextInt();
		System.out.println("잔의 수를 입력해주세요");
		int n2=sc.nextInt();
		int charge = 0;
				
		if(n1 == 1) {
        	charge = 1000*n2;
        	System.out.println("에스프레소:");
        }
        
        else if(n1 == 2) {
        	charge = 2500*n2;
        	System.out.println("아메리카노:");
        }
        else if(n1 == 3) {
        	charge = 3000*n2;
        	System.out.println("카푸치노:");
        }
        else if(n1 == 4){
        	charge = 3500*n2;
        	System.out.println("카폐라떼:");
        }
        else {
        	System.out.println("잘못 입력했습니다");
        }
        
        System.out.println("가격은" + charge +  "원입니다.");


	}

}
