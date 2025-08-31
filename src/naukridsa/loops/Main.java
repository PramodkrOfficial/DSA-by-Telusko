package naukridsa.loops;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int age = sc.nextInt();
            int time = sc.nextInt();
            boolean isHoliday = true;

            System.out.println("Customer Age: " + age);
            System.out.println("Show Time: " + time);
            System.out.println("Holiday? " + isHoliday);

            System.out.println("--------------");

            if (age < 13) {
                System.out.println("Ticket Type: CHILD");
                System.out.println("Final Price: $6");
            } else if (age >= 13 && age <= 17) {
                System.out.println("Ticket Type: TEEN");
                System.out.println("Final Price: $6");
            } else if (age >= 18 && age <= 59) {
                System.out.println("Ticket Type: ADULT");
                System.out.println("Final Price: $17");
            } else {
                System.out.println("Ticket Type: SENIOR");
                System.out.println("Final Price: $8");
            }
        }
        // else {
        //     System.out.println("No input provided!");
        // }

        // sc.close();
    }
}

//import java.util.Scanner;

class Loop {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int time = sc.nextInt();
        boolean isHoliday = true;

        System.out.println("Customer Age: " + age);
        System.out.println("Show Time: " + time);
        System.out.println("Holiday?  " + isHoliday);

        System.out.println("--------------------");

        if (age < 13) {                                    // For Childrens
            System.out.println("Ticket Type: CHILD");
            System.out.println("Final Price: $6");
        } else if (age >= 13 && age <= 17) {               // For Teens
            System.out.println("Ticket Type: TEEN");
            System.out.println("Final Price: $6");
        } else if (age >= 18 && age <=59) {                // For Adults
            System.out.println("Ticket Type: ADULT");
            System.out.println("Final Price: $17");
        } else {
            System.out.println("Ticket Type: SENIOR");
            System.out.println("Final Price: 8");
        }
    }
}
