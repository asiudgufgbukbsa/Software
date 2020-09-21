package class3;

import java.util.Random;
import java.util.Scanner;



public class MaxValue {

	public static void main(String[] args) {
		int num = 100;
		double[] scores = new double[num];
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();		
		for (int i = 0,j =0; i < scores.length; i++) {			
			scores[i] = random.nextDouble() * 100;
		}
		
		for (double i : scores) {
			System.out.println(i);
		}
		
		double max = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] > max)
				max= scores[i];
		}
		System.out.println(max);

	}

}
