package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		//논리형 변수 선언과 동시에 값 대입하기.
		boolean isRun = true;
		if(isRun) {
			System.out.println("달려요");
		}
		
		//비교 연산의 결과로 얻어진 boolean 값 담기
		boolean isGreater=10>1;
		//논리 연산의 결과로 얻어진 boolean 값 담기
		boolean result=true||false;
		
		//한 번 선언한 변수는 다시 선언할 수 없다.
		//가령, boolean result=false는 오류가 발생.
		
		result=false;
		//하지만 변수에 다른 값을 대입할 수는 있다.(동일한 type인 경우)
		//result=10과 같이, 다른 type값은 변수에 담을 수 없다.
	}
}
