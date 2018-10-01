package HW2;

//определить принаджлежность значени€ k интервалам (n,m], [n,m), (n,m), [n,m]

public class Task4 {

	public static void main(String[] args) {
		int k = (int)(Math.random()*5);
		int n; //нижн€€ граница
		int m; //верхн€€ граница
		do {
			n = (int)(Math.random()*2);
			m = (int)(Math.random()*10);
		} while (n==m | n>m);
		if (k>=n && k<m) {
			System.out.println("„исло " + k + " принадлежит интервалу (" + n + ", " + m +"]");
		}
		if (k>n && k<=m) {
			System.out.println("„исло " + k + " принадлежит интервалу [" + n + ", " + m +")");
		}
		if (k>=n && k<=m) {
			System.out.println("„исло " + k + " принадлежит интервалу (" + n + ", " + m +")");
		}
		if (k>n && k<m) {
			System.out.println("„исло " + k + " принадлежит интервалу [" + n + ", " + m +"]");
		}
		if (k<n | k>m){
			System.out.println("„исло " + k + " выходит за пределы интервала " + n + ", " + m);
		}
	}
}
