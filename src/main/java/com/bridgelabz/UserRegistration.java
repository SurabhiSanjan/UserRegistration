package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration!!!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName=sc.next();
        boolean res= Pattern.matches("^[A-Z][A-Za-z]{2,}$", firstName);
        if(res) {
            System.out.println("You have entered valid First Name");
        }else {
            System.out.println("Entered First Name is invalid");
        }

        System.out.println("Enter Last Name: ");
        String lastName = sc.next();
        boolean res1 = Pattern.matches("^[A-Z][A-Za-z]{2,}$", lastName);
        if (res1) {
            System.out.println(" You have entered valid Last Name");
        } else {
            System.out.println("Entered Last Name is invalid");

            System.out.println("Enter your Email Address: ");
            String email = sc.next();
            String emailPattern="^[a-z0-9]{3,}[+.-]?[a-z0-9]{0,}[@]{1,}[a-z0-9]{1,}[.]{1,}([a-z]{0,}[.]{0,})[a-z]{2,}$";
            boolean emailCheck = Pattern.matches(emailPattern, email);
            if (emailCheck) {
                System.out.println("Entered valid Email Address");
            } else {
                System.out.println("Entered Email Address is invalid");
            }
        }

        System.out.println("Enter your Mobile Number: ");
        String mobileNumber = sc.next();
        String mobileNumberPattern="^(91)[ ]{1}[1-9]{1}[0-9]{9}$";
        boolean mnCheck = Pattern.matches(mobileNumberPattern, mobileNumber);
        if (mnCheck) {
            System.out.println("You have entered valid Mobile Number");
        } else {
            System.out.println("Entered  Mobile Number is invalid");
        }

        System.out.println("Enter your Password: ");
        String password = sc.nextLine();
        String passwordPattern="^[0-9]{1,}[!@#$%^&]{1,}[A-z]{1,}[a-zA-Z0-9]{5,}$";
        boolean passwordCheck = Pattern.matches(passwordPattern,password);
        if (passwordCheck) {
            System.out.println("You have entered valid Password");
        } else {
            System.out.println("Entered Password is invalid ");
        }
    }
}