
public class Literals {
    public static void main(String[] args) {
        // We can separate digits using '_' for good readability
        int num=1_242_342_525;  // Literal value
        long num2=7687L;
        float num3=664.65f;
        double num4=312.574d;
        char ch='A';

        // Set values in different format
        int cntDec=15;
        int cntBinary=0b1111;
        int cntOct=017;
        int cntHex=0xF;

        System.out.println("num = "+num);
        System.out.println("Binary representation of num= "+Integer.toBinaryString(num));
        System.out.println("num2= "+num2);
        System.out.println("num3= "+num3);
        System.out.println("num4= "+num4);
        System.out.println("ch= "+ch);

        System.out.println("\nvalue of  cntDec is "+ cntDec);
        System.out.println("value of  cntBinary is "+ cntBinary);
        System.out.println("value of  cntOct is "+ cntOct);
        System.out.println("value of  cntHex is "+ cntHex);
    }
}
