import java.util.regex.*;  

public class RegularExpression {
    public static void main(String[] args) {
        String fullName = "Vijay Ramchandra Gawade";
        String emailId = "vijay.gaw_ade96@outlook.com";

        System.out.println("is Full Name ? "+fullName.matches("[a-zA-Z]{3,10}\\s[a-zA-Z]{3,10}\\s[a-zA-Z]{3,10}"));
        System.out.println("Is Email? "+Pattern.matches("[a-zA-Z0-9.]{3,}@[a-zA-Z]{4,}.com", emailId));
    }
}
