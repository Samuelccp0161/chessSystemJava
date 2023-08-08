package boardGame;

import exceptions.BoardMismatchedSizeException;

public class Board {
    public int rows;
    public int columns;
    public Piece[][] pieces;

    public Board(int rows, int columns) throws BoardMismatchedSizeException {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
        if (this.rows != 8 || this.columns != 8){
            throw new BoardMismatchedSizeException("The board must be 8x8");
        }
    }

    public int getRows() {
        return rows;
    }

//    public void setRows(int rows) {
//        this.rows = rows;
//    }

    public int getColumns() {
        return columns;
    }

//    public void setColumns(int columns) {
//        this.columns = columns;
//    }
    public Piece piece(int row, int column){
        return pieces[row][column];
    }
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
}
