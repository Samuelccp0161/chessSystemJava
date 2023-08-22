package main;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import exceptions.BoardMismatchedSizeException;

public class Main {
    public static void main(String[] args) throws BoardMismatchedSizeException {
//        Position position = new Position(3, 5);
//        System.out.println(position);

        ChessMatch chessMatch = new ChessMatch();
        chessMatch.initialSetup();
        UI.printBoard(chessMatch.getPieces());

    }
}
