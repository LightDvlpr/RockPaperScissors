public class Computer implements Player {

    private int wins;

    @Override
    public int play() {
        int min = 1;
        int max = 3;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public void winner() {
        this.wins++;
        System.out.println("Computer wins this round");
    }

    @Override
    public int getWins() {
        return wins;
    }

    @Override
    public void setWins() {
        this.wins = 0;
    }
}