package test.main;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("메인 메소드 시작했다.");
		//지역변수를 만들고 값을 나중에 넣고 싶으면 초기값을 대입하는게 좋다.
		//무슨 값이라도 넣어두어야 기억공간이 만들어짐.
		
		int num1=0;
		String name1=null;
		
		//참조 데이터 타입이 담길 수 있는 빈 변수를 만들고 싶을 때에는 null을 넣자.
		//넘버 타입일 경우 0, 참조 데이터 타입일 경우 null, boolean 타입일 경우 false를 넣어야함.
		System.out.println("메인 메소드 끝났다.");
	}
}
