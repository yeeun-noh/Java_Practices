package ex04;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		//(Test)
		// 사용자로부터 두개의 정수(시작, 끝)를 입력받아 시작(포함)해서 끝(포함)까지의 합을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수 입력 >>");
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum = 0;
		
		for(int i=start; i<=end; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		sum =0;
		int j; // Stack 메모리 공간에 남겨주기 위해, j를 for문 전에 선언
		for(j=start; j<=end; j++) {
			sum += j;
		}
		System.out.println(sum);
		System.out.println(j); // j 출력 가능
	}
	
}
