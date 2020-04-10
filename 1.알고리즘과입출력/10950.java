import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int A=0,B=0;
		Scanner scan =new Scanner(System.in);
		num =scan.nextInt();
		int arr[]=new int[num];
		for (int i=0;i<num;i++) {
			A = scan.nextInt();
			B = scan.nextInt();
			arr[i]=A+B;
		}
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]);
		}

	}

}
