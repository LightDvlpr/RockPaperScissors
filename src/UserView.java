import java.util.Scanner;

class UserView {

    private Scanner sc = new Scanner(System.in);
    int Ties;


    int createRounds(User ur, Computer cp){
        String rounds;
        do{
            System.out.println("How many rounds would you like to play? 1-10");
            rounds = sc.nextLine();
        }while(rounds.trim().matches("[a-zA-Z]+") || rounds.isBlank() || Integer.parseInt(rounds.trim()) > 10 || Integer.parseInt(rounds.trim()) < 1);

        ur.setWins();
        cp.setWins();
        return Integer.parseInt(rounds);
    }

    private boolean keepPlaying(){
        String keepPlaying;
        boolean move = false;

        do{
            System.out.println("Keep playing- Y/N?");
            keepPlaying = sc.nextLine();
        }while(!keepPlaying.trim().equalsIgnoreCase("Y") && !keepPlaying.trim().equalsIgnoreCase("N"));

        if(keepPlaying.equalsIgnoreCase("Y")) move = true;

        return move;
    }

    boolean endGame(Computer comp, User user){

        if(comp.getWins() > user.getWins()){

            System.out.println("Computer wins the game");

        }
        else if(user.getWins() > comp.getWins()){
            System.out.println("Player wins the game");
        }
        else{
            System.out.println("Game is a tie");
        }

        return this.keepPlaying();
    }



    void gameTime(Computer cp, User ur, String winner){

        if(winner.equals("Computer")){
            cp.winner();
        }
        else if (winner.equals("User")){
            ur.winner();
        }
        else{

            this.Tie();

        }

        System.out.println("Player won " + ur.getWins() + " rounds");
        System.out.println("Computer won " + cp.getWins() + " rounds");
        System.out.println("Ties:  " + this.getTies());

    }

    void Tie(){
        this.Ties++;
        System.out.println("Round is a Tie");
    }

    void newTies(){
        this.Ties = 0;
    }

    int getTies(){
        return this.Ties;
    }

}
