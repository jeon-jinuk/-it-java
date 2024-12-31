package ch02;

public class TypecastingEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=3;
		int num=b;
		b=(byte)num;
		
		int num1=(int)(num+3.5);
		System.out.println(num1);
		
		
	}

}
