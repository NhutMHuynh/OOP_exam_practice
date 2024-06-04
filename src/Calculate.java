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

    public static void volume(int side){
        return side * side * side;
    }
    public static void volume(double radius){
        return (4/3) * Math.PI * radius * radius * radius;
    }
    public static void volume(double length, double width, double height){
        return length * width * height;
    }
    public static void volume(double height, double radius){
        return radius * radius * height;
    }

}
