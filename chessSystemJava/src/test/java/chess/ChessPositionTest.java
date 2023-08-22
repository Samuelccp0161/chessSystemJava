package chess;

import boardGame.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChessPositionTest {

    @Test
    public void testPosition() {
        ChessMatch chessMatch = new ChessMatch();

        chessMatch.initialSetup();
        ChessPiece[][] pieces = chessMatch.getPieces();
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces.length; j++) {
                System.out.printf("(%d,%d): %s%n", i, j, pieces[i][j]);
            }
        }
        Assertions.assertNotNull(chessMatch.getPieces()[0][4]);
        Assertions.assertNotNull(chessMatch.getPieces()[2][1]);
        Assertions.assertNotNull(chessMatch.getPieces()[7][4]);
    }
}
