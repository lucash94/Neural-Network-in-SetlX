import java.util.Random;
import Jama.*; 

public class Jama_Timing
{ 
	public static void main(String [] args)
	{
		double[][] array = new double[1000][1000];
		for(int i=0; i<1000; i++) {
			for(int j=0; j<1000; j++) {
				array[i][j] = new Random().nextInt();
			}
		}
		Matrix M = new Matrix(array);

		long sum = 0;
		System.out.println("Matrizen-Multiplikation:");
		for(int i=0; i<10;i++) {
			long startTime = System.currentTimeMillis();
			Matrix Res = M.times(M);
			long endTime = System.currentTimeMillis() - startTime;
			System.out.println((i+1) + ".Runde:\t" + endTime + "ms");
			sum += endTime;
		}

		System.out.println("Durchschnitt:\t" + sum/10 + "ms");
	}
}