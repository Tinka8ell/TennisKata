package tinkabell.org.tennis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TennisTest {

    public static final String PLAYER_1 = "player1";
    public static final String PLAYER_2 = "player2";

    @Test
    void tennis() {
        // Arrange
        String expected = "Hello World";
        Tennis tennis = new Tennis();

        // Act
        String actual = tennis.tennis(expected);

        // Assert
        assertEquals(expected, actual, "Should just return what was input");
    }

    @Test
    void testScorePlayer1() {
        // Arrange
        String expected = "15: love";
        Tennis tennis = new Tennis(PLAYER_1, PLAYER_2);

        // Act
        String actual = tennis.score(PLAYER_1);

        // Assert
        assertEquals(expected, actual, "Player 1 wins first point");
    }

    @Test
    void testScorePlayer2() {
        // Arrange
        String expected = "love: 15";
        Tennis tennis = new Tennis(PLAYER_1, PLAYER_2);

        // Act
        String actual = tennis.score(PLAYER_2);

        // Assert
        assertEquals(expected, actual, "Player 2 wins first point");
    }

    @ParameterizedTest
    @CsvSource({
            "1, 15: love",
            "2, love: 15",
            "11, 30: love",
            "112, 30: 15",
            "1122, 30: 30",
            "112212, 40: 40",
            "1122121, deuce",
    })
    public void testSimpleScores(String inputs, String expected){
        // Arrange
        Tennis tennis = new Tennis(PLAYER_1, PLAYER_2);

        // Act
        String actual = "";
        for (int index = 0; index < inputs.length(); index++) {
            String player = inputs.substring(index, index + 1);
            if (player.equals("1")){
                actual = tennis.score(PLAYER_1);
            } else {
                actual = tennis.score(PLAYER_2);
            }
        }

        // Assert
        assertEquals(expected, actual);
    }

}