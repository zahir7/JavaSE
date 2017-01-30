package test.main;

import java.util.Scanner;

/*
 * 비만지수 (BMI) 계산법
 * 
 *   결과 = 체중(kg) / 키(m)의 제곱
 *   
 *   	     결과  >= 40  		: 병적 비만
 *   40 > 결과  >= 30 		:비만
 *   30 > 결과  >= 25 		:과체중
 *   25 > 결과  >= 18.5 		:표준형
 *   18.5 > 결과 				:저체중
 *   
 *   [[ 단위에 주의 하기 ]]
 *   
 *   예)키 : 170 cm   체중 60 kg 이라면 식은
 *   결과 = 60 / (1.7)*(1.7)   이 된다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("키를 입력하세요[m]");
		double height = scan.nextDouble(); //키 입력 받기
		
		System.out.println("몸무게를 입력하세요[kg]");
		int weight = scan.nextInt(); //몸무게 입력받기
		//BMI 지수 계산하기
		double bmi = weight / (height*height) ;
		//결과 값 출력하기
		if( bmi >= 40){
			System.out.println("병적 비만입니다");
		}else if( bmi >= 30){
			System.out.println("비만 입니다.");
		}else if( bmi >= 25){
			System.out.println("과체중 입니다");
		}else if( bmi >= 18.5){
			System.out.println("정상 입니다.");
		}else{
			System.out.println("저체중 입니다.");
		}
		System.out.println("당신의 BMI 지수:"+bmi);
	}
}

















