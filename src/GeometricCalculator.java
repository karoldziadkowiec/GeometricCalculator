import java.util.Scanner;

public class GeometricCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean run = true;

        while (run) {
            int choice = displayMenuAndGetUserChoice();

            switch (choice) {
                case 1:
                    calculateTriangle();
                    break;
                case 2:
                    calculateSquare();
                    break;
                case 3:
                    calculateCircle();
                    break;
                case 4:
                    System.out.println("Thank you for using the program!");
                    run = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Please, enter the correct number.");
                    break;
            }
        }
    }

    private static int displayMenuAndGetUserChoice() {
        System.out.println("\nChoose figure: ");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Exit");
        System.out.print("Number: ");
        return scanner.nextInt();
    }

    private static void calculateTriangle() throws Exception {
        Triangle triangle = new Triangle(0, 0, 0);
        triangle.enterData();
        triangle.print();

        ThreeDim threeDim = new ThreeDim(triangle, 0);
        threeDim.enterData();
        threeDim.print();
    }

    private static void calculateSquare() throws Exception {
        Square square = new Square(0);
        square.enterData();
        square.print();

        ThreeDim threeDim = new ThreeDim(square, 0);
        threeDim.enterData();
        threeDim.print();
    }

    private static void calculateCircle() throws Exception {
        Circle circle = new Circle(0);
        circle.enterData();
        circle.print();

        ThreeDim threeDim = new ThreeDim(circle, 0);
        threeDim.enterData();
        threeDim.print();
    }
}
