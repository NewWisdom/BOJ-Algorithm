import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
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

		Deque<String> deque=new LinkedList<String>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int cnt=Integer.parseInt(br.readLine());
		for(int i=0;i<cnt;i++) {
			String str=br.readLine();
			if(str.contains("push_front")) {
				StringTokenizer st =new StringTokenizer(str," ");
				st.nextToken();
				deque.addFirst(st.nextToken());
			}else if(str.contains("push_back")) {
				StringTokenizer st =new StringTokenizer(str," ");
				st.nextToken();
				deque.add(st.nextToken());
			}else if(str.contains("pop_front")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.pop());
				}
			}else if(str.contains("pop_back")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.removeLast());
				}
			}else if(str.equals("size")) {
				System.out.println(deque.size());
			}else if(str.equals("empty")) {
				if(deque.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(str.equals("front")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.peek());
				}
			}else if(str.equals("back")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(deque.peekLast());
				}
			}
		}
	}

}
