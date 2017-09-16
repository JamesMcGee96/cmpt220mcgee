package driver_proj0.java;
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		//Rndm for comp
		int computer = (int)(Math.random() * 3);

		// prompt user 0, 1, or 2
		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = input.nextInt();

		System.out.print("The computer is ");
		switch (computer)
		{
			case 0: System.out.print("scissor."); break;
			case 1: System.out.print("rock."); break;
			case 2: System.out.print("paper.");
		}

		System.out.print(" You are ");
		switch (user)
		{
			case 0: System.out.print("scissor"); break;
			case 1: System.out.print("rock"); break;
			case 2: System.out.print("paper ");
		}

		if (computer == user)
			System.out.println(" too. It is a draw");
		else
		{
			boolean win = (user == 0 && computer == 2) ||
							  (user == 1 && computer == 0) || 
							  (user == 2 && computer == 1);
			if (win)
				System.out.println(". You won");
			else
				System.out.println(". You lose");
		}
	}

}
