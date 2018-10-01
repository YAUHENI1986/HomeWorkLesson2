package HW2;

// дан массив А, 20 полож и отриц элементов. Сформировать массив В из полож элементов А, имеющих четный индекс. Найти сумму квадратов нового массива

public class Task3 {

	public static void main(String[] args) {
		double A[] = new double[] {-1.49, 0.5, -4.70, -1.08, -4.95, 1.14, -2.46, 2.61, -3.14, 4.35, 0.52, 1.24, 4.29, -2.39, -3.95, -4.91, -4.35, 3.60, 2.50, -0.21};
		double B[];
		int j = 0;
		double summ = 0;
		for (int i=0; i<A.length; i+=2) {
			if (A[i]>0) {
				j++;
			}
		}
		B = new double [j];
		j = 0;
		for (int i=0; i<A.length; i+=2) {
			if (A[i]>0) {
				B[j]= A[i];
				j++;
			}
		}
		
		for (int i = 0; i<B.length; i++) {
            System.out.print(B[i] + " ");
        }
		for (int i = 0; i<B.length; i++) {
			summ+=B[i]*B[i];
		}
		System.out.print(summ);
	}

}
