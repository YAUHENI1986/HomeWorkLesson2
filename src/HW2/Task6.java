package HW2;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner mess = new Scanner (System.in);
		System.out.println("������� ����� ������");
		int M = mess.nextInt();
		mess.close();
		int mount = M;
		System.out.print("�� ������� ");
		switch (mount) {
		case (1): {System.out.println("������");
			break;
		}
		case (2): {
			System.out.println("�������");
			break;
		}
		case (3): {
			System.out.println("����");
			break;
		}
		case (4): {
			System.out.println("������");
			break;
		}
		case (5): {
			System.out.println("���");
			break;
		}
		case (6): {
			System.out.println("����");
			break;
		}
		case (7): {
			System.out.println("����");
			break;
		}
		case (8): {
			System.out.println("������");
			break;
		}
		case (9): {
			System.out.println("��������");
			break;
		}
		case (10): {
			System.out.println("�������");
			break;
		}
		case (11): {
			System.out.println("������");
			break;
		}
		case (12): {
			System.out.println("�������");
			break;
		}
		default: {
			System.out.println("�� ������������ �����");
		}
		}
		
		
		
	}

}
