package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		// int type 지역변수를 선언만 하면 만들어지지 않는다.
		int num1;
		// string type 지역변수를 선언만 하면 만들어지지 않는다.
		String name1;
		
		//아직 만들어지지 않은 상태에서는 참조해서 사용이 불가
		// int result=10+num1, System.out.println("name1:"+name1); 등.
		
		num1=10;
		//이렇게 값을 넣어줘야 만들 수 있다.
		
		
		
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
