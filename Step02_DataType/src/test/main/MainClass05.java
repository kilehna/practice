package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		//"집가싶" 정보를 담고 있는 참조값(id값)이 변수에 들어간다.
		String name="집가싶";
		String tmp=name; //참조값 복사해주기
		name="집가고싶다고!!!!!!"; //새로운 참조값으로 대입하기
		name=null; //name 변수를 empty(빈) 상태로 만들기.
		// 참조 데이터는 담을 수 있지만 아직 key가 담기지 않은 상태.
		// null이 들어있다는 것은 비어있다는 뜻.
		// 하지만 string type의 참조값만 들어갈 수 있는 빈 상태.
	}
}
