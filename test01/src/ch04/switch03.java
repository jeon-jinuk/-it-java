package ch04;

public class switch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String season="";
		int month=7;
		
		switch(month) {
		case 3,4,5:season="봄";break;
		case 6,7,8:season="여름";break;
		case 9,10,11 :season="가을";break;
		case 12,1,2 :season="겨울";break;
		default:
			System.out.println("없는달입니다");
		}
		System.out.println(season);

	}

}
