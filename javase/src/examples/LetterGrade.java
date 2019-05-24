//A: 90~100   B: 80~89   C: 70~79   D: 60~69   F: <60

package examples;

import java.io.*;

public class LetterGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.print("Input your score here: ");
			String s=br.readLine();
			int score=Integer.parseInt(s);
			
			if(score>100||score<0){
				System.out.println("Invalid input detected! ");
			}
			else{
				switch(score/10){
				case 10:
					System.out.println("A");
					break;
				case 9:
					System.out.println("A");
					break;
				case 8:
					System.out.println("B");
					break;
				case 7:
					System.out.println("C");
					break;
				case 6:
					System.out.println("D");
					break;
				default:
					System.out.println("F");
					break;
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
