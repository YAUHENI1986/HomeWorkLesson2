package HW2;

//���������� ��������������� �������� k ���������� (n,m], [n,m), (n,m), [n,m]

public class Task4 {

	public static void main(String[] args) {
		int k = (int)(Math.random()*5);
		int n; //������ �������
		int m; //������� �������
		do {
			n = (int)(Math.random()*2);
			m = (int)(Math.random()*10);
		} while (n==m | n>m);
		if (k>=n && k<m) {
			System.out.println("����� " + k + " ����������� ��������� (" + n + ", " + m +"]");
		}
		if (k>n && k<=m) {
			System.out.println("����� " + k + " ����������� ��������� [" + n + ", " + m +")");
		}
		if (k>=n && k<=m) {
			System.out.println("����� " + k + " ����������� ��������� (" + n + ", " + m +")");
		}
		if (k>n && k<m) {
			System.out.println("����� " + k + " ����������� ��������� [" + n + ", " + m +"]");
		}
		if (k<n | k>m){
			System.out.println("����� " + k + " ������� �� ������� ��������� " + n + ", " + m);
		}
	}
}
