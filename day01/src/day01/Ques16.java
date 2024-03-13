package day01;

import java.util.Scanner;

//16. 두 개의 실수형 변수 num1과 num2를 선언하고, 
//사용자로부터 입력을 받아 두 수를 나눈 결과를 소숫점 두 자리까지 출력하기
public class Ques16 {
	public static void main(String[] args) {
		double num1 = 0.0, num2 = 0.0, result = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num1 : ");
		num1 = sc.nextDouble();
		
		System.out.print("num2 : ");
		num2 = sc.nextDouble();
				
		result = num1 / num2;
		
		System.out.printf("%f / %f = %.2f", num1, num2, result);
	}
}
