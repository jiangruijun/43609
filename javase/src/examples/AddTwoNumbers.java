package examples;

import java.io.*;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.print("Input your first number here: ");
			String s1=br.readLine();
			System.out.print("Input your second number here: ");
			String s2=br.readLine();
			
			float n1=Float.parseFloat(s1);
			float n2=Float.parseFloat(s2);			
			float sum=n1+n2;
			
			System.out.println("Result: "+sum);			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
