import java.util.Scanner;

class Assignment1 {

    Scanner sc;
    int headerLength = 65;

    public Assignment1() {
        sc = new Scanner(System.in);
    }

    void printHeader(String title) {
        int asstricRequired = (headerLength - title.length() - 4) / 2;
        int additinalReq = (headerLength - title.length() - 4) % 2 == 0 ? 0 : 1;

        String finalText = "";
        for (int i = 0; i < asstricRequired; i++)
            finalText += "*";
        finalText += "  " + title + "  ";
        for (int i = 0; i < (asstricRequired + additinalReq); i++)
            finalText += "*";

        System.out.println(finalText);
    }

    void printFooter() {
        int cnt = (headerLength - 7) / 2;
        int addCntr = (headerLength - 7) % 2 == 0 ? 0 : 1;

        String finalText = "\n";
        for (int i = 0; i < cnt; i++)
            finalText += "*";
        finalText += "  END  ";
        for (int i = 0; i < (cnt + addCntr); i++)
            finalText += "*";
        finalText += "\n\n";

        System.out.println(finalText);
    }

    void checkEvenOddNumber() {
        printHeader("Check Number Even or Odd");
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.format("%d is Even Number.", num);
        else
            System.out.format("%d is Odd Number.", num);

        printFooter();
    }

    void checkPersonGroup() {
        printHeader("Check Person Young or Not");
        System.out.print("Enter your Age (int): ");
        int age = sc.nextInt();

        if (age < 15)
            System.out.format("Person with age %d is Kid.", age);
        else if (age < 30)
            System.out.format("Person with age %d is Young.", age);
        else
            System.out.format("Person with age %d is Old.", age);

        printFooter();
    }

    void findGradeOfStudent() {
        printHeader("Calculate Grade of Student");
        System.out.print("Enter marks in three Subject (int): ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int avg = (m1 + m2 + m3) / 3;

        if (avg >= 70)
            System.out.println("Grade is A");
        else if (avg >= 60)
            System.out.println("Grade is B");
        else if (avg >= 50)
            System.out.println("Grade is C");
        else if (avg >= 40)
            System.out.println("Grade is D");
        else
            System.out.println("Grade is A");

        printFooter();
    }

    void checkLeapYear() {
        printHeader("Check Leap Year");
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println(year + " is a Leap year.");
                else
                    System.out.println(year + " is not Leap year.");
            } else
                System.out.println(year + " is Leap year.");
        } else
            System.out.println(year + " is not Leap year.");

        printFooter();
    }

    public static void main(String[] args) {
        Assignment1 assignment = new Assignment1();

        assignment.checkLeapYear();

        assignment.checkEvenOddNumber();

        assignment.checkPersonGroup();

        assignment.findGradeOfStudent();
    }
}
