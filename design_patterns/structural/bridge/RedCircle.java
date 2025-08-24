public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Red Circle at position(" + x + "," + y + "), radius: " + radius);
    }
    
    @Override
    public void drawRectangle(int x, int y, int width, int height) {
        // RedCircle doesn't draw rectangles
    }
}
