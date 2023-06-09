package ex07;

import java.util.Arrays;

public class Exam03 {
	
	public static void main(String[] args) {
		
		String[] str1 = new String[3];
		
		String[] str2 = new String[3];
		str2[0] = "kor";
		str2[1] = "eng";
		str2[2] = "math";
		
		String[] str3 = { "kor", "eng", "math" };

		System.out.println(Arrays.toString(str1)); // [null, null, null]
		System.out.println(Arrays.toString(str2)); // [kor, eng, math]
		System.out.println(Arrays.toString(str3)); // [kor, eng, math]
		
		
		// String클래스의 주요 메서드:
		// 1. char charAt(int index) : 문자열에서 해당위치(index)에 있는 문자를 반환
		// 2. int length() : 문자열의 길이를 반환
		// 3. String substring(int from, int to) : 문자열에서 해당 범위(from~to)에 있는 문자열을 반환 (to는 범위에 포함하지 않음)
		// 4. boolean equals(Object obj) : 문자열의 내용이 obj와 같은지 확인 (같으면 결과는 true, 다르면 false)
		// 5. char[] toCharArray() : 문자열을 문자배열(char[])로 변환해서 반환
		
		String msg = "korea";

		// 1. charAt()	:	
		char ch = msg.charAt(0);
		System.out.println(ch); // k

		// 2. length() :	
		int a = msg.length();
		System.out.println(a); // 5

		// 3. substring(from, to) :
		String msg2 = msg.substring(0,3); // 인덱스 0이상 3미만(==인덱스0~2) 사이의 값출력 ==> 1~3번째 값 출력
		System.out.println(msg2); // kor

		// int a, int b 비교 =>  기본자료형비교는 a==b
		// String a, String b 비교 => 기본형의 참조형비교는 a.equals(b)
		// 4. equals() :
		boolean check = msg.equals(msg2); //'korea'와 'kor'비교
		System.out.println(check); // false
		
		// 5. toCharArray() :
		char[] ch2 = msg.toCharArray();
		System.out.println(ch2); // korea
	}
}
