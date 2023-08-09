package chess;

import exceptions.BoardMismatchedSizeException;
import main.UI;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ChessMatchTest {
    @Test
    public void testChessMatchShouldStartEmpty() throws BoardMismatchedSizeException {
        ChessMatch chessMatch = new ChessMatch();
        ChessPiece[][] pieces = chessMatch.getPieces();

        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces.length; j++) {
                assertTrue(pieces[i][j] == null);
            }
        }

    }
}
