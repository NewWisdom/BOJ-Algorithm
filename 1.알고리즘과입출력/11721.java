import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str=scan.next();
		int len=str.length()/10;
		String temp="";
		for (int i=0;i<len;i++) {
			temp=str.substring(i*10,i*10+10);
			System.out.println(temp);
		}
		temp=str.substring(len*10);
		System.out.println(temp);
	}

}
