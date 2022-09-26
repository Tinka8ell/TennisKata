package tinkabell.org.tennis;

import java.security.InvalidParameterException;

public class Tennis {

    private static String[] SCORE_NAMES = new String[] {
       "love",
       "15",
       "30",
       "40"
    };

    private String player1 = "player1";
    private String player2 = "player2";
    private int player1Score = 0;
    private int player2Score = 0;


    public Tennis() {
    }

    public Tennis(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }


    public String score(String player) {
        if (player1.equals(player)){
            player1Score++;
        } else if (player2.equals(player)){
            player2Score++;
        } else {
            throw new InvalidParameterException(player + " is not one of " + player1 + " or " + player2);
        }

        return scoreToString(player1Score) + ": " + scoreToString(player2Score);
    }

    private static String scoreToString(int score) {
        return SCORE_NAMES[score];
    }

    public String tennis(String input) {
        return input;
    }

    public static void main(String[] args) {
        Tennis tennis = new Tennis();
        System.out.println(tennis.tennis("Hello world!"));
    }
}