public class BitwiseOperation{
    public static void main(String[] args) {
        swapNumberWithout3rdNum();

        storeTwoNumbersInOneByte();
    }

    private static void storeTwoNumbersInOneByte() {
        // store 9, 5 into single byte variable using 4-bit only
        byte b;     // 0000 0000
        // 9 = 0000 1001
        b=(byte)(9<<4); //  1001 0000
        // 5 = 0000 0101
        b=(byte)(b|5);  // 1001 0101

        System.out.println("First Number="+ ((b&0b11110000)>>4));
        System.out.println("Second Number="+ (b&0b00001111));
    }

    private static void swapNumberWithout3rdNum() {
        int a=4, b=9;
        System.out.println("Numbers before Swapping a="+a +" and b="+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Numbers after Swapping a="+a +" and b="+b);
    }
}