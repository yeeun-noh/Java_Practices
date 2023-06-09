package ex01;

public class Exam02 {

	public static void main(String[] args) {
	// bytes > short > int > long    > float > double  
	// ==> 자동형변환
	// - 연산이나 대입할 때 타입이 일치하지 않으면 실행이 안됨
	// - 따라서 먼저 타입을 일치 시키기 (타입을 일치시킬때 형변환이 됨)
	
		double d = 85.4;
		int score = 10;
		
		d = score;
	    //  d = (double)score; => 10에서 10.0으로 변환
		System.out.println(d);
		
		d = 85.4;
		score = (int)d; // 값이 변하기 때문에 자동으로 바뀌지않음
		System.out.println(score); // 85.4에서 85로 변환
		
		int sum = 10;
		long longsum = 3000000000L; 
	
		longsum = sum;
	    //  longsum = (long)sum;
		System.out.println(longsum);
		
		short sh = 32767;
		int num = 50000;
		sh = (short)num;
		System.out.println(sh);
		
		System.out.println(5/2); // 정수 + 정수 이기 때문에 2.5에서 2만 출력
		System.out.println(5/2.0); // 정수 + 실수 이기 때문에 2.5 출력
		System.out.println(5/(double)2); // 정수 + 실수 이기 때문에 2.5 출력
		
		System.out.println( 5 & 2);
		System.out.println( 5 | 2);
	}

}
