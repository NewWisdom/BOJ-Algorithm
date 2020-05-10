
import java.util.Scanner;



public class Main {

	static int arr[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int arr[]=new int[1001];
		arr[1]=1;
		arr[2]=3;
		for(int i=3;i<=n;i++) {
			arr[i]=(arr[i-1]+(arr[i-2]*2))%10007;
		}
		System.out.println(arr[n]);
		
		
		
		

		

	}

}
