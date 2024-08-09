package homeworks.java.intro;

public class LeapYear {
    public static void main(String args[]) {

        int month, year;
        month = 2;
        year = 1976;
        if ((month == 2) && ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))))
            System.out.println("Number of days is 29");

        else if (month == 2)
            System.out.println("Number of days is 28");

    }
}