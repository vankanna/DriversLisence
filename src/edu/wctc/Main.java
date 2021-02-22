package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MissingNameException, InvalidBirthdayException, UnknownGenderCodeException {

        // utilities
        MonthDayGenderUtility mdgUtility = new MonthDayGenderUtility();
        FirstNameUtility fnUtility = new FirstNameUtility();
	// write your code here
        Scanner sc = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Welcome to the Drivers License Generator");
        System.out.println("Please enter your first name.");
        String firstName = sc.nextLine();
        System.out.println("Please enter your middle Initial.");
        String middleInitial = sc.nextLine();

        System.out.println("Please enter your last name.");
        String lastName = sc.nextLine();

        System.out.println("Please enter your birth year. example 1990");
        String year = sc.nextLine();

        System.out.println("Please enter your birth month. example 4");
        String month = sc.nextLine();

        System.out.println("Please enter your birth day. example 20");
        String day = sc.nextLine();

        System.out.println("Please enter your sex ( M or F )");
        String gender = sc.nextLine();
        try {
        DriversLicense driversLicense = new DriversLicense();
        driversLicense.setBirthYear(Integer.parseInt(year.substring(year.length() - 2)));
        driversLicense.setSoundexCode(LastNameUtility.encodeLastName(lastName));
        driversLicense.setFirstNameMiddleInitial(fnUtility.encodeFirstName(firstName, middleInitial));
        driversLicense.setBirthMonthDayGender(
                mdgUtility.encodeMonthDayGender(
                        Integer.parseInt(year),
                        Integer.parseInt(month),
                        Integer.parseInt(day),
                        gender.charAt(0)
                )
        );

            WisconsinFormatter wi = new WisconsinFormatter();
            FloridaFormatter fl = new FloridaFormatter();
            System.out.println("Wisconsin: " + wi.formatLicenseNumber(driversLicense));
            System.out.println("Florida: " + fl.formatLicenseNumber(driversLicense));
        } catch (MissingNameException | InvalidBirthdayException  | UnknownGenderCodeException e) {
            e.printStackTrace();
        }

    }
}
