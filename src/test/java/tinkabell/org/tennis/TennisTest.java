package tinkabell.org.tennis;

import static org.junit.jupiter.api.Assertions.*;

class TennisTest {

    @org.junit.jupiter.api.Test
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