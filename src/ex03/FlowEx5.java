package ch4;

import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {

		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력하세요 >>");

		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.printf("당신의 점수는 %d%n", score);
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if(score < 94) {
				opt = '-';
			} 
		} else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if(score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		
		System.out.printf("당신의 학점은 %c%c%n" , grade , opt);
	}

}
