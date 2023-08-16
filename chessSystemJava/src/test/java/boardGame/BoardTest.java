package boardGame;

import exceptions.BoardMismatchedSizeException;
import main.UI;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BoardTest {
    @Test
    public void testSizeBoard() {
        try {
            Board board = new Board(4, 8);
            fail("should fail");
        }catch (BoardMismatchedSizeException e){
            assertEquals("The board must be 8x8", e.getMessage());
        }
    }
}
