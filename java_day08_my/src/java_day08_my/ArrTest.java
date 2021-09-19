package java_day08_my;

public class ArrTest {
	public static void main(String[] args) {
		int []ar = {10,20,30};
		int []ar2 = {100,200,300};
//		System.out.println(ar[0]);
		
		int[]ar3 = new int[3];
		int[][]arr2 = new int[3][3];
		
		//	10	20	30	
		//	40	50	60
		int count=0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				count++;
				arr2[i][j]=count*10;
			}
		}
		
		for (int is : arr2[0]) {
			System.out.println(is);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int [][]arr = {{10,20,30},{100,200,300}};
//		//{{30,40,50},{300,400,500}}
//		
//		for (int j = 0; j < 2; j++) {
//			
//			for (int i = 0; i < 3; i++) {
//				if(j==0)
//				{
//					arr[j][i]=(i+3)*10;					
//				}
//				else
//				{
//					arr[j][i]=(i+3)*100;					
//					
//				}
//			}
//		}
//		
//		for (int is : arr[1]) {
//			System.out.println(is);
//		}
		
//		arr[0][0]=30;
//		
//		int []ara = {30,40,50};
//		int []arb = {300,400,500};
//		arr[0] = ara;
//		arr[1] = arb;
		
		
		
		
	}
	
}
