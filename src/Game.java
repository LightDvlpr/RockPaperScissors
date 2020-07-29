class Game {

    private UserView uv;
    private Computer cp;
    private User ur;

    Game(UserView uv, Computer cp, User ur){
        this.uv = uv;
        this.cp = cp;
        this.ur = ur;
    }

    void run(){
        int rounds;
        int userChoice;
        int compChoice;
        String winner;

        System.out.println("Welcome. The game begins now.");
        rounds = uv.createRounds(ur,cp);
        boolean gameTime = true;

        while(gameTime){
            userChoice = ur.play();
            compChoice = cp.play();

            MoveLogic userMove = MoveLogic.parseType(userChoice);
            MoveLogic compMove = MoveLogic.parseType(compChoice);

            winner = MoveLogic.decideGame(userMove,compMove);

            uv.gameTime(cp,ur,winner);

            rounds -= 1;

            if(rounds == 0){
                gameTime = uv.endGame(cp,ur);
                if(gameTime){
                    uv.newTies();
                    rounds = uv.createRounds(ur,cp);
                }
            }
        }
    }
}