package chess;

import boardGame.Board;
import exceptions.BoardMismatchedSizeException;

public class ChessMatch {
    private final Board board;

    public ChessMatch() {
        board = new Board(8,8);
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                matrix[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return matrix;
    }
}
