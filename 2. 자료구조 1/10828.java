import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int cnt=scan.nextInt();
		Stack<Integer> stack=new Stack();

		
		for(int i=0;i<cnt;i++) {
			String str=scan.next();
			switch(str) {
				case "pop":
					System.out.println(stack.isEmpty()?-1:stack.pop());break;
				case "size":
					System.out.println(stack.size());break;
				case "empty":
					System.out.println(stack.isEmpty()?1:0);break;
				case "top":
					System.out.println(stack.isEmpty()?-1:stack.peek());break;
				default:
					stack.push(scan.nextInt());break;
			}
		}
		
	}

}
