import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.text.html.HTMLDocument.Iterator;


public class Main {

	static int arr[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		arr=new int[n+1];
		arr[0]=0;
		arr[1]=0;

		
		for(int i=2;i<=n;i++) {
			arr[i]=arr[i-1]+1;
			if(i%2==0)
				arr[i]=arr[i]<arr[i/2]+1?arr[i]:arr[i/2]+1;
			if(i%3==0)
				arr[i]=arr[i]<arr[i/3]+1?arr[i]:arr[i/3]+1;
		}
		System.out.println(arr[n]);
		
		

		

	}

}
