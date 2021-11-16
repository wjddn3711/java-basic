package java2_day08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) {
		// 파일 객체 만들기
		File f = new File("test.txt");
		FileReader fr = null;
		BufferedReader br = null;
		// 스트림 열어두기
		try {
			//Scanner sc  = new Scanner(f); 스캐너로도 입력받을 수 있다
			fr = new FileReader(f);
			// 버퍼 생성하기
			br = new BufferedReader(fr);
			// 파일 사용
			
			//readLine()	한줄을 단위로 가져온다 (버퍼가 없으면 문자하나씩만 받아올수 있음)
//			System.out.println(br.readLine()); //IOException오류 가능
//			System.out.println(br.readLine());
//			System.out.println(br.readLine()); 
//			System.out.println(br.readLine()); //더이상 읽을 줄이 없으면 null값을 가져온다
			
			String in = "";
			while((in = br.readLine())!=null)
			{
				System.out.println(in);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				// 버퍼 닫기
				if(br!=null) br.close();				
				// 스트림 닫기
				if(fr!=null) fr.close();				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
