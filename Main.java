package Application_Writer;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();

        String name;
        String school_name;
        String problem;
        String district;
        byte grade;
        byte days;

        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();

        System.out.println("What's your name: ");
        name = scn.nextLine();
        System.out.println("What's your school name: ");
        school_name = scn.nextLine();
        System.out.println("What's your problem: ");
        problem = scn.nextLine();
        System.out.println("In which district do you live: ");
        district = scn.nextLine();
        System.out.println("In which class do you study: ");
        grade = scn.nextByte();
        System.out.println("For how many days: ");
        days = scn.nextByte();

        System.out.println(year + "/" + month + "/" + day);
        System.out.println(school_name);
        System.out.println(district);
        System.out.println("Dear Ma`am");
        System.out.println("I am a student of class " + grade + " in your school");
        System.out.println("I want to say that " + problem + " so kindly grant my leave for " + days);
        System.out.println("Thank you for your understanding and support.");
        System.out.println("- " + name);
        scn.close();
    }
}