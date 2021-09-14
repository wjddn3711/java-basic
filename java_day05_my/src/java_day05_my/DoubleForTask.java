package java_day05_my;

public class DoubleForTask {
	public static void main(String[] args) {
		
//1		*        
//2		**
//3		***
//4		****
//5		*****
	
		
//		*****
//		****
//		***
//		**
//		*
		
		for(int i=0; i<5; i++)
		{
			int k= 5-i;
			for(int j=0; j<k; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=0; i<5; i++)
//		{
//			for(int j=0; j<i+1 ; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
