package tinkabell.org.tennis;

import org.junit.jupiter.api.Test;

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



}