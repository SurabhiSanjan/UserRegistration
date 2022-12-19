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
            boolean valid = Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
            if (valid) {
                System.out.println("You have entered valid First Name");
            } else {
                try {
                    throw new InvalidException("Invalid Name");
                } catch (InvalidException e) {
                    e.printStackTrace();
                }
            }
            return valid;
        }

        public boolean testLastName(String lastName) {
            boolean valid = Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
            if (valid) {
                System.out.println("You have entered valid Last Name");
            } else {
                try {
                    throw new InvalidException("Invalid Name");
                } catch (InvalidException e) {
                    e.printStackTrace();
                }
            }
            return valid;

        }
        public boolean testEmailAddress(String email) {
            String emailPattern = "^[a-z0-9]{3,}[+.-]?[a-z0-9]{0,}[@]{1}[a-z0-9]{1,}[.]{1}([a-z]{0,}[.]{0,})[a-z]{2,}$";

            boolean valid = Pattern.matches(emailPattern, email);
            if (valid) {
                System.out.println("Entered valid Email Address");
            } else {
                try {
                    throw new InvalidException("Invalid Email");
                } catch (InvalidException e) {
                    e.printStackTrace();
                }
            }
            return valid;
        }

        public boolean testMobileNumber(String mobileNumber) {
            String mobileNumberPattern = "^(91)[ ]{1}[1-9]{1}[0-9]{9}$";
            boolean vaild = Pattern.matches(mobileNumberPattern, mobileNumber);
            if (vaild) {
                System.out.println("You have entered valid Mobile Number");
            } else {
                try {
                    throw new InvalidException("Invalid Mobile Number");
                } catch (InvalidException e) {
                    e.printStackTrace();
                }
            }
            return vaild;
        }

        public Boolean testPassword(String password) {
            String passwordPattern = "^[0-9]{1,}[!@#$%^&]{1,}[A-z]{1,}[a-zA-Z0-9]{5,}$";
            boolean valid = Pattern.matches(passwordPattern, password);
            if (valid) {
                System.out.println("You have entered valid Password");
            } else {
                try {
                    throw new InvalidException("Invalid Password");
                } catch (InvalidException e) {
                    e.printStackTrace();
                }
            }
            return valid;
        }
}