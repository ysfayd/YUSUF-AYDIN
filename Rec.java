import java.util.Scanner;
class RectangleArea {
    private double length;
    private double width;
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
    }
    public double computeField() {
        return length * width;
    }
    public void fieldDisplay(double area) {
        System.out.println("Rectangle area is: " + area);
    }
}
public class Main {
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();

        rectangle.getData();

        double area = rectangle.computeField();
        rectangle.fieldDisplay(area);
    }
}
