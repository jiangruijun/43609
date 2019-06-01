package examples;

import java.io.*;

public class SignInGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			int i=1;
			while(i==1){
				System.out.print("Enter your name to join the game: ");
				String s=br.readLine();
				JoinGame jg=new JoinGame(s);
				jg.joinGame();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}

class JoinGame{
	String playerName;
	static int currentPlayer=0;
	
	public JoinGame(String playerName){
		this.playerName=playerName;
	}
	
	public void joinGame(){
		currentPlayer++;
		System.out.println(this.playerName+" has been joined the game. "+" Current Player: "+currentPlayer);
	}
}