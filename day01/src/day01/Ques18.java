package day01;

import java.util.Scanner;

//18. 사용자로부터 이름과 나이를 입력받아 "안녕하세요, [이름]님. [나이]살이시군요."
//		 형식으로 환영 메시지를 출력하기
public class Ques18 {
	public static void main(String[] args) {
		int age = 0;
		String name = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name : ");
		name = sc.next();
		
		System.out.print("age : ");
		age = sc.nextInt();
		
		System.out.printf("안녕하세요, %s님. %d살 이시군요", name, age);
	}
}
