public class Calculate {
    private int side;
    private double radius;
    private double length;
    private double width;
    private double height;
    //Constructor
    public Calculate(int side, double radius, double length, double width, double height) {
        this.side = side;
        this.radius = radius;
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public int getSide() {return side; }
    public double getRadius() { return radius; }
    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }

    public void setSide(int side) { this.side = side; }
    public void setRadius(double radius) { this.radius = radius; }
    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }

    public static double volume(int side){
        return  side * side * side;
    }
    public static double volume(double radius){
        return (4/3) * Math.PI * radius * radius * radius;
    }
    public static double volume(double length, double width, double height){
        return length * width * height;
    }
    public static double volume(double height, double radius){
        return radius * radius * height;
    }

}
