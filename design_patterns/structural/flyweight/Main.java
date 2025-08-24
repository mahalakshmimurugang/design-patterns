public class Main {
    public static void main(String[] args) {
        System.out.println("=== Flyweight Pattern Demo ===\n");
        
        // Create characters with shared styles
        Character[] chars = {
            new Character('H', CharacterFactory.getStyle("Arial", 12, "Black")),
            new Character('e', CharacterFactory.getStyle("Arial", 12, "Black")),
            new Character('l', CharacterFactory.getStyle("Arial", 12, "Black")),
            new Character('l', CharacterFactory.getStyle("Arial", 12, "Black")),
            new Character('o', CharacterFactory.getStyle("Arial", 12, "Black")),
            new Character('W', CharacterFactory.getStyle("Times", 14, "Blue")),
            new Character('o', CharacterFactory.getStyle("Times", 14, "Blue")),
            new Character('r', CharacterFactory.getStyle("Times", 14, "Blue")),
            new Character('l', CharacterFactory.getStyle("Times", 14, "Blue")),
            new Character('d', CharacterFactory.getStyle("Times", 14, "Blue"))
        };
        
        // Display characters
        System.out.println("Displaying characters:");
        for (int i = 0; i < chars.length; i++) {
            chars[i].display(i % 5, i / 5);
        }
        
        // Show flyweight benefits
        System.out.println("\nFlyweight Benefits:");
        System.out.println("Total characters: " + chars.length);
        System.out.println("Unique styles: " + CharacterFactory.getStyleCount());
        System.out.println("Memory saved by sharing styles!");
        
        CharacterFactory.displayCache();
    }
}