public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int a=5,b;

        b=a++;
        System.out.println("a= "+a+ " and b= "+b);

        a=5;
        b=++a;
        System.out.println("a= "+a+ " and b= "+b);

        a=5;
        b=2*a++ + 3*++a;
        // b = 10 +3*7 = 31  0xFF38
        System.out.println("a= "+a+ " and b= "+b);
    }
}
