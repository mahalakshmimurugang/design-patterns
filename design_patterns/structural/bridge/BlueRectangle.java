public class BlueRectangle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        // BlueRectangle doesn't draw circles
    }
    
    @Override
    public void drawRectangle(int x, int y, int width, int height) {
        System.out.println("Drawing Blue Rectangle at position(" + x + "," + y + "), width: " + width + ", height: " + height);
    }
}
