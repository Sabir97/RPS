import java.util.Scanner;

public class RPS{

	public static void main(String[] args){
		char mv1 = 'a';
		char mv2 ='b';
		System.out.println("Press Ctrl + C to exit Game Loop.");
		Scanner scanner = new Scanner(System.in);
		while(true){
				System.out.println("");
				System.out.println("Player 1 Choose A Move :");
				mv1 = scanner.next().charAt(0);
			if(mv1 != 'r' && mv1!= 's' && mv1!= 'p'){
			System.out.println("Wrong Move !");
			continue;
			}
		System.out.println("Player 2 Choose A Move :");
		mv2 = scanner.next().charAt(0);
		if(mv2!='r' && mv2 != 's' && mv2 != 'p'){
		System.out.println("Wrong Move !");
		continue;
		}
		String combination = "";
		combination = combination + mv1 + mv2;
		switch(combination){
			case "rs":
			System.out.println("Player 1 wins !");
			break;

			case "rp":
			System.out.println("P1 wins !");
			break;

			case "rr":
			System.out.println("Draw !");
			break;

			case "sr":
			System.out.println("P2 wins !");
			break;

			case "sp":
			System.out.println("P1 wins !");
			break;

			case "ss":
			System.out.println("Draw !");
			break;

			case "pr":
			System.out.println("P1 wins !");
			break;

			case "ps":
			System.out.println("P2 wins !");
			break;

			case "pp":
			System.out.println("Draw !");
			break;
		}
		}
		//RPS game = new RPS();
		//game.winner(1,2);
	}
}