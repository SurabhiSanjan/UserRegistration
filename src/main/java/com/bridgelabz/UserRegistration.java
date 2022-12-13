package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration!!!");
        UserRegistration ur = new UserRegistration();
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        ur.testFirstName(firstName);

        System.out.println("Please enter your Last Name: ");
        String lastName = sc.nextLine();
        ur.testLastName(lastName);

        System.out.println("Please enter your Email Address: ");
        String email = sc.nextLine();
        ur.testEmailAddress(email);

        System.out.println("Please enter your Mobile Number: ");
        String mobileNumber = sc.nextLine();
        ur.testMobileNumber(mobileNumber);

        System.out.println("Please enter your Password: ");
        String password = sc.nextLine();
        ur.testPassword(password);
    }
        public boolean testFirstName(String firstName) {
            boolean a = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
            if (a) {
                System.out.println("You have entered valid First Name");
            } else {
                System.out.println("Entered First Name is invalid");
            }
            return a;
        }

        public boolean testLastName(String lastName) {
            boolean lastNameChk = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
            if (lastNameChk) {
                System.out.println("You have entered valid Last Name");
            } else {
                System.out.println("Entered Last Name is invalid");
            }
            return lastNameChk;

        }
        public boolean testEmailAddress(String email) {
            String emailPattern = "^[a-z0-9]{3,}[+.-]?[a-z0-9]{0,}[@]{1,}[a-z0-9]{1,}[.]{1,}([a-z]{0,}[.]{0,})[a-z]{2,}$";
            boolean emailChk = Pattern.matches(emailPattern, email);
            if (emailChk) {
                System.out.println("Entered valid Email Address");
            } else {
                System.out.println("Entered Email Address is invalid");
            }
            return emailChk;
        }

        public boolean testMobileNumber(String mobileNumber) {
            String mobileNumberPattern = "^(91)[ ]{1}[1-9]{1}[0-9]{9}$";
            boolean mobileChk = Pattern.matches(mobileNumberPattern, mobileNumber);
            if (mobileChk) {
                System.out.println("You have entered valid Mobile Number");
            } else {
                System.out.println("Entered  Mobile Number is invalid");
            }
            return mobileChk;
        }

        public boolean testPassword(String password) {
            String passwordPattern = "^[0-9]{1,}[!@#$%^&]{1,}[A-z]{1,}[a-zA-Z0-9]{5,}$";
            boolean passwordChk = Pattern.matches(passwordPattern,password);
            if (passwordChk) {
                System.out.println("You have entered valid Password");
            } else {
                System.out.println("Entered Password is invalid ");
            }
            return passwordChk;

        }


}