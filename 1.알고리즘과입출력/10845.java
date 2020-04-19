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

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Queue<Integer> queue =new LinkedList();
		int input=0;
		
		for(int i=0;i<n;i++) {
			String str=br.readLine();
			if(str.equals("pop")) {
				if(queue.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(queue.poll());
				}
			}else if(str.equals("size")) {
				System.out.println(queue.size());
			}else if(str.equals("empty")) {
				if(queue.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}else if(str.equals("front")) {
				if(queue.isEmpty())
					System.out.println(-1);
				else {
					System.out.println(queue.element());
				}
			}else if(str.equals("back")) {
				if(queue.isEmpty())
					System.out.println(-1);
				else {
					System.out.println(input);
				}
			}else {
				StringTokenizer st = new StringTokenizer(str);
				String a=st.nextToken();
				input=Integer.parseInt(st.nextToken());
				queue.add(input);
				
			}
			
		}

		
	}

}
