import javax.swing.JOptionPane;

public class Game {
	// Array with 3 items-choices
	String [] choices = {"✊","✌️", "✋"};
	
	// user's input index
	//int inputIndex;
	
	String player;
	int numberOfGames;
	
	public Game() {
		player= "Random User";
		numberOfGames = 3;
	}
	
	public void greet() {
		JOptionPane.showMessageDialog(null, "Hello, lets play Scissors, Paper, Rock game.");
		
		player = JOptionPane.showInputDialog("What is your name?");
		
		numberOfGames = checkInput("How many games would you like to play?", 99);
	}
	
	public int checkInput(String message, int maxInput) {
		while(true) {
			try {
			// user's choice
				int number = Integer.parseInt(JOptionPane.showInputDialog(message));
				
				if (number >= 1 && number <= maxInput) {
					return number;
				}
			
				JOptionPane.showMessageDialog(null, "Incorrect input, out of range");
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Incorrect input.");
			}
		}
		
	}
	
	public void run() {
	
				
			// score user
			int countUser = 0;
			
			// score comp
			int countComp = 0;
						
			// user's input index
			//int inputIndex;
			
			int i = 0;
			
			while (i < numberOfGames) {
				
				//index to get an item from an array
				int index = (int) (Math.random() * 3); 
				//computers choice
				String compChoice = choices[index];
				
				// user's choice
				//inputIndex = Integer.parseInt(JOptionPane.showInputDialog("Choose: 0-Rock, 1-Scissors, 2-Paper"));
				
			
				//inputIndex = scan.nextInt();
				String userChoice = choices[checkInput("Choose: 1-Rock, 2-Scissors, 3-Paper", 3)-1];
						
				if (compChoice == userChoice ) {
					JOptionPane.showMessageDialog(null, "It's a tie. " + "Computer: " + compChoice + "  "+player +": " + userChoice);
				} 
				
				else if(compChoice == "✊" &&  userChoice == "✌️") {
					JOptionPane.showMessageDialog(null, "Computer won. " + "Computer: " + compChoice + "  "+player +": " + userChoice);			
					countComp++;
					} 
		
				else if(compChoice == "✋" && userChoice == "✊") {
					JOptionPane.showMessageDialog(null, "Computer won. "+ "Computer: " + compChoice + "  "+player +": " + userChoice );			
					countComp++;
				} 
				
				else if(compChoice == "✌️" && userChoice == "✋") {
					JOptionPane.showMessageDialog(null, "Computer won. " + "Computer: " + compChoice + "  "+player +": " + userChoice);		
					countComp++;		
				}
				
				else {
					JOptionPane.showMessageDialog(null, player +" won. " + "Computer: " + compChoice + " : "+player + ": " + userChoice);
					countUser++;
				}
				
				i++;
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
