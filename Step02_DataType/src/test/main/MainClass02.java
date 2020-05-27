package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//국어 점수
		int kor=95;
		//영어 점수
		int eng=100;
		
		//국어 점수와 영어 점수의 평균을 구해서 변수에 담고 그 결과를 콘솔창에 출력해 보세요.
		//정수(int)와 정수의 연산은 무조건 정수밖에 나오지 않는다. 
		//따라서 아래와 같이, 결과값에 실수를 도출하기 위해서는 연산할 때 실수 타입을 넣어주자.
		//int type과 double type을 연산하면 결과는 double type이다.
		double num= (kor+eng)/2.0;
		System.out.println("평균값은"+num+"입니다.");
	}
}
