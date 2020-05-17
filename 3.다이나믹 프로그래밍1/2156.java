
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Main {

	static int arr[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		int dp[]=new int[n];

		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		if(n>=1)
			dp[0]=arr[0];
		if (n>=2)
			dp[1]=arr[0]+arr[1];
		if(n>=3)
			dp[2]=Math.max(dp[1], Math.max(arr[0]+arr[2], arr[1]+arr[2]));
		
		for(int i=3;i<n;i++) {
			dp[i]=Math.max(dp[i-1], Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]));
		
		}
		System.out.println(dp[n-1]);
		
		

	}
	
}
