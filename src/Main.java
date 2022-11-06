
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// Rock-Scissors-Paper Game
		
		
		// Array with 3 items-choices
		String [] choices = {"✊","✌️", "✋"};
		
		
		// score user
		int countUser = 0;
		
		// score comp
		int countComp = 0;
		
		// player
		String player;
		
		// user's input index
		int inputIndex;
		

		JOptionPane.showMessageDialog(null, "Hello, lets play Scissors, Paper, Rock game.");
		
		player = JOptionPane.showInputDialog("What is your name?");
		
		int numberOfGames = 0;
		
		while (numberOfGames < 4) {
			
			//index to get an item from an array
			int index = (int) (Math.random() * 3); 
			//computers choice
			String compChoice = choices[index];
			
			// user's choice
			inputIndex = Integer.parseInt(JOptionPane.showInputDialog("Choose: 0-Rock, 1-Scissors, 2-Paper"));
			
			
			//inputIndex = scan.nextInt();
			String userChoice = choices[inputIndex];
			
			
			if (compChoice == userChoice ) {
				JOptionPane.showMessageDialog(null, "It's a tie. " + "Computer: " + compChoice + ": "+player +": " + userChoice);

			} 
			
			else if(compChoice == "✊" &&  userChoice == "✌️") {
				JOptionPane.showMessageDialog(null, "Computer won. " + "Computer: " + compChoice + ": "+player +": " + userChoice);
				
				countComp++;
	
				} 
			else if(compChoice == "✋" && userChoice == "✊") {
				JOptionPane.showMessageDialog(null, "Computer won. "+ "Computer: " + compChoice + ": "+player +": " + userChoice );
			
				countComp++;
			} else if(compChoice == "✌️" && userChoice == "✋") {
				JOptionPane.showMessageDialog(null, "Computer won. " + "Computer: " + compChoice + ": "+player +": " + userChoice);
							
				countComp++;		
			}
			else {
				JOptionPane.showMessageDialog(null, player +" won. " + "Computer: " + compChoice + ": "+player + ": " + userChoice);
		
				countUser++;
			}
			numberOfGames++;
		}
		
		
		if (countComp > countUser) {
			JOptionPane.showMessageDialog(null, "Computer won with the score: " + countComp + " : "+countUser);
		} else if (countComp < countUser){
			JOptionPane.showMessageDialog(null, player + " won with the score: " + countUser + " : "+countComp);
		}else {
			JOptionPane.showMessageDialog(null, "It's a tie: " + countComp + " : " + countUser);
		}
			
		JOptionPane.showMessageDialog(null, player + " good bye!");
	}

}
