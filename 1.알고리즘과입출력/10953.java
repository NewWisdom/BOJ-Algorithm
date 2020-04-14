import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		int num=0;
		int A,B=0;
		Scanner scan =new Scanner(System.in);
		num=scan.nextInt();
		int sum[]=new int[num];
		for(int i=0;i<num;i++) {
			str=scan.next();
			String temp[] =str.split(",");
			A=Integer.parseInt(temp[0]);
			B=Integer.parseInt(temp[1]);
			sum[i]=A+B;
		}
		for (int i=0;i<sum.length;i++) {
			System.out.println(sum[i]);
		}
		
	
	}

}
