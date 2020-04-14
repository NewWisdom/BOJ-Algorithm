import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=0,B=0;
		Scanner scan =new Scanner(System.in);
		while (scan.hasNextInt()) {
			A = scan.nextInt();
			B = scan.nextInt();
			System.out.println(A+B);
		}
	
	}

}
 
