import java.util.Scanner;
public class User implements Player {

    private int wins;
    private Scanner sc = new Scanner(System.in);

    @Override
    public int play() {
        String choice;
        do{
            System.out.println("Rock(1), Paper(2) or Scissor(3)?");
            choice = sc.nextLine();
        }while(choice.trim().matches("[a-zA-Z]+") || choice.isBlank() || Integer.parseInt(choice.trim()) < 1 || Integer.parseInt(choice.trim()) > 3);

        return Integer.parseInt(choice);
    }

    @Override
    public void winner() {
        this.wins++;
        System.out.println("Player wins this round");
    }

    @Override
    public int getWins() {
        return wins;
    }

    @Override
    public void setWins(){
        this.wins = 0;
    }
}
