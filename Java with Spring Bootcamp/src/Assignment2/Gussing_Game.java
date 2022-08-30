package Assignment2;




import java.util.*;

class Guesser{
	int guserNum;
	public int gusserNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser Plz enter the number");
		guserNum = scan.nextInt();
		return guserNum;
	}
}

class Player{
	int guserNum;
	public int gusserNumber() {
		Scanner sc = new Scanner(System.in);
		guserNum = sc.nextInt();
		return guserNum;
	}
}

public class Gussing_Game {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Get Ready to Play !!");
		System.out.println("====================================================");
		
		//Guesser Details
		Guesser g = new Guesser();
		int gusNum = g.gusserNumber();
		
		//Player 1 Details
		System.out.println("Player 1 please enter your name and number");
		String p1Name = sc.nextLine();
		Player p1 = new Player();
		int player1 = p1.gusserNumber();
		
		//Player 2 Details
		System.out.println("Player 2 please enter your name and number");
		String p2Name = sc.nextLine();
		Player p2 = new Player();
		int player2 = p2.gusserNumber();
		
		//Player 3 Details
		System.out.println("Player 3 please enter your name and number");
		String p3Name = sc.nextLine();
		Player p3 = new Player();
		int player3 = p3.gusserNumber();
		
		//Participant Details
		System.out.println("====================================================");
		System.out.println("Gusser:" + gusNum +"\n\tPlayer1 : "+p1Name+" : "+ player1 +"\n\tPlayer2 : "+p2Name +" : "+ player2 +"\n\tPlayer3 : "+p3Name+" : "+player3);
		
		
		if(gusNum != player1) 
		{
			// Player 1 does not match
			if (gusNum != player2) 
			{
				//Player 1 & Player 2 doesn't match 
				if (gusNum != player3)
						System.out.println("Lost the Match");
				else
					System.out.println(p3Name+"!! you won the match");
			}
			else
			{
				//Player 1 does not match but Player 2 match
				if (gusNum != player3)
					System.out.println( p2Name+"!! you won the match");
				else
					System.out.println(p2Name+" & "+p3Name+" won the match");
			}
		}
		else 
		{
			//Player 1 matches
			if(gusNum == player2) 
			{
				// Player 1 & Player 2 match.
				if(gusNum == player3)
					System.out.println("Hurray! All guessed it right.");
				else
					System.out.println(p1Name+" & "+p2Name+" won the match");
			}
			// Player 2 doesn't match
			else {
				if(gusNum == player3)
					System.out.println(p1Name+" & "+p3Name+" won the match");
				else
					System.out.println(p1Name+ "!! you won the match");
			}
				
		}	
	}
}
