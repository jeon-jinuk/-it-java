package ch01;

public class foretest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			for(int j=0; j<=i; j++) {
			System.out.println("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10-i; j++) {
			System.out.println("*");
			}
			System.out.println();
	    }
		for(int i=0; i<10; i++) {
			for(int j=-10; j<10; j++) {
			if(Math.abs(j)<=i)	
			    System.out.println("*");
			else
			    System.out.println(" ");
		 }
		 System.out.println(); 	
		

}
}
}