package examples;

import java.io.*;

public class NumericComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.print("Input your first number: ");
			String s1=br.readLine();
			System.out.print("Input your second number: ");
			String s2=br.readLine();
			
			float n1=Float.parseFloat(s1);
			float n2=Float.parseFloat(s2);
			
			if(n1>n2){
				System.out.println("The first number is bigger. ");
			}
			else if(n1<n2){
				System.out.println("The second number is bigger. ");
			}
			else{
				System.out.println("The numbers are equal. ");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
