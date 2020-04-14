import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=0,B=0;
		ArrayList list = new ArrayList();
		Scanner scan =new Scanner(System.in);
		while(true) {
			A = scan.nextInt();
			B = scan.nextInt();
			if((A==0)&&(B==0))
				break;
			list.add(A+B);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	
	}

}
