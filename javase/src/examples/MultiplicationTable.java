/*
 * 1*1=1;    
 * 1*2=2;    2*2=4;    
 * 1*3=3;    2*3=6;    3*3=9;    
 * 1*4=4;    2*4=8;    3*4=12;   4*4=16;   
 * 1*5=5;    2*5=10;   3*5=15;   4*5=20;   5*5=25;   
 * 1*6=6;    2*6=12;   3*6=18;   4*6=24;   5*6=30;   6*6=36;   
 * 1*7=7;    2*7=14;   3*7=21;   4*7=28;   5*7=35;   6*7=42;   7*7=49;   
 * 1*8=8;    2*8=16;   3*8=24;   4*8=32;   5*8=40;   6*8=48;   7*8=56;   8*8=64;   
 * 1*9=9;    2*9=18;   3*9=27;   4*9=36;   5*9=45;   6*9=54;   7*9=63;   8*9=72;   9*9=81;   
 */

package examples;

import java.io.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.print("Input a number from 1 to 9: ");
			String s=br.readLine();
			int n=Integer.parseInt(s);
			
			PrintMultiplicationTable pmt=new PrintMultiplicationTable();
			pmt.printMultiplicationTable(n);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}

class PrintMultiplicationTable{
	public void printMultiplicationTable(int number){
		if(number<1||number>9){
			System.out.println("Invalid input detected! ");
		}
		else{
			for(int i=1;i<=number;i++){
				for(int j=1;j<=i;j++){
					if(j*i>=10){
						System.out.print(+j+"*"+i+"="+(j*i)+";   ");
					}
					else{
						System.out.print(+j+"*"+i+"="+(j*i)+";    ");
					}
				}
				System.out.println();
			}
		}
	}
}
