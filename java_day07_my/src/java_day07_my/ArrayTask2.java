package java_day07_my;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//배열에 담긴 값중 최댓값 찾기	
//		int[]ar = {80,20,65,90,100};
//		int max = ar[0];
//		for (int i = 1; i < ar.length; i++) {
//			if(max < ar[i])
//			{
//				max = ar[i];
//			}
//			System.out.println(i+"번째 반복의 max값: "+max);
//		}
//		System.out.println(max);
		
		
		// 	1.배열에 담긴 값중 최솟값 찾기
		// {10, 82, 65, 14, 23}
//		int [] ar = {10, 82, 65, 14, 23};
//		int min = ar[0];
//		for (int i = 1; i < ar.length; i++) {
//			if(min>ar[i])
//			{
//				min = ar[i];
//			}
//		}
//		System.out.println(min);
		
		
		//	2. 배열에 담긴 값들의 총합 구하기
				// {10, 85, 15, 3, 6}
//		int [] ar = {10,85,15,3,6};
//		int sum =0;
//		for (int i = 0; i < ar.length; i++) {
//			sum += ar[i];
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println("\n"+sum);
		
		//	3. 배열을 작은 수부터 큰수까지 순서대로 정렬하기
		//	10, 30, 15, 89, 52
		int [] ar = {10, 30, 15, 89, 52};
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]>ar[j])
				{
					ar[j]=temp;
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int temp =0;
//		for (int i = 1; i < ar.length; i++) {
//			for (int j = i+1; j < ar.length; j++) {
//				if(ar[i] > ar[j]) {
//					//자리를 바꿔준다
//					temp = ar[i];
//					ar[i]= ar[j];
//					ar[j]= temp;
//				}
//			}
//		}	
//		for (int i : ar) {
//			System.out.println(i);
//		}
		
	}
}
