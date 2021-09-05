package java_day02;

public class AskiiTest {
	public static void main(String[] args) {
		char a = 'a';
		System.out.println((char)(a-32));
		
		//대문자 K를 문자 변수에 저장하고 소문자 k로 출력하기
		char b = 'K';
		char res =(char)(b+32);
		
		System.out.println(res);
		
	}
}
