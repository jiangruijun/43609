/*
 *   *
 *  ***
 * *****
 *  ***
 *   *
 */

package examples;

import java.io.*;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.print("How many rows do you want? Input an odd number: ");
			String s=br.readLine();
			int numberOfRows=Integer.parseInt(s);
			
			if(numberOfRows<0||numberOfRows%2==0){
				System.out.println("Invalid input detected! ");
			}
			else{
				for(int i=1;i<=numberOfRows;i++){
					if(i<=(numberOfRows+1)/2){
						for(int j=1;j<=(numberOfRows+1)/2-i;j++){
							System.out.print(" ");
						}
						for(int k=1;k<=2*i-1;k++){
							System.out.print("*");
						}
					}
					else{
						for(int j=1;j<=i-(numberOfRows+1)/2;j++){
							System.out.print(" ");
						}
						for(int k=1;k<=-2*i+2*numberOfRows+1;k++){
							System.out.print("*");
						}
					}
					System.out.println();
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
