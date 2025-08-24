public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Green Circle at position(" + x + "," + y + "), radius: " + radius);
    }
    
    @Override
    public void drawRectangle(int x, int y, int width, int height) {
        // GreenCircle doesn't draw rectangles
    }
}
