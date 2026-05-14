package com.example;

public class Main {

    public static void printDayMessage(int day) {
        switch (day) {
            case 1:
                    System.out.println("Day of the week: " + "Monday");
                break;
            case 2:
                System.out.println("Day of the week: " + "Tuesday");
                break;
            case 3:
                System.out.println("Day of the week: " + "Wednesday");
                break;
            case 4:
                System.out.println("Day of the week: " + "Thursday");
                break;
            case 5:
                System.out.println("Day of the week: " + "Friday");
                break;
            case 6:
                System.out.println("Day of the week: " + "Saterday");
                break;
            case 7:
                System.out.println("Day of the week: " + "Sunday");
                break;
            default:
                System.out.println("Day of the week: " + "invalid day");
                break;
        }
    }

    public static void main(String[] args) {
        int day = 4;
        printDayMessage(day);
    }
}