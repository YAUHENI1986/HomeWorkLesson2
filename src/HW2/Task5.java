package HW2;

import java.util.Scanner;

// вывести число от 1 до k в виде матрицы NxN слева направо и сверхувниз

public class Task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int x;
		System.out.println("Введите целое число от 1 до ...");
		x = scan.nextInt();
		int M[][];
		int K = 0; // количество чисел
		int N = 1 ; // размер матрицы 
		scan.close();
		
		if (x>1) {
			for (int i = 0; i<x; i++) {
				K++;			
			}
		}
		int z;
		do {
			N++;
			z = N*N;
		} while (z<K);
		M = new int [N][N];
		int start = 1;
		for (int i = 0; i<N; i++) {
			for (int i2 = 0; i2<N; i2++) {
				if (start<=K) {
					M[i][i2] = start++;
				}
			}
		}
		for (int i = 0; i<N; i++) {
			for (int i2 = 0; i2<N; i2++) {
				System.out.print(M[i][i2]);
			}
			System.out.println();
		}
	}
}
