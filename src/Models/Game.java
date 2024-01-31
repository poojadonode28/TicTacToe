package Models;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Deque<Player> p;
    Board board;

    public Game(Deque<Player> p, Board board) {
        this.p = p;
        this.board=board;
        isWinner();

    }

    public void isWinner() {
        boolean winner = true;
        String[] name=new String[1];
        while (winner) {
            Player p1 = p.removeFirst();
            Scanner sc = new Scanner(System.in);
            System.out.println("Please "+ p1.getName()+" enter row and col:");
            int row = sc.nextInt();
            int col = sc.nextInt();
            checkInvalid(row,col);
            boolean check = board.checkPlace(row, col, p1,board);
            if (check) {
                boolean a1 = board.checkForRow(row);
                boolean b1 = board.checkForCol(col);
                boolean c1= board.checkForDiagonal();
                if (a1 || b1 || c1) {
                    name[0]=p1.getName();
                    winner = false;
                }
            }

            p.addLast(p1);

        }
        System.out.println(name[0]+" is Winner");
    }
    public void checkInvalid(int row,int col){
        System.out.println(board.size);
        try{
            if(row>=board.size || col>=board.size){

            }
        }
        catch(Exception e){
            System.out.println("Invalid position");
        }
    }
}