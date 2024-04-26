public class Circle extends Shape {
    private int radius = 0;

    public Circle(int newRadius) {
        setRadius(newRadius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);

    }

}
