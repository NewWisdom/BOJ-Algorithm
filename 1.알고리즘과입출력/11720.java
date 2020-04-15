import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N,sum=0;
		Scanner scan = new Scanner(System.in);
		N=scan.nextInt();
		String str=scan.next();
		int number=0;
		String[] temp=str.split("");
		for (int i=0;i<N;i++) {
			number=Integer.parseInt(temp[i]);
			sum+=number;
		}
		System.out.println(sum);
	}

}
