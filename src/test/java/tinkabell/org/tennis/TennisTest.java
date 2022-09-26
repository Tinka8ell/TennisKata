package tinkabell.org.tennis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TennisTest {

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
}