public class Date {
    // assingnment 2 a)
    int days;
    int month;
    int year;
    // 2 b)
    static void printDate(Date d) {

        System.out.println(String.format("%02d.%02d.%04d", d.days, d.month, d.year));
    }
    // 2 c)
    static int daysSince0(Date d) {

        int daysFromYear0 = (d.year * 365) + (d.month * 30) + d.days;
        return daysFromYear0;
    }

    static int dayDiff(Date d1, Date d2) {

        int days1 = daysSince0(d1);
        int days2 = daysSince0(d2);
        return Math.abs(days1 - days2);
    }
    // 2 d) is in the main class
}