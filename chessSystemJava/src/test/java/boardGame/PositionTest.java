package boardGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {
    @Test
    public void testPosition() {
        Position position = new Position(3,5);

        assertEquals("3, 5", position.toString());
    }

}
