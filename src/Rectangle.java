public class Rectangle extends Square {
    public Rectangle(int newWidth, int newHeight) {
        super(newWidth);
        setHeight(newHeight);
    }

    private int height = 0;

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int newHeight) {
        height = newHeight;
    }

}
