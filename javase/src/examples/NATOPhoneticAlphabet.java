package examples;

import java.io.*;

public class NATOPhoneticAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.print("Input a letter here: ");
			String s=br.readLine();
			
			switch(s){
			case "a":
				System.out.println("Alfa");
				break;	
			case "A":
				System.out.println("Alfa");
				break;
			case "b":
				System.out.println("Bravo");
				break;
			case "B":
				System.out.println("Bravo");
				break;
			case "c":
				System.out.println("Charlie");
				break;
			case "C":
				System.out.println("Charlie");
				break;
			case "d":
				System.out.println("Delta");
				break;
			case "D":
				System.out.println("Delta");
				break;	
			case "e":
				System.out.println("Echo");
				break;	
			case "E":
				System.out.println("Echo");
				break;
			case "f":
				System.out.println("Foxtrot");
				break;
			case "F":
				System.out.println("Foxtrot");
				break;
			case "g":
				System.out.println("Golf");
				break;
			case "G":
				System.out.println("Golf");
				break;
			case "h":
				System.out.println("Hotel");
				break;
			case "H":
				System.out.println("Hotel");
				break;	
			case "i":
				System.out.println("India");
				break;	
			case "I":
				System.out.println("India");
				break;
			case "j":
				System.out.println("Juliett");
				break;
			case "J":
				System.out.println("Juliett");
				break;
			case "k":
				System.out.println("Kilo");
				break;
			case "K":
				System.out.println("Kilo");
				break;
			case "l":
				System.out.println("Lima");
				break;
			case "L":
				System.out.println("Lima");
				break;
			case "m":
				System.out.println("Mike");
				break;
			case "M":
				System.out.println("Mike");
				break;
			case "n":
				System.out.println("November");
				break;
			case "N":
				System.out.println("November");
				break;
			case "o":
				System.out.println("Oscar");
				break;
			case "O":
				System.out.println("Oscar");
				break;
			case "p":
				System.out.println("Papa");
				break;
			case "P":
				System.out.println("Papa");
				break;
			case "q":
				System.out.println("Quebec");
				break;
			case "Q":
				System.out.println("Quebec");
				break;
			case "r":
				System.out.println("Romeo");
				break;
			case "R":
				System.out.println("Romeo");
				break;
			case "s":
				System.out.println("Sierra");
				break;
			case "S":
				System.out.println("Sierra");
				break;	
			case "t":
				System.out.println("Tango");
				break;
			case "T":
				System.out.println("Tango");
				break;
			case "u":
				System.out.println("Uniform");
				break;
			case "U":
				System.out.println("Uniform");
				break;
			case "v":
				System.out.println("Victor");
				break;
			case "V":
				System.out.println("Victor");
				break;
			case "w":
				System.out.println("Whiskey");
				break;
			case "W":
				System.out.println("Whiskey");
				break;
			case "x":
				System.out.println("Xray");
				break;
			case "X":
				System.out.println("Xray");
				break;
			case "y":
				System.out.println("Yankee");
				break;
			case "Y":
				System.out.println("Yankee");
				break;
			case "z":
				System.out.println("Zulu");
				break;
			case "Z":
				System.out.println("Zulu");
				break;
			default:
				System.out.println("Invalid input detected! ");
				break;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
