import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Printing for assingnment 2 b)
        Date d = new Date();

        int input;

        Scanner keybord = new Scanner(System.in);

        System.out.println("Write in day");
        input = keybord.nextInt();
        if (input < 1 || input > 31) {
            System.out.println("Not in range of 1 to 31");
        } else {
            d.days = input;

            System.out.println("Write in month");
            input = keybord.nextInt();
            if (input < 1 || input > 12) {
                System.out.println("Not in range of 1 to 12");
            } else {
                d.month = input;

                System.out.println("Write in year");
                input = keybord.nextInt();
                if (input < 0 || input > 9999) {
                    System.out.println("Not a year");
                } else {
                    d.year = input;
                    Date.printDate(d);
                }
            }
        // Printing for assingnment 2 c)
        }
        Date d1 = new Date();
        System.out.println("Write in day");
        input = keybord.nextInt();
        d1.days = input;

        System.out.println("Write in month");
        input = keybord.nextInt();
        d1.month = input;

        System.out.println("Write in year");
        input = keybord.nextInt();
        d1.year = input;

        Date d2 = new Date();
        System.out.println("Write in day");
        input = keybord.nextInt();
        d2.days = input;

        System.out.println("Write in month");
        input = keybord.nextInt();
        d2.month = input;

        System.out.println("Write in year");
        input = keybord.nextInt();
        d2.year = input;

        Date.printDate(d1); System.out.println( ", "); Date.printDate(d2);
        System.out.println("Difference in days = " + Date.dayDiff(d1,d2));
    }
}