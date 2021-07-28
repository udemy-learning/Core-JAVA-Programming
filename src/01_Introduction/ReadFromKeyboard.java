import java.util.Scanner;

public class ReadFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int num1,num2;
        float fNum;
        double dNum;
        String fName,fullName;
        short sNum;
        long lNum;
        boolean bVal;

        // Read Integer
        System.out.print("Enter two Integers: ");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        System.out.println("Sum of two Input Numbers: "+(num1+num2));

        // Read Flaot numbers
        System.out.print("Enter float number: ");
        fNum=scanner.nextFloat();
        System.out.println("Input float value "+fNum);

        // Read Double numbers
        System.out.print("Enter Double number: ");
        dNum=scanner.nextDouble();
        System.out.println("Input Double value "+dNum);

        // Read String
        System.out.print("Enter String/Word: ");
        fName=scanner.next();
        System.out.println("Input String value "+fName);

        // Read whole Line
        System.out.print("Enter Full Name: ");
        // Clear buffer before reading
        scanner.nextLine(); // way 1
        // scanner=new Scanner(System.in); // way 2
        fullName=scanner.nextLine();
        System.out.println("Input Line content "+fullName);

        // Read Short number
        System.out.print("Enter Short Number: ");
        sNum=scanner.nextShort();
        System.out.println("Input Short value "+sNum);

        // Read Long Number
        System.out.print("Enter Long Number: ");
        lNum=scanner.nextLong();
        System.out.println("Input Long value "+lNum);

        // Read Boolean Value
        System.out.print("Enter Boolean value: ");
        bVal=scanner.nextBoolean();
        System.out.println("Input Boolean value "+bVal);

        // Check Int enter before reading
        System.out.print("Enter Integer value: ");
        if(scanner.hasNextInt()){
            num1=scanner.nextInt();
            System.out.println("Input Interger: "+ num1);
        }else{
            fullName = scanner.nextLine();
            System.out.println("Sry ! you are not entered integer number");
        }
    }
}
