package Day23_UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC3 {
        static Scanner input = new Scanner(System.in);


        public static void firstNameValidation() {
            System.out.print("Enter First Name :- ");
            String first_name = input.nextLine();

            String firstNameRegex = "^[A-Z][A-Z a-z]{3,}$";           //first character is Upper case an remaining all either Upper or Lower

            Pattern pattern = Pattern.compile(firstNameRegex);

            Matcher matcher = pattern.matcher(first_name);

            System.out.println("First name pattern matched:- " + matcher.matches());
        }


        public static void lastNameValidation() {
            System.out.print("Enter last Name :-\n ");
            String last_name = input.nextLine();

            String lastNameRegex = "^[A-Z][A-Z a-z]{3,}$";
            Pattern pattern = Pattern.compile(lastNameRegex);

            Matcher matcher = pattern.matcher(last_name);

            System.out.println("Last name pattern matched:- " + matcher.matches());
        }


        public static void emailValidation() {
            System.out.print("\nEnter E-Mail :- ");
            String email = input.nextLine();

            String emailRegex = "^[\\w+-]+(\\.[\\w+-]+)*@[\\w]+(\\.[\\w]+)?(?=(\\.[A-Za-z_]{2,3}$|\\.[a-zA-Z]{2,3}$)).*$";       //email validation using regular expressions.

            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(email);

            System.out.println("E-Mail pattern matched:- " + matcher.matches());
        }


        public static void main(String[] args) {
            firstNameValidation();

            lastNameValidation();

            emailValidation();
        }


    }

