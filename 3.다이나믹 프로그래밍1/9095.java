
import java.util.Scanner;



public class Main {

	static int arr[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int arr[]=new int[n];
		int dp[]=new int[12];
		
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		
		for(int j=4;j<=11;j++) {
			dp[j]=dp[j-1]+dp[j-2]+dp[j-3];
		}
		for(int i=0;i<n;i++) {
			
			arr[i]=scan.nextInt();
			arr[i]=dp[arr[i]];
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
