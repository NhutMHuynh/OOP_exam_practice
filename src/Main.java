import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {
        //Cube Volume Calculator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of cube: ");
        int side = scanner.nextInt();
        double CubeVolume = Calculate.volume(side);
        System.out.println("The volume of the cube is: " + CubeVolume);
        // sphere volume calculator
        System.out.println("Enter the radius of sphere: ");
        double radius = scanner.nextDouble();
        double SphereVolume = Calculate.volume(radius);
        System.out.println("The volume of the sphere is: " + SphereVolume);
        // retangular prism volume calculator
        System.out.println("Enter the length of the retangular: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the retangular: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the retangular: ");
        double height = scanner.nextDouble();
        double RetangularVolume = Calculate.volume(length, width, height);
        System.out.println("The volume of the retangular is: " + RetangularVolume);
        // cylinder volume calculator
        System.out.println("Enter the radius of the cylinder: ");
        double CylinderRadius = scanner.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double CylinderHeight = scanner.nextDouble();
        double CylinderVolume = Calculate.volume(CylinderRadius, CylinderHeight);
        System.out.println("The volume of the cylinder is: " + CylinderVolume);

    }
}