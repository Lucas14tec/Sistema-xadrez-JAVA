package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args){
<<<<<<< HEAD
        Position pos = new Position(6 , 5);
=======
        Position pos = new Position(13 , 5);
>>>>>>> 564148ed68d0dad2f6169ce0f0704dbd178f7f31
        System.out.println(pos);

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}