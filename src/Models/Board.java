package Models;


import java.util.ArrayList;

public class Board {
    int size;
    SymbolType [][] board;


    public SymbolType[][] getBoard() {
        return board;
    }

    public void setBoard(SymbolType[][] board) {
        this.board = board;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Board(int size){
        this.size=size;
        board = new SymbolType[size][size];
    }
    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j] + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }

    public boolean addPiece(int row,int col,Symbol symbol){
        if(board[row][col]!= null ){
            return false;
        }
        board[row][col]=symbol.getSymbol();
        return true;
    }
    public boolean checkPlace(int row,int col,Player p1,Board b){
        if(isFull()==true){
            System.out.println("Tie between players");
            System.exit(0);
            return false;
        }
        if(b.getBoard()[row][col]!=null){
            System.out.println("Position already filled");
            return false;
        }
        else{
            b.getBoard()[row][col]=p1.getSymbol();
            printBoard();
        }
        return true;
    }


    public boolean checkForRow(int row) {
        for (int i = 0; i < size; i++) {
            if (i > 0 && board[row][i] != board[row][i - 1]) {
                return false;
            }

        }
        return true;
    }
    public boolean checkForCol(int col) {
        for (int i = 0; i < size; i++) {
            if (i > 0 && board[i][col] != board[i-1][col]) {
                return false;
            }

        }
        return true;
    }
    public boolean checkForDiagonal(){
        for(int i=1;i<size;i++){
            if(board[i-1][i-1]!=board[i][i]){
                return false;
            }
        }
        return true;
    }
    public boolean isFull(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    return false;
                }
            }
        }
        return true;
    }


}
