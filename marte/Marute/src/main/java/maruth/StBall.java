package maruth;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class StBall {

	public static void main(String[] args) {
		
		int num1000 = (int)(Math.random()*8)+1;
		int num100 = (int)(Math.random()*8)+1;
		int num10 = (int)(Math.random()*8)+1;
		int num1 = (int)(Math.random()*8)+1;
		int st = num1000*1000+num100*100+num10*10+num1;
		System.out.println(st);
int n;
int n1000;
int n100;
int n10;
int n1;
for(int i = 0;i<5;i++) {
	Scanner sc= new Scanner(System.in);
	System.out.println("숫자를 입력해 주세요");
	int[] star= {num1000,num100,num10,num1};
 n = sc.nextInt();
 n1000 = n/1000;
 n100 = n/100-n1000*10;
 n10 = n/10-(n/100)*10;
 n1 = n-(n/10)*10;
 int[] nstr = {n1000,n100,n10,n1};
if(n==st) {
	System.out.println("숫자일치");
	break;
}
for(int z = 0 ; z<star.length; z++) {
	for(int x =0 ; x<nstr.length; x++) {
		if(star[z]==nstr[x]) {
			if(z == x) {
				System.out.println("Strike");
			}else {
				System.out.println("Ball");
			}
		}
	}
	
	 
}

 }
System.out.println("종료");
	}
}