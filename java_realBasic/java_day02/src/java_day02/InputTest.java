package java_day02;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		// �Է��� �������� Scanner�� �˷�����Ѵ�
		//Scanner �Է� �� ctrl+space import�ڵ����� ���ֱ�
		Scanner sc = new Scanner(System.in);
		//���� ���� �Է����ּ����� ���� ���(�ٹٲ� ����)
		System.out.print("����� �Է����ּ��� : ");
		// nextInt()�� �Ἥ int Ÿ������ �Է¹ޱ� kor��� ������ ����ֱ�
		int kor = sc.nextInt();
		//���� ���� �Է����ּ����� ���� ���(�ٹٲ� ����)
		System.out.print("���м��� �Է����ּ��� :");
		// nextInt()�� �Ἥ int Ÿ������ �Է¹ް� math��� ������ ����ֱ�
		int math = sc.nextInt();
		
		//�հ踦 ����� total ������� 
		int total = math+kor;
		//����� ����� avg ������� 2.0���� �� ����
		double avg = (math + kor)/2.0;
		
		
		System.out.println("\n������� "+kor+"�Դϴ�");
		System.out.println("���м����� "+math+"�Դϴ�");
		System.out.println("������ "+total+"�Դϴ�");
		//����� 60.00�Դϴ� ����ϱ�
		System.out.printf("����� %.2f�Դϴ�", avg);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
