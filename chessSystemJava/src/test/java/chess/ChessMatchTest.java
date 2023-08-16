package chess;

import boardGame.Board;
import boardGame.Piece;
import chess.pieces.King;
import exceptions.BoardMismatchedSizeException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ChessMatchTest {
    @Test
    public void testChessMatchShouldStartEmpty() throws BoardMismatchedSizeException {
        ChessMatch chessMatch = new ChessMatch();
        ChessPiece[][] pieces = chessMatch.getPieces();

        for (ChessPiece[] piece : pieces) {
            for (int j = 0; j < pieces.length; j++) {
                assertNull(piece[j]);
            }
        }
    }

    @Test
    public void testPiecesInSideBoard() {
        ChessMatch chessMatch = new ChessMatch();

        chessMatch.initialSetup();

        ChessPiece[][] pieces = chessMatch.getPieces();
        List<ChessPiece> pieceList = new ArrayList<>();

        for (ChessPiece[] piece : pieces) {
            for (int j = 0; j < pieces.length; j++) {
                if (piece[j] != null){
                    pieceList.add(piece[j]);
                }
            }
        }

        assertEquals("K", pieceList.get(0).toString());
        assertEquals("R", pieceList.get(1).toString());
        assertEquals("K", pieceList.get(2).toString());
    }
}
