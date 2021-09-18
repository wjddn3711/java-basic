package java2_day08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {
		//Writer 
		// 파일 만들기 (task.txt)
		// 안녕하세요
		// 반갑습니다
		// 오늘은 목요일 입니다
		File f = new File("task.txt");
//		FileWriter fw = null;
//		BufferedWriter bw = null;
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("안녕하세요");
		bw.newLine();
		bw.write("반갑습니다");
		bw.newLine();
		bw.write("오늘은 목요일 입니다");
		
		bw.close();
		fw.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String in="";
		while((in = br.readLine())!=null)
		{
			System.out.println();
		}
		
		
//		try {
//			fw = new FileWriter(f);
//			bw = new BufferedWriter(fw);
//			
//			bw.write("안녕하세요");
//			bw.newLine(); //줄바꿈 해준다
//			bw.write("반갑습니다");
//			bw.newLine();
//			bw.write("오늘은 목요일 입니다");
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally
//		{
//			try {
//				if(fw!=null) fw.close();
//				if(bw!=null) bw.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		FileReader fr = null;
//		BufferedWrit
		
		// Reader
		// 읽어오기
		// 콘솔창에 출력
	}
}
