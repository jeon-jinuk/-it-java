package ch04;

public class swichtest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3~5:봄, 6~8:여름, 9~11:가을, 12,1,2:겨울
		int score=90;
		char grad;
		
		switch(score/10) {
		case 10,9:grad='A'; break;
		case 8:grad='B'; break;
		case 7:grad='C'; break;
		default:grad='F';
		}
		if(score>=90) {
			grad='A';
		}else if(score>=80) {
			grad='B';
		}else if(score>=70) {
			grad='C';
		}else {
			grad='F';
		}
		System.out.println(grad);

	}

}
