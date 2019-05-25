/*
 *     *
 *    * *
 *   *   *
 *  *     *
 * *********
 */

package examples;

import java.io.*;

public class HollowPyramid {

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
					for(int j=1;j<=numberOfRows-i;j++){
						System.out.print(" ");
					}
					for(int k=1;k<=2*i-1;k++){
						if(i==1||i==numberOfRows){
							System.out.print("*");
						}
						else if(k==1||k==2*i-1){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
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
