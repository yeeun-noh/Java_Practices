package ex05;

public class Exam09 {

	public static void main(String[] args) {

		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i == j) continue; //continue문을 만나면, 라인9번쨰 반복으로 돌아가 계속 수행
				
				System.out.println(i + " x" + j + " =" + i*j);
			}
		}
		System.out.println("프로그램 종료");

		System.out.println("-----------------------------------------------");

		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i == j) break; //break문을 만나면, 반복문을 벗어남
				
				System.out.println(i + " x" + j + " =" + i*j);
			}
		}
		System.out.println("프로그램 종료");
	}

}

//(실행결과 :)
//
//2 x1 =2
//2 x3 =6
//2 x4 =8
//2 x5 =10
//2 x6 =12
//2 x7 =14
//2 x8 =16
//2 x9 =18
//3 x1 =3
//3 x2 =6
//3 x4 =12
//3 x5 =15
//3 x6 =18
//3 x7 =21
//3 x8 =24
//3 x9 =27
//4 x1 =4
//4 x2 =8
//4 x3 =12
//4 x5 =20
//4 x6 =24
//4 x7 =28
//4 x8 =32
//4 x9 =36
//5 x1 =5
//5 x2 =10
//5 x3 =15
//5 x4 =20
//5 x6 =30
//5 x7 =35
//5 x8 =40
//5 x9 =45
//6 x1 =6
//6 x2 =12
//6 x3 =18
//6 x4 =24
//6 x5 =30
//6 x7 =42
//6 x8 =48
//6 x9 =54
//7 x1 =7
//7 x2 =14
//7 x3 =21
//7 x4 =28
//7 x5 =35
//7 x6 =42
//7 x8 =56
//7 x9 =63
//8 x1 =8
//8 x2 =16
//8 x3 =24
//8 x4 =32
//8 x5 =40
//8 x6 =48
//8 x7 =56
//8 x9 =72
//9 x1 =9
//9 x2 =18
//9 x3 =27
//9 x4 =36
//9 x5 =45
//9 x6 =54
//9 x7 =63
//9 x8 =72
//프로그램 종료
//-----------------------------------------------
//2 x1 =2
//3 x1 =3
//3 x2 =6
//4 x1 =4
//4 x2 =8
//4 x3 =12
//5 x1 =5
//5 x2 =10
//5 x3 =15
//5 x4 =20
//6 x1 =6
//6 x2 =12
//6 x3 =18
//6 x4 =24
//6 x5 =30
//7 x1 =7
//7 x2 =14
//7 x3 =21
//7 x4 =28
//7 x5 =35
//7 x6 =42
//8 x1 =8
//8 x2 =16
//8 x3 =24
//8 x4 =32
//8 x5 =40
//8 x6 =48
//8 x7 =56
//9 x1 =9
//9 x2 =18
//9 x3 =27
//9 x4 =36
//9 x5 =45
//9 x6 =54
//9 x7 =63
//9 x8 =72
//프로그램 종료