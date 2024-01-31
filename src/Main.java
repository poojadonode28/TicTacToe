import Models.Board;
import Models.Game;
import Models.Player;
import Models.SymbolType;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Board board =new Board(3);
        Player player1 = new Player("Pooja", SymbolType.X);
        Player player2 = new Player("Khushi", SymbolType.O);
        Deque<Player> player = new LinkedList<>();
        player.addFirst(player1);
        player.addLast(player2);
        Game game = new Game(player,board);

    }
}
