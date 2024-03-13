package day01;

import java.util.Scanner;

//17. 두 개의 정수형 변수 num1과 num2를 선언하고, 
//사용자로부터 입력을 받아 두 수를 더한 결과를 출력하기

public class Ques17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		
		System.out.print("num1 : ");
		num1 = sc.nextInt();
		
		System.out.print("num2 : ");
		num2 = sc.nextInt();
		
		result = num1 + num2;
		
		System.out.printf("%d + %d = %d", num1, num2, result);
	}
}
