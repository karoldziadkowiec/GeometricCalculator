import java.util.Scanner;

public class ThreeDim implements Entering{
    private static Scanner scanner = new Scanner(System.in);
    Figure base;
    double h;

    public ThreeDim(Figure base, double h){
        this.base = base;
        this.h = h;
    }

    public double calculateOverallArea() {
        double baseArea = base.calculateArea();
        double lateralArea = base.calculatePerimeter() * h;
        double area = 2 * baseArea + lateralArea;
        return area;
    }

    public double calculateVolume() {
        double baseArea = base.calculateArea();
        double volume = baseArea * h;
        return volume;
    }

    public void print() {
        System.out.println("\nThreeDim:");
        System.out.println("h = " + h);
        System.out.println("OverallArea = " + calculateOverallArea());
        System.out.println("Volume = " + calculateVolume());
    }

    @Override
    public void enterData() throws Exception {
        try {
            System.out.println("\nEnter the height of the prism:");
            System.out.print("h = ");
            h = scanner.nextDouble();

            if (h <= 0) {
                throw new Exception("Invalid height parameter.");
            }
            else{
                System.out.println("Height parameter is valid.");
                ThreeDim threeDim = new ThreeDim(base, h);
            }
        } catch (java.util.InputMismatchException e) {
            throw new Exception("Invalid input.");
        }
    }
}