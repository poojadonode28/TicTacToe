package Models;

public class Player {
    String name;
    SymbolType symbol;

    public SymbolType getSymbol() {
        return symbol;
    }

    public void setSymbol(SymbolType symbol) {
        this.symbol = symbol;
    }

    public Player(String name,SymbolType symbol){
        this.name=name;
        this.symbol=symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
