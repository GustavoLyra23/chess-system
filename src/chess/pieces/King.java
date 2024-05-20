package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return (p == null || p.getColor() != getColor());
    }


    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //above
        p.setValues(p.getRow() - 1, p.getCol());
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getCol()] = true;
        }
        //below
        p.setValues(p.getRow() + 1, p.getCol());
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getCol()] = true;
        }
        //left
        p.setValues(p.getRow(), p.getCol() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getCol()] = true;
        }
        //right
        p.setValues(p.getRow(), p.getCol() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getCol()] = true;
        }
        //nw
        p.setValues(p.getRow() - 1, p.getCol() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getCol()] = true;
        }
        //ne
        p.setValues(p.getRow() - 1, p.getCol() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getCol()] = true;
        }
        //sw
        p.setValues(p.getRow() + 1, p.getCol() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getCol()] = true;
        }
        //se
        p.setValues(p.getRow() + 1, p.getCol() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getCol()] = true;
        }
        return mat;
    }
}