public class StringMethods {
    public static void main(String[] args) {
        String fullName = "  Mr. Vijay Ramchandra Gawade.  ";

        System.out.println("Length of String:"+ fullName.length());
        System.out.println("Full Name(Lower-case):" + fullName.toLowerCase() );
        System.out.println("Full Name(Uppear-case):" + fullName.toUpperCase() );
        System.out.println("Full Name(trimmed): " + fullName.trim() );

        System.out.println("Full Name(sub-string): " + fullName.substring(12) );
        System.out.println("Full Name(sub-string): " + fullName.substring(12,22) );

        System.out.println("Full Name(replace): " + fullName.replace("Gawade","Gavade") );

        System.out.println("is Start with 'V':" + fullName.trim().startsWith("Mr."));
        System.out.println("is Ends with '.':" + fullName.trim().endsWith("."));

        System.out.println("Char at 6th index:"+fullName.charAt(6));
        System.out.println("Index of 'A':"+fullName.indexOf('a'));
        System.out.println("Last Index of 'A':"+fullName.lastIndexOf('a'));

        System.out.println("Equals:"+fullName.substring(12,22).equals("ramchandra"));
        System.out.println("Equals ignore case:"+fullName.substring(12,22).equalsIgnoreCase("ramchandra"));

        System.out.println("Comapare:"+fullName.substring(12,22).compareTo("ramchandra"));
        System.out.println("Comapare ignore case:"+fullName.substring(12,22).compareToIgnoreCase("ramchandra"));

        String num = String.valueOf(65);
        System.out.println("Num in String:"+num);

    }
}
