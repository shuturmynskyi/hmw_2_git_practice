package Zaynyattya_6.Urok_6_practice.Urok_6_chess_inheritance;

import java.util.ArrayList;
import java.util.List;

public class ChessGame {
    public static void main(String[] args) {
//        King king = new King();
//        king.move();
//
//        Queen queen = new Queen();
//        queen.move();
        List<ChessItem> chessItems = new ArrayList<>();
        chessItems.add(new King());
        chessItems.add(new Queen());
        for (ChessItem chessItem: chessItems){
            chessItem.move();
        }

//        for (int i = 0; i < chessItems.size(); i++) {
//            chessItems.get(i).move();
//
//        }
    }
}
