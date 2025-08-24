public class Rectangle extends Shape {
    private int x, y, width, height;
    
    public Rectangle(int x, int y, int width, int height, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw() {
        drawAPI.drawRectangle(x, y, width, height);
    }
}
