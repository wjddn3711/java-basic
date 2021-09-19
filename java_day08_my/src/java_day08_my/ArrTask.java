package java_day08_my;

import java.util.Scanner;

public class ArrTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		1. 동별 월세 수입 확인하기
//		2. 월세 설정
//		3. 총 수익 확인하기
//		4. 나가기
		int choice = 0;
		String men ="1. 동별 월세 수입 확인하기\n" + 
				"2. 월세 설정\n" + 
				"3. 총 수익 확인하기\n" + 
				"4. 동 별 월세 확인하기\n"+
				"5. 나가기";
		int [] sum = new int[2]; //동별 월세
		int mon =0; //총월세
		int[][]arr = new int[2][3]; 
		while(true)
		{
			System.out.println(men);
			choice = sc.nextInt();
			if(choice==5)
			{
				break;
			}
			else if(choice==1)
			{//동별 월세 수입 확인하기 
				//몇동 수입 확인하시겠습니까?
				//1동의 수입은 00만원입니다
				System.out.println("몇 동의 수입을 확인하시겠습니까? ");
				int i = sc.nextInt();
				System.out.printf("%d 동의 수입은 %d만원 입니다.\n",i,sum[i-1]);
			}
			else if(choice==2) 
			{//동별 월세 설정하기
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.printf("%d 동 %d 호 월세 설정: ",(i+1),(101+j));
						arr[i][j] = sc.nextInt();
						sum[i] += arr[i][j]; //동별 월세 저장
					}
				}
			}
			else if(choice==3) 
			{//총 수익 확인하기
				for (int i = 0; i < sum.length; i++) {
					mon += sum[i];
				}
				System.out.printf("총 수익은 : %d 만원 입니다.\n",mon);
			}
			else if(choice==4) 
			{// 동별 월세 확인하기
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.printf("%d 동 %d 호 월세 : %d\n",(i+1),(101+j),arr[i][j]);
					}
				}
			}
			else {
				System.out.println("1에서 4를 입력해주세요");
			}
			
		}
		
		
		
	}
}
