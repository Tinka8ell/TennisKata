package tinkabell.org.tennis;

public class Tennis {

    private String player1 = "player1";
    private String player2 = "player2";


    public Tennis() {
    }

    public Tennis(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String tennis(String input) {
        return input;
    }

    public static void main(String[] args) {
        Tennis tennis = new Tennis();
        System.out.println(tennis.tennis("Hello world!"));
    }

    public String score(String player1) {
        return null;
    }
}