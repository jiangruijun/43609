package examples;

import java.io.*;

public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.print("Input your dividend: ");
			String s1=br.readLine();
			System.out.print("Input your divisor: ");
			String s2=br.readLine();
			
			int d1=Integer.parseInt(s1);
			int d2=Integer.parseInt(s2);
			int q=d1/d2;
			int r=d1%d2;
			
			if(r==0){
				System.out.println("Divisible! ");
				System.out.println("Quotient: "+q+"   Remainder: "+r);
			}
			else{
				System.out.println("Indivisible! ");
				System.out.println("Quotient: "+q+"   Remainder: "+r);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
