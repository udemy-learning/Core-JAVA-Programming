import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Base & Height of Triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double areaOfTriangle1 = calculateAreaOfTinagle(base,height);
        System.out.println("Area of Triangle with "+ base + "unit base and Height "+ height +" unit is "+ areaOfTriangle1 +" sq.unit");

        System.out.print("Enter Lenght of each side of Triangle: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double areaOfTriangle2 = calculateAreaOfTinagle(side1, side2, side3);
        System.out.println("Area of Triangle with "+ side1 + ", "+ side2 +
            ", "+ side3 +" unit lenght is "+ areaOfTriangle2 +" sq.unit");
    }

    private static double calculateAreaOfTinagle(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) * 0.5;
        double area = Math.sqrt(s * (s - side1) * (s -side2) * (s- side3));
        return area;
    }

    private static double calculateAreaOfTinagle(double base, double height) {
        return (0.5 * base *height);
    }
}
