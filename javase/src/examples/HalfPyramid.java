/*
 * *
 * **
 * ***
 * ****
 * *****
 */

package examples;

import java.io.*;

public class HalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.print("How many rows do you want? Input a number: ");
			String s=br.readLine();
			int numberOfRows=Integer.parseInt(s);
			
			if(numberOfRows>=0){
				for(int i=1;i<=numberOfRows;i++){
					for(int j=1;j<=i;j++){
						System.out.print("*");
					}
					System.out.println();
				}
			}
			else{
				System.out.println("Invalid input detected! ");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
