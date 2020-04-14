import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner scan =new Scanner(System.in);
		num=scan.nextInt();
		int A[]=new int[num];
		int B[]=new int[num];
		for(int i=0;i<num;i++) {
			A[i]=scan.nextInt();
			B[i]=scan.nextInt();
		}
		for (int i=0;i<A.length;i++) {
			System.out.println("Case #"+(i+1)+": "+A[i]+" + "+B[i]+" = "+(A[i]+B[i]));
		}
		
	
	}

}
