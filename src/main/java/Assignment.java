package main.java;

public class Assignment {
    
    public static double calculateMovieNight() {
        int numAdults = 2;
        int numChildren = 3;
        double adultPrice = 12.50;
        double childPrice = 8.00;
        double popcornPrice = 7.25;
        return (numAdults * adultPrice) + (numChildren * childPrice) + popcornPrice;
    }

    public static boolean canRentCar(int age) {
        return age >= 25;
    }

    public static boolean isValidPasswordLength(String password) {
        return password.length() >= 8;
    }

    public static boolean needsOilChange(int mileage, int lastChangeMileage) {
        return (mileage - lastChangeMileage) >= 5000;
    }

    public static String getDivisibleByThreeMessage(int number) {
        return (number % 3 == 0) ? "Divisible by 3" : "";
    }

    public static String getLeapYearMessage(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "Leap Year" : "Not Leap Year";
    }

    public static String getTicketPriceCategory(int age) {
        if (age < 5) {
            return "Free";
        } else if (age <= 12) {
            return "Child Price";
        } else if (age <= 21) {
            return "Student Price";
        } else {
            return "Adult Price";
        }
    }
}
