import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Queue queue =new LinkedList();
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("<");
		for(int i=1;i<=n;i++) {
			queue.offer(i);
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<k;j++) {
				queue.offer(queue.poll());
			}
			System.out.print(queue.poll()+", ");
		}
		System.out.print(queue.poll());
		System.out.print(">");
		
		
		
	}

}
