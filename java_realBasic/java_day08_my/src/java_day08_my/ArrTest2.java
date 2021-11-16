package java_day08_my;

public class ArrTest2 {
	public static void main(String[] args) {
		int[][]arr= {{10},{100,200},{50,60,70}};
		
		int [][]arr2= new int[3][];		
		arr2[0] =new int[2];
		arr2[1]= new int[3];
		arr2[2]= new int[5];
		System.out.println(arr[0][0]); //10
		System.out.println(arr[1][0]); //100
		System.out.println(arr[2][0]); //50
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
