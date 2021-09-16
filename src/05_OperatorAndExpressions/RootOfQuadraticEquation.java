import java.util.Scanner;

public class RootOfQuadraticEquation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coeifient a, b, c of Quadratic Equation aX^2 + bX + c = 0: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        findRootOfQuaraticEquation(a, b, c);

    }

    private static void findRootOfQuaraticEquation(int a, int b, int c) {
        int exp = b * b - 4 * a * c;
        if(exp<0){
            System.out.println("Can't find root of this Quaratic Equation.");
            return;
        }
        double r1 = (-b + Math.sqrt(exp))/(2 * a);
        double r2 = (-b - Math.sqrt(exp))/(2 * a);

        System.out.println("Root of Quadratic Equation is "+ r1 + " & "+ r2);
    }
}