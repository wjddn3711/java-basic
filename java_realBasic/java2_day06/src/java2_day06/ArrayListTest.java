package java2_day06;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		System.out.println(names);
		ArrayList<Integer> numbers = new ArrayList<>();
		names.add("이정우");
		names.add("홍길동");
		
		
		
		
		
		
		numbers.add(100); //autoboxing
		numbers.add(200); 
		numbers.add(300);
//		numbers.add(new Integer(100)); //autoboxing이 안될때
		numbers.add(100); //순서도 있고 중복된 값도 넣어준다
		
		//get(인덱스 번호)		해당 인덱스번호에 해당하는 값을 가져와준다
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		
		//remove(인데스번호) 해당 인덱스 번호에 해당하는 값을 삭제한다
		numbers.remove(0);
		
		//add(인덱스번호, 값)	해당 인덱스번호에 값을 삽입해준다
		numbers.add(0, 100);
		
		
		System.out.println(numbers.toString());
	}
}
