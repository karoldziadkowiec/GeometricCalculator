import java.util.Scanner;

class Triangle extends Figure implements Printing, Entering {
    private static Scanner scanner = new Scanner(System.in);
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("\nTriangle:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Area = " + calculateArea());
        System.out.println("Perimeter = " + calculatePerimeter());
    }

    @Override
    public void enterData() throws Exception {
        try {
            System.out.println("Enter the lengths of the three sides of the [TRIANGLE]:");
            System.out.print("a = ");
            a = scanner.nextDouble();
            System.out.print("b = ");
            b = scanner.nextDouble();
            System.out.print("c = ");
            c = scanner.nextDouble();

            if (!isTriangleValid(a, b, c)) {
                throw new Exception("Invalid triangle parameters.");
            }
            else if (a < 0 || b < 0 || c < 0) {
                throw new Exception("Invalid triangle parameters (parameter is less than 0).");
            }
            else {
                System.out.println("Triangle parameters are valid.");
                Triangle triangle = new Triangle(a, b, c);
            }
        } catch (java.util.InputMismatchException e) {
            throw new Exception("Invalid input.");
        }
    }

    private boolean isTriangleValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}