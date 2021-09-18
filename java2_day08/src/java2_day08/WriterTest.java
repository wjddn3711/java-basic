package java2_day08;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
	public static void main(String[] args) {
		// 파일 객체 만들기
		// 파일 객체에 파일명만 써주면 해당 프로젝트 디렉터리가 설정되어있다
		// 절대 경로를 써주면 다른 폴더에도 접근 가능하다
//		/Users/jungwoo/Desktop/1530_java_dingyu/memo/java2_day7.txt
		
		File f = new File("test.txt");
		// 해당 파일이 없을 경우 자동으로 파일을 만들어 준다
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// 스트림 열기
			fw = new FileWriter(f, true); // true 는 뒤에 이어서 추가, false는 덮어쓰기
			// 버퍼 생성
			bw = new BufferedWriter(fw);
			// 사용
			
			//write()	줄바꿈을 포함 안한다
			bw.write("오늘은 15일입니다\n");
			bw.newLine(); //줄바꿈 해준다
			bw.write("내일 또 뵈요");
			
			//buffer 비워주기
			//문자열 출력해주기
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			// 버퍼 닫기
			// 스트림 닫기
			try {
				if(bw!=null) bw.close();
				if(fw!=null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
