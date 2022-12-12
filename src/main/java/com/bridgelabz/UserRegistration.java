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
        }
    }
}