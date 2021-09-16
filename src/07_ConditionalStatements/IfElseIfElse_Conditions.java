class IfElseIfElse_Conditions {

    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;

        // Relational Operators - work with most of the data-types
        if (a < b)
            System.out.format("%d is less than %d.\n", a, b);
        if (a <= 5)
            System.out.format("%d is less than or equal to 5\n", a);
        if (b < a)
            System.out.format("%d is greater than %d.\n", b, a);
        if (a >= 5)
            System.out.format("%d is greater than or equal to 10. \n ", b);
        if (c == 15)
            System.out.format("%d is equal to 15.\n ", c);
        if (c != 20)
            System.out.format("%d is equal to 15.\n ", c);

        // Logical Operators - only work with boolean data types
        if (a < b && a < c)
            System.out.format("%d is less than %d and %d.\n", a, b, c);
        if (a < b || a < c)
            System.out.format("%d is not biggest number amonge %d, %d and %d.\n", a,a, b, c);
        if (!(a < b))
            System.out.format("%d is greater than %d.\n", b, a);
    }
}
