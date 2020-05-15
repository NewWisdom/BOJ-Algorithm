
import java.util.Scanner;



public class Main {

	static int arr[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		long dp[][]=new long[91][2];
		
		dp[1][1]=1;
		
		for(int i=2;i<=n;i++) {
			for(int j=0;j<=1;j++) {
				if(j==0)
					dp[i][j]=dp[i-1][j]+dp[i-1][j+1];
				else
					dp[i][j]=dp[i-1][j-1];
			}
		}

		long sum=0;
		for(int i=0;i<2;i++) {
			sum+=dp[n][i];
		}
		System.out.println(sum);

	}
	
}
