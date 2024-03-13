package day01;

import java.util.Scanner;

//14. 사용자로부터 세 개의 정수를 입력받아 정수, 실수, 문자열 출력(next만 사용)

public class Ques14 {
	public static void main(String[] args) {
		int a = 0;
		double b = 0.0;
		String c = "";
 		Scanner sc = new Scanner(System.in);
		
		System.out.print("first : ");
		a = Integer.parseInt(sc.next());
		
		System.out.print("second : ");
		b = Double.parseDouble(sc.next());
		
		System.out.print("third : ");
		c = sc.next();
		
		System.out.printf("%d, %f, %s", a, b, c);
	}
}
