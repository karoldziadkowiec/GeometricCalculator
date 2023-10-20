import java.util.Scanner;

class Circle extends Figure implements Printing, Entering {
    private static Scanner scanner = new Scanner(System.in);
    final double PI = 3.14;
    double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double calculateArea() {
        double area = PI * r * r;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * PI * r;
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("\nCircle:");
        System.out.println("r = " + r);
        System.out.println("Area = " + calculateArea());
        System.out.println("Perimeter = " + calculatePerimeter());
    }

    @Override
    public void enterData() throws Exception {
        try {
            System.out.println("Enter the length of the radius of [CIRCLE]:");
            System.out.print("r = ");
            r = scanner.nextDouble();

            if (r <= 0) {
                throw new Exception("Invalid circle parameter.");
            }
            else{
                System.out.println("Circle parameter is valid.");
                Circle circle = new Circle(r);
            }
        } catch (java.util.InputMismatchException e) {
            throw new Exception("Invalid input.");
        }
    }
}