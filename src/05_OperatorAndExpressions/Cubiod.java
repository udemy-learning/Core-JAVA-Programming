import java.util.Scanner;

public class Cubiod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length, Breath & Height of Cubiod: ");
        float length = sc.nextFloat();
        float breath = sc.nextFloat();
        float height = sc.nextFloat();
        
        float totalAreaOfCubiod = calculateAreaOfQubiod(length, breath, height);
        System.out.println("Total Area of Qubiod is " + totalAreaOfCubiod);

        float volume = calculateVolumeOfQubiod(length, breath, height);
        System.out.println("Volume of Qubiod is " + volume);
    }

    private static float calculateAreaOfQubiod(float length, float breath, float height) {
        float area = 2 * length * height + 2 * length * breath + 2 *  breath * height;
        return area;
    }

    private static float calculateVolumeOfQubiod(float length, float breath, float height) {
        return (length * breath * height);
    }
    
}
