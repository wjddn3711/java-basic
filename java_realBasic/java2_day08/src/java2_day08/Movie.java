package java2_day08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
	public static void main(String[] args) throws Exception{
		// 제목으로 영화 검색하기
		// 순위 : 0
		// 제목 : 000
		// 개봉일 : 0000
		// 순위로 영화 검색하기
		
		Scanner sc = new Scanner(System.in);
		File f = new File("movie.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String[]> movieList = new ArrayList<>();
		
		String in ="";
		String[] tableHeader = {"순위","제목","개봉일","수익","관객수","스크린수"};
		while((in = br.readLine()) != null)
		{
			//in에는 한줄 한줄씩 담겨져있음
			// split("\t") ""안에 있는 값을 기준으로 문자열을 분리시켜서 배열로 바꿔준다
			in.split("\t");
			movieList.add(in.split("\t"));
			
		}
		
		br.close();
		fr.close();
		
		
		System.out.println("1. 제목으로 영화 검색\n2. 순위로 영화 검색");
		String input = sc.nextLine();
		
		if(input.equals("1"))
		{
			System.out.println("영화 제목을 입력하세요");
			input = sc.nextLine();
			for (String[] m : movieList) {
				if(m[1].contains(input))
				{
					System.out.println("==============================");
					for (int i = 0; i < m.length; i++) {
						System.out.println(tableHeader[i]+" : "+m[i]);
					}
				}
				break;
			}
		}
		else if(input.equals("2"))
		{
			System.out.println("영화 순위를 입력하세요");
			input = sc.nextLine();
			
			String[] temp = movieList.get(Integer.parseInt(input)-1);
			for (int i = 0; i < temp.length; i++) {
				System.out.println(tableHeader[i]+" : "+temp[i]);
			}
//			for (String[] m : movieList) {
////				System.out.println("여기까지 들어옴");
////				System.out.println(m[0].equals(input));
//				if(m[0].equals(input))
//				{
//					System.out.println("==============================");
////					System.out.println("해당 순위의 영화는 "+m[1]);
//					for (int i = 0; i < m.length; i++) {
//						System.out.println(tableHeader[i]+" : "+m[i]);
//					}
//					break;
//					
//				}
//			}
		}
		
	}
}
