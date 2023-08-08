package boardGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {
    @Test
    public void testBoardRowsAndColumns() {
        Board board = new Board(8, 8);
        assertEquals(8, board.getRows());
        assertEquals(8, board.getColumns());
    }

    @Test
    public void testBoardPiece() {
        Board board = new Board(8,8);
        board.piece(1,2);
        assertEquals(12, board.piece());

    }
}
