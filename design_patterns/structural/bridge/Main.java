public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bridge Pattern Demo ===\n");
        
        // Example 1: Red Circle
        System.out.println("1. Drawing Red Circle:");
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        redCircle.draw();
        System.out.println();
        
        // Example 2: Green Circle
        System.out.println("2. Drawing Green Circle:");
        Shape greenCircle = new Circle(200, 200, 15, new GreenCircle());
        greenCircle.draw();
        System.out.println();
        
        // Example 3: Blue Rectangle
        System.out.println("3. Drawing Blue Rectangle:");
        Shape blueRectangle = new Rectangle(300, 300, 20, 30, new BlueRectangle());
        blueRectangle.draw();
        System.out.println();
        
        // Example 4: Same shape with different colors
        System.out.println("4. Same Circle with Different Colors:");
        Circle circle1 = new Circle(50, 50, 25, new RedCircle());
        Circle circle2 = new Circle(50, 50, 25, new GreenCircle());
        
        System.out.println("Red version:");
        circle1.draw();
        System.out.println("Green version:");
        circle2.draw();
        System.out.println();
        
        // Example 5: Dynamic color change
        System.out.println("5. Dynamic Color Change:");
        Circle dynamicCircle = new Circle(150, 150, 20, new RedCircle());
        System.out.println("Initially red:");
        dynamicCircle.draw();
        
        // Change the drawing implementation
        dynamicCircle = new Circle(150, 150, 20, new GreenCircle());
        System.out.println("Changed to green:");
        dynamicCircle.draw();
    }
}
