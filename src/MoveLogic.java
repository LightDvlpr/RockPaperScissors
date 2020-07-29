enum MoveLogic{

    Rock, Paper, Scissor;

    MoveLogic(){

    }

    public static MoveLogic parseType(int value){
        MoveLogic move;

        if(value == 1){
            move = Rock;
        }
        else if(value == 2){
            move = Paper;
        }
        else if(value == 3){
            move = Scissor;
        } else {
            move = null;
        }

      return move;
    }

   public static String decideGame(MoveLogic user, MoveLogic computer){
        String winner;

        if(user == Rock && computer == Scissor){
            winner = "User";
        }
        else if(user == Paper && computer == Rock){
            winner = "User";
        }
        else if(user == Scissor && computer == Paper){
            winner = "User";
        }
        else if(user == computer){
            winner = "Tie";
        }
        else{
            winner = "Computer";
        }

        return winner;
   }

}