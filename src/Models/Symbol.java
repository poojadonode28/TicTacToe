package Models;

public class Symbol {
    private SymbolType symbol;
    public Symbol(SymbolType symbol){
        this.symbol=symbol;
    }

    public SymbolType getSymbol() {
        return symbol;
    }

    public void setSymbol(SymbolType symbol) {
        this.symbol = symbol;
    }
}
