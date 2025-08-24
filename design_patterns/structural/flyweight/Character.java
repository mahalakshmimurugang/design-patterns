public class Character {
    private char symbol;
    private CharacterStyle style;
    
    public Character(char symbol, CharacterStyle style) {
        this.symbol = symbol;
        this.style = style;
    }
    
    public void display(int x, int y) {
        System.out.println("Character '" + symbol + "' at position (" + x + ", " + y + ") with " + style);
    }
    
    public char getSymbol() {
        return symbol;
    }
    
    public CharacterStyle getStyle() {
        return style;
    }
}
