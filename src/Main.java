public class Main {
    public static void main(String[] args){

        UserView view = new UserView();
        Computer cp = new Computer();
        User ur = new User();

        Game start = new Game(view, cp, ur);

        start.run();
    }
}
