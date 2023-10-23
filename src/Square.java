import java.util.Scanner;

class Square extends Figure implements Printing, Entering{
    private static Scanner scanner = new Scanner(System.in);
    double a;

    public Square(double a){
        this.a = a;
    }

    @Override
    public double calculateArea() {
        double area = a * a;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 4 * a;
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("\nSquare:");
        System.out.println("a = " + a);
        System.out.println("Area = " + calculateArea());
        System.out.println("Perimeter = " + calculatePerimeter());
    }

    @Override
    public void enterData() throws Exception {
        try {
            System.out.println("Enter the length of the side of [SQUARE]:");
            System.out.print("a = ");
            a = scanner.nextDouble();

            if (a <= 0) {
                throw new Exception("Invalid square parameter.");
            }
            else {
                System.out.println("Square parameters are valid.");
                Square square = new Square(a);
            }
        }
        catch (java.util.InputMismatchException e) {
            throw new Exception("Invalid input.");
        }
    }
}