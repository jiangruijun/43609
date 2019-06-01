package examples;

public class JoinGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamePlayer gp1=new GamePlayer("P1");
		gp1.joinGame();
		GamePlayer gp2=new GamePlayer("P2");
		gp2.joinGame();
	}

}

class GamePlayer{
	String playerName;
	static int currentPlayer=0;
	
	public GamePlayer(String playerName){
		this.playerName=playerName;
	}
	
	public void joinGame(){
		currentPlayer++;
		System.out.println(this.playerName+" has been joined the game. "+" Current Player: "+currentPlayer);
	}
}