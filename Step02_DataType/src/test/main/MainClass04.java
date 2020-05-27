package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//char 형 변수 선언과 동시에 값 대입하기. (하나에 한 글자만 넣을 수 있다.)
		char ch1='a';
		char ch2='b';
		char ch3='c';
		char ch4='가';
		char ch5='나';
		char ch6='다';
		char ch7='@';
		
		//정수 값에 1:1 대응되는 char 값이 존재한다.
		int code1=ch1;
		int code2=ch2;
		int code3=ch3;
		int code4=ch4;
		int code5=ch5;
		int code6=ch6;
		//char도 결국 내부적으로는 정수값으로 처리된다. 각각 1:1대응되는 약속된 코드값 존재.
		//int값의 범위가 더 넓기 때문에, char형 변수를 int에 넣어도 문제는 없다.
		
		char result1=100;
		char result2=101;
		char result3=102;
		
	}
}
