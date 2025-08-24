import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static Map<String, CharacterStyle> styleCache = new HashMap<>();
    
    public static CharacterStyle getStyle(String font, int size, String color) {
        String key = font + size + color;
        
        if (!styleCache.containsKey(key)) {
            System.out.println("Creating new style: " + font + ", " + size + ", " + color);
            styleCache.put(key, new CharacterStyle(font, size, color));
        } else {
            System.out.println("Reusing existing style: " + font + ", " + size + ", " + color);
        }
        
        return styleCache.get(key);
    }
    
    public static int getStyleCount() {
        return styleCache.size();
    }
    
    public static void displayCache() {
        System.out.println("\nStyle Cache Contents:");
        for (Map.Entry<String, CharacterStyle> entry : styleCache.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
